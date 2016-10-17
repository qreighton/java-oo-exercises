
public class Student {
	private String namef;
	private String namel;
	private int ID;
	private int credits;
	private double GPA;
	private double qualityscore;
			
public Student(String namef,String namel,int ID){
	this.namef = namef;
	this.namel = namel;
	this.ID = ID;
	this.credits = 0;
	this.GPA = 0.0;
	this.qualityscore = 0.0;
}	
public String getName(){return this.namef +" "+ this.namel;}
public int getStudentID(){return this.ID;}
public int getCredits(){return this.credits;}
public double getGPA(){return this.GPA;}

public void setCredits(int credits){this.credits = credits;}
public void setGPA(double GPA) {this.GPA = GPA;}

public String getClassStanding(){
	if(this.credits < 30){
		return "Freshman";}
	else if(this.credits > 29 && this.credits < 60){
		return "Sophomore";}
	else if(this.credits > 59 && this.credits < 90){
		return "Junior";}
	else if(this.credits > 89){
		return "Senior";}
	return "";
}

public void submitGrade(double grade,int credits){
	double qualityscore = grade * credits;
	this.credits = this.credits + credits;
	this.qualityscore = this.qualityscore + qualityscore;
	double a = this.qualityscore / this.credits;
	a =(double)Math.round(a*1000d)/1000d;	
	this.GPA = a;
		
}
public double computeTuition(){
	int ct = this.credits/15 * 20000;
	double ctt = this.credits % 15 * 1333.33;
	return ct + ctt;
}

public Student createLegacy(Student s,Student ss){
	String a = s.getName();
	String b = ss.getName();
	int a1 = s.getStudentID();
	int b1 = ss.getStudentID();
	int a2 = s.getCredits();
	int b2 = ss.getCredits();
	double a3 = s.getGPA();
	double b3 = ss.getGPA();
	if (a2>b2){
		b2 = a2;}
	b3 = (b3+a3)/2;
		Student bb = new Student (a,b,(a1+b1));
		bb.setCredits(b2);
		bb.setGPA(b3);
		return bb;
	}
public String toString(){
	return "Students name" + this.namef + " " + this.namel + " " + "ID" + " " +this.ID;
}
}
