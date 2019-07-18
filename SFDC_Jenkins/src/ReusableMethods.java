

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ReusableMethods {
	static WebDriver driver;
	
	
	
	/*Name of the Method:enterText
	 * Brief Description : Enter text into text box
	 * Arguments :obj-- web object, text-- text to be entered, objname --Name of the object
	 * Created by :AutomationTeam
	 * CreationDate :July 15 2019
	 * LastModified : July 15 2019
	 */
		public static void enterText(WebElement obj, String text, String objName){
			if(obj.isEnabled()){
				obj.sendKeys(text);
				System.out.println("Pass:"+text+" is entered in "+objName+" field");
				
			}else{
				System.out.println("Fail: "+objName +" field is not enabled, please check the application");
			}
		}
		
		/*Name of the Method : ClickButton
		 * Brief Description : Click the object
		 * Arguments :Button-- web object, objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		
		public static void ClickButton(WebElement Button , String objName ){
			if(Button.isEnabled()){
				Button.click();
				System.out.println("Pass: "+objName+ "is clicked");
			}
			else{
				System.out.println("Fail "+objName+" is not enabled,please check the application");
			}
		}
		
		/*Name of the Method : Check Box
		 * Brief Description : Click the object
		 * Arguments :checkbox-- web object, objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		public static void selectCheckBox(WebElement checkbox,String objName){
			if(checkbox.isEnabled()){
				checkbox.click();
				System.out.println("Pass: "+ objName+ "is clicked");
			}else{
				System.out.println("fail "+objName+ "is not enabled");
			}
		}
		
		/*Name of the Method : DeCheck Box
		 * Brief Description : Click the object
		 * Arguments :checkbox-- web object, objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		public static void deSelectCheckBox(WebElement checkbox,String objName){
			if(checkbox.isEnabled()){
				checkbox.click();
				checkbox.click();
				System.out.println("Pass: "+ objName+ "is clicked");
			}else{
				System.out.println("fail "+objName+ "is not enabled");
			}
		}
		
		/*Name of the Method : ValidateTextMessage
		 * Brief Description : Enter text into text box
		 * Arguments :obj-- web object, ExpectedMessage--displays text when username or password is wrong,
		 *  objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		public static void validateTextMessage(WebElement obj,String expectedMessage,String objName){
			String actualMessage;
			if(obj.isEnabled()){
				actualMessage = obj.getText();
				if(actualMessage.equals(expectedMessage)){
					System.out.println("Pass with proper statement");
				}else{
					System.out.println("Expected Message is not matching with actual message");
				}
			}
		}
		
		/*Name of the Method : DropDown
		 * Brief Description : select from dropdown list
		 * Arguments :obj-- web object,objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		
		public static void Dropdown(WebElement obj,String objName){
			if(obj.isEnabled()){
				if(obj.isSelected()){
					System.out.println("Pass"+objName+ "is selected");
				}
			else{
					obj.click();
					System.out.println("Pass: "+ objName+ "is clicked");
				}
				
				
			}else{
				System.out.println("fail "+objName+ "is not enabled");
			}
		}
	}



