package week3Assignments;

public class Excecution extends Buttonsubclass{

	public static void main(String[] args) {
		//object for subclass1
				Buttonsubclass button=new Buttonsubclass();
				button.click();
				button.submit();
				
				//object for subclass2
				TextfieldSubclass2 text= new TextfieldSubclass2();
				text.setText("Welcome from Textfield Subclass2");
				text.click();
				System.out.println(text.getText());
				
				//object for additional subclass1
				
				CheckboxButton check = new CheckboxButton();
				check.click();
				check.clickCheckButton();
				check.submit();
				
				//object for additional subclass2
				RadioButton radio = new RadioButton();
				radio.click();
				radio.selectRadioButton();
				radio.submit();
				radio.setText("have a good day ---> Additional subclass2");
				
				//object for superclass
				WebElement ele=new WebElement();
				ele.click();
		        //ele.submit();	
				
				
			

	}

}
