import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu extends Robot {
     private ArrayList<Robot>robots;
     private Scanner r;
     
     
	public static void main(String[] args) {
		int x=0;
		RobotMenu rob = new RobotMenu("",0,0,0,"");
		do{
			x = rob.startMenu();
			rob.processInput(x);}
		    while (x != 6);
	
    }
    public RobotMenu (String name,int positionx,int positiony,int speed,String orientation) {
    	super(name,positionx,positiony,speed,orientation);
    	r = new Scanner(System.in);
    	robots = new ArrayList<Robot>();
    }
    public int startMenu() {
    	System.out.println("1. Create a robot");
    	System.out.println("2. Display list of available robots");
    	System.out.println("3. Move a robot");
    	System.out.println("4. Rotate a robot");
    	System.out.println("5. Compute the distance between two robots");
    	System.out.println("6. Exit");
    	int selection = r.nextInt();
    	while(selection < 0 || selection > 6) {
    		System.out.println("invalid selection");
    		selection = r.nextInt();}
    	return selection;
    }
    public void processInput(int selection){
    	if (selection ==1) {
    		createRobot();}
    	else if (selection ==2) {
    		displayRobots(); }
    	else if (selection ==3) {
    		displayRobots();
    		Robot rob = selectRobot();
    		System.out.println("enter speed");
    		int speed = r.nextInt();
    		while(speed<1){
    			System.out.println("must be more than 0");
    			speed = r.nextInt();}
    		rob.setSpeed(speed);}
    	else if (selection ==4) {
    		displayRobots();
    		Robot rob = selectRobot();
    		System.out.println("Which direction");
    		int dir =r.nextInt();
    		while (dir < 1 || dir > 4){
    			System.out.println("invalid selection");
    			dir = r.nextInt();}
    		if (dir ==1){
    			rob.rotate("North");}
    		else if (dir ==2){
    			rob.rotate("South");}
    		else if (dir ==3){
    			rob.rotate("East");}
    		else if (dir ==4){
    			rob.rotate("West");}
    	}
    	else if (selection ==5){
    		displayRobots();
     		System.out.println("Pick robot 1");
     		Robot robot1 = selectRobot();
    		displayRobots();
    		System.out.println("Pick robot 2");
    		Robot robot2 = selectRobot();
    		double dis = disBetween(robot1,robot2);
    		System.out.println(dis);
       	}
    }
    private void displayRobots(){
    	for (int i =0; i<robots.size(); i++){
    		System.out.println((i+1)+".)"+robots.get(i));
    	}
    }
    private Robot selectRobot(){
    	System.out.println("select robot");
    	int selection = r.nextInt();
    	while(selection<1 || selection>robots.size()) {
    		System.out.println("invalid");
    		selection= r.nextInt();}
    	return robots.get(selection-1);
    }
    private void createRobot() {
    	System.out.println("enter name");
    	String name=r.next();
    	System.out.println("enter x position");
    	int posx = r.nextInt();
    	System.out.println("enter y position");
    	int posy = r.nextInt();
    	System.out.println("enter speed");
    	int speed = r.nextInt();
    	System.out.println("enter orientation");
    	String orient = r.toString();
    	robots.add(new Robot(name,posx,posy,speed,orient));
    }
    private double disBetween(Robot robot1,Robot robot2){
    	double a = robot1.getPositionx();
    	double b = robot1.getPositiony();
    	double c = robot2.getPositionx();
    	double d = robot2.getPositiony();
    	return Math.sqrt((d-b)*(d-b)+(c-a)*(c-a));
    }
    	
    	
 }