

import javax.swing.JPanel;
import javax.swing.*;



public class MyPanel extends JPanel{
	
  //  public List<Shape> shapes = new ArrayList<>();
	 /* private MyPanel() {
       JButton LoadButton = new JButton("Load Shapes");
        this.add(LoadButton);
        JButton SortButton = new JButton("Sort Shapes");
        this.add(SortButton);
        
        LoadButton.addActionListener( new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                        loadShapes();
                        repaint();
                    }
                }
        );

       
        
        SortButton.addActionListener( new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                    	SortingTechnique.sort(shapes);
                        repaint();
                    }
                }
        );
    }
    */
    
 /*   public void loadShapes() {
        shapes.clear();
        for(int i = 0 ; i < 6; i++) {
            shapes.add(ShapeFactory.LoadShapes());
        }
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for(Shape shape : shapes) {
        	shape.drawShape(g2d);
        }
    }
  */
/*	private MyPanel() {
		
	}
	
    private final static MyPanel instance = new MyPanel();
    public static MyPanel getInstance() {
        return instance;
    }
*/
	
	
/*	JButton LoadButton = new JButton("Load Shapes");
	this.add(LoadButton);
	LoadButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			loadShapes();
			repaint();
		}
	});
	
*/
	//JFrame frame;
	//private MyPanel() {
		
/*		frame = new JFrame("Display Shapes - EECS 3311 - Shiv Patel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(this);
		
		JButton LoadButton = new JButton("Load Shapes");
        this.add(LoadButton);
        JButton SortButton = new JButton("Sort Shapes");
        this.add(SortButton);
        
        LoadButton.addActionListener( new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                        loadShapes();
                        repaint();
                    }
                }
        );

       
        
        SortButton.addActionListener( new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                    	SortingTechnique.sort(shapes);
                        frame.repaint();
                    }
                }
        );
	


	}
	
	
public List<Shape> shapes = new ArrayList<>();

public void loadShapes() {
	shapes.clear();
	for (int i = 0; i < 6; i++) {
		shapes.add(ShapeFactory.LoadShapes());
		System.out.println(" Before: " + shapes.toString());
		
	}
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g;
	for (Shape shape : shapes) {
		shape.drawShape(g2d);
	}
}

*/
	
public static void main(String[] args) {
		JFrame frame = new JFrame("Display Shapes - EECS 3311 - Shiv Patel");	
		//new MyPanel();
		//frame.add(MyPanel.getInstance());
		frame.add(Button.getInstance());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}