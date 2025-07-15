package week3Assignments;

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
		LoginTestData call=new LoginTestData();
		call.enterUsername();
		call.enterPassword();
		call.enterCredentials();
		call.navigateToHomePage();
		
	}
	
}
