import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JPanel {

private JButton LoadButton;
private JButton SortButton;
	private Button() {
		LoadButton = new JButton("Load Shapes");
		this.add(LoadButton);
		LoadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadShapes();
				repaint();
			}
		});
		
	
		SortButton = new JButton("Sort Shapes");
		this.add(SortButton);
		SortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SortingTechnique.sort(shapes);
				//SortingTechnique.sort(shapes);
				//System.out.println("After:  " + shapes.toString());
				//loadShapes(); 
			repaint();
			}
		});

	}

	public List<Shape> shapes = new ArrayList<>();

	public void loadShapes() {
		shapes.clear();
		for (int i = 0; i < 6; i++) {
			shapes.add(ShapeFactory.LoadShapes());
			//System.out.println(" Before: " + shapes.toString());
			
		}
	}

	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (Shape shape : shapes) {
			shape.drawShape(g2d);
		}
	}

	public final static Button instance = new Button();

	public static Button getInstance() {
		return instance;
	}

}
