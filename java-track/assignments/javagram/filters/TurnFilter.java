package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class TurnFilter implements Filter {
	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.height(), original.width());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          	                  
	          processed.set(j, i, new Color(r, g, b));
	    	  
	      }
	    }
		
		return processed;
	}

}