package javagram.filters;


import javagram.Picture;
import java.awt.Color;

public class RainbowFilter implements Filter {

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
		      int newBlue =0;
		      int newGreen = 0;
		      int newRed = 0;
	          if (i%90>0 && i%90<31){
	              newBlue = (r + g + b) / 3;}
	          else if (i%90>30 && i%90<61){
	        	  newGreen = (r + g + b) / 3;}
	          else if (i%90>60 && i%90<91){
	        	  newRed = (r + g + b) / 3;}
	          
		          
	          processed.set(j, i, new Color(newRed, newGreen, newBlue));
		    	  
	      }
	    }
			
		return processed;
	}

}


