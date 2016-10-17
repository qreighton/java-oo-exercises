


public class Course {
	private String name;
	private int credits;
	private int remainingseats;
	private Student[] roster;
	
public Course (String name,int credits, int remainingseats){
	this.name = name;
	this.credits = credits;
	this.remainingseats = remainingseats;
	this.roster = new Student[remainingseats];
 	
}
public int getCredits() {return this.credits;}   
public int getRemainingSeats() {return this.remainingseats;}
public String getName() {return this.name;}

public boolean addStudent(Student student){
	if(this.remainingseats >0){
		for(int i=0; i< this.roster.length; i++){
			
			if(this.roster[i] != null && (this.roster[i]).getName() == ((student).getName())){
				return false;}
		}
		for(int j=0; j< this.roster.length; j++){
			if(this.roster[j] == null){
				this.roster[j] = student;
				this.remainingseats = this.remainingseats-1;
				return true;}
		}
	}
    return false;
}
public String generateRoster(){
	String ros = "";
	for(int i=0; i<this.roster.length; i++){
		if(this.roster[i] != null){
			String ros1 = this.roster[i].getName();
			ros = ros + " " + ros1;}
	}
	return ros;
}
public double averageGPA(){
	double g = 0;
	int g1 = 0;
	for (int i=0; i<this.roster.length; i++){
		if(this.roster[i] !=null){
		    g = g + this.roster[i].getGPA();
			g1 =g1 + 1;}
	}
	return g/g1;
}
public String toString(){
	return "Course = " + this.name + "Credits = " + this.credits;
}
	public static void main(String[] args) {
		

	}

}
