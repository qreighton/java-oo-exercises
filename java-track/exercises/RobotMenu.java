import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
     private ArrayList<Robot>robots;
     private Scanner r;
     
     
	public static void main(String[] args) {
		int x=0;
		RobotMenu rob = new RobotMenu();
		do{
			x = rob.startMenu();
			rob.processInput(x);
		While (x != 6);}
	
    }
    public RobotMenu () {
    	rob = new Scanner(System.in);
    	robots = new ArrayList<robots>{};
    }
    public int startMenu() {
    	System.out.println("1. Create a robot");
    	System.out.println("2. Display list of available robots");
    	System.out.println("3. Move a robot");
    	System.out.println("4. Rotate a robot");
    	System.out.println("5. Compute the distance between two robots");
    	System.out.println("6. Exit");
    	int selection = rob.nextInt();
    	While(selection < 0 || selection > 6) {
    		System.out.println("invalid selection");
    		selection = rob.nextInt();}
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
    		int speed = rob.nextInt();
    		while(speed<1){
    			System.out.println("must be more than 0");
    			speed = rob.nextInt();}
    		rob.setSpeed(speed);}
    	else if (selection ==4) {
    		System.out.println("Which direction");
    		int dir =rob.nextInt();
    		while (dir < 1 || dir > 4){
    			System.out.println("invalid selection");
    			dir = rob.nextInt();}
    		if (dir ==1){
    			rob.setOrientation("North");}
    		else if (dir ==2){
    			rob.setOrientation("South");}
    		else if (dir ==3){
    			rob.setOrientation("East");}
    		else if (dir ==4){
    			rob.setOrientation("West");}
    	}
    	else if (selection ==5){
    		System.out.println("Pick robot 1");
    		int robot1 =rob.nextInt();
    		System.out.println("Pick robot 2");
    		int robot2 =rob.nextInt();
    		
    		}
    		
    		
    	}
    }
    private void displayRobot(){
    	for (int i =0; i<robots.size(); i++){
    		System.out.println((i+1)+".)"+robots.get(i));
    	}
    }
    private Robot selectRobot(){
    	System.out.println("select robot");
    	int selection = rob.nextInt();
    	while(selection<1 || selection>robot.size()) {
    		System.out.println("invalid");
    		selection= rob.nextInt();}
    	return robots.get(selection-1);
    }
    private void createRobot() {
    	System.out.println("enter name");
    	String name=rob.next();
    	System.out.prntline("enter x position");
    	int posx = rob.nextInt();
    	System.out.println("enter y position");
    	int posy = rob.nextInt();
    	System.out.prntline("enter speed");
    	int speed = rob.nextInt();
    	System.out.prntline("enter orientation");
    	int orient = rob.nextInt();
    	robots.add(new Robot(name,posx,posy,speed,orient));
    }
    	
    	
    	}
    }