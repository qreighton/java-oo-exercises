
public class Robot  {
	private String name;
	private int positionx;
	private int positiony;
	private int speed;
	private String orientation;
	
public Robot(String name,int positionx,int positiony,int speed,String orientation)
{
	this.name = name;
	this.positionx = positionx;
	this.positiony = positiony;
	this.speed = speed;
	this.orientation = orientation;
}
public String getName(){return this.name;}
public int getPositionx(){return this.positionx;}
public int getPositiony(){return this.positiony;}
public int getSpeed(){return this.speed;}
public String getOrientation(){return this.orientation;}

public void move()
{
	if (this.orientation == "North"){
			this.positionx = this.positionx - this.speed;
			return;
	}
	if (this.orientation == "South"){
			this.positionx = this.positionx + this.speed;
			return;
	}
	if (this.orientation == "East"){
			this.positiony = this.positiony - this.speed;
			return;
	}
	if (this.orientation == "West"){
			this.positiony = this.positiony + this.speed;
			return;
	}
}

public void rotate(String direction){
	
	if (direction=="right"){
         if (this.orientation == "North"){
    	     this.orientation = "East";
    	     return;
    }
         if (this.orientation == "South"){
    	     this.orientation = "West";
    	     return;
    }
         if (this.orientation == "East"){
    	     this.orientation = "South";
    	     return;
    }
         if (this.orientation == "West"){
    	     this.orientation = "North";
    	     return;
    }
	}	     
    if (direction=="left"){
    	 if (this.orientation == "North"){
    		 this.orientation = "West";
    		 return; 
    	 }
    	 if (this.orientation == "South"){
    		 this.orientation = "East";
       	     return;    	 
    	 }
    	 if (this.orientation == "East"){
    		 this.orientation = "North";
    		 return;
       	 }
    	 if (this.orientation == "West"){
    		 this.orientation = "South";
    		 return;
       	 }
    }
}
public double distanceFrom(Robot other){
	double a = other.getPositionx();
	double b = other.getPositiony();
	double c = this.positionx;
	double d = this.positiony;
	return Math.sqrt((d-b)*(d-b)+(c-a)*(c-a));
}
public void speed(int change){
	this.speed = change;
	return;
}
public String toString(){
	return "name= " + this.name + " position= " + this.positionx + " , " + this.positiony 
			        + " speed= " + this.speed + " orientattion= " + this.orientation;
}
	public static void main(String[] args) {
		Robot robot1 = new Robot("robby",0,0,0,"East");
		Robot robot2 = new Robot("snobby",0,0,0,"East");
		
		robot1.rotate("right");
		robot1.speed(5);
		robot1.move();
		System.out.println(robot1.distanceFrom(robot2));
        System.out.println(robot1);
	}

}
