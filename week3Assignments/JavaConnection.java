package week3Assignments;
//inheriting from super class
public class JavaConnection extends Mysqlconnection {

	
//unimplemented methods
	@Override
	public void connect() {
		System.out.println("connected to database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from database");
		
	}

	@Override
	public void excuteupdate() {
		System.out.println("updatation was excecuted");
		
	}
	public static void main(String[] args) {
		JavaConnection java=new JavaConnection();
		//calling methods
	    java.connect();
	    java.disconnect();
	    java.excuteupdate();
	    java.excecutequery();

	}
}
