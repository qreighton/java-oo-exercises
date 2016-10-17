
public class User {
	
	private String username;
	private String password;
	
	
	public User(String username,String password){
		this.username = username;
		this.password = hashPassword(password);
		static ArrayList<list>Users;
	}
    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    
    public String hashPassword(String password){
    	return password;}
    public boolean isValidPassword(String password){
    	return true;}
    	
    public static boolean isValisUsername(String username){
    	return true;}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
