
public class StudioOne {
	private int length;
	private int width;
	
public StudioOne (int length,int width)
{
	this.length=length;
	this.width=width;
}
public int getLength(){return this.length;}
public int getWidth(){return this.width;}

public int area(){
	return (this.length*this.width);
}
public int perimeter(){
	return (2*(this.length+this.width));
}
public boolean compare(StudioOne other){
	if ((this.width+this.length)>(other.getWidth()+other.getLength())){
		return "True" ;
	return "False";
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
