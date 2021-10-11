import java.util.Collections;
import java.util.List;

public class SortingTechnique {

	public static void sort(List<Shape> shapes) {
		
		  for(int i = 1; i < shapes.size(); i++) {
	            for(int j = i ; j > 0 ; j--) {
	                if((shapes.get(j).compareTo(shapes.get(j-1))) == -1) {
	            	/* Swaping The X & Y Co-ordinates of shapes*/
	                	int Xi = shapes.get(j).getUpperX();
		                int Yi= shapes.get(j).getUpperY();
	                    int Xj = shapes.get(j-1).getUpperX();
	                    int Yj = shapes.get(j-1).getUpperY();
	                    shapes.get(j-1).setUpperX(Xi);
	                    shapes.get(j-1).setUpperY(Yi);
	                    shapes.get(j).setUpperX(Xj);
	                    shapes.get(j).setUpperY(Yj);
	                    /*Now Swaping the shapes by storing it into a temp Shape*/
	                    Shape temp = shapes.get(j-1);
	                    shapes.set(j-1, shapes.get(j));
	                    shapes.set(j, temp);
	                }
	            }
	        }
		  
		  /* Not Working Without Changing Axis.? */
			/*	
				 for (int j = 1; j < shapes.size(); j++) {
				       Shape temp =shapes.get(j);
				        int i = j-1;
				        while ((i > -1) && ((shapes.get(i).compareTo(temp)) == 1)) {
				        	shapes.set(i+1, shapes.get(i));
				            i--;
				          
				        }
				        shapes.set(i+1, temp);
				        
				    
				        
				    }
			
			*/
	}
}
