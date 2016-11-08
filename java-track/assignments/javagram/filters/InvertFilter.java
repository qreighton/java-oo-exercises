package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class InvertFilter implements Filter{
	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.height(); i++) {
	      for (int j = 0; j < original.width(); j++) {
	    	  
	    	  Color c = original.get(j, i);
	          
	          //get color components from each pixel
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          
	          processed.set((original.width()-j-1),i , new Color(r, g, b));
	    	  
	      }
	    }
		
		return processed;
	}

}
