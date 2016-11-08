package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class CrazyFilter implements Filter{
	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          
	          int a = (int)(Math.random()*3+1);
	          
	          int color = (r + g + b) / 3;
	          int newRed = 0;
	          int newGreen = 0;
	          int newBlue = 0;
	          
	          if (a==1){newRed = color;}
	          else if (a==2){newGreen = color;}
	          else if (a==3){newBlue = color;}
	        	
	          
	          processed.set(i, j, new Color(newRed, newGreen, newBlue));
	    	  
	      }
	    }
		
		return processed;
	}

}


