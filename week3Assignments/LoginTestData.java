package week3Assignments;
//inheriting super class
public class LoginTestData extends TestData {
	public void enterUsername()
    {
        System.out.println("Entering username from LoginTestData--->subclass");
    }
    public void enterPassword() 
    {
        System.out.println("Entering password from LoginTestData--->subclass");
    }
	public static void main(String[] args) {
		//creating object and calling super class and subclass
		LoginTestData call=new LoginTestData();
		call.enterUsername();
		call.enterPassword();
		call.enterCredentials();
		call.navigateToHomePage();
		
	}
	
}
