package week1.day1;

public class Browser {
	public String launchBrowser(String BrowserName) {
		System.out.println(BrowserName + " Browser launched sucessfully");
		return BrowserName;
	}
    public void loadUrl() {
    	System.out.println("Application Url load sucessfully");
    }
    
	public static void main(String[] args) {
		Browser br=new Browser();
		br.launchBrowser("chrome");
		br.loadUrl();
		
		}

	}


