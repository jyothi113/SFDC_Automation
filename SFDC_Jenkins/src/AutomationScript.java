

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import org.testng.annotations.Test;


public class AutomationScript extends ReusableMethods {
	
	public static void main(String[] args) throws InterruptedException{
		TC_01_LoginErrorMessage();
		//TC_02_Login();
		//TC_03_RememberMe();
		//TC_04A_ForgotPassword();
		//TC_04B_ForgotPassword();
	}
	
	
	
	public static void TC_01_LoginErrorMessage(){
		System.out.println("Login ErrorMessage");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		enterText(userName, "jyothipraveena194-xzax@force.com","UserName" );
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		passWord.clear();
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		ClickButton(loginButton,"Login");
		
		WebElement ErrorMessage=driver.findElement(By.xpath("//div[@id='error']"));
		validateTextMessage(ErrorMessage,"Please enter your password.","ErrorMessage");
		
	}
		public static void TC_02_Login(){
		System.out.println("Login");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		enterText(userName, "jyothipraveena194-xzax@force.com","UserName" );
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		enterText(passWord, "Salesforce123*","PassWord" );
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		ClickButton(loginButton,"Login");
	}
		
		
		public static void TC_03_RememberMe() throws InterruptedException{
			System.out.println("RememberMe");
			System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothipraveena194-xzax@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
			
			WebElement RemembermeCheckbox =driver.findElement(By.xpath("//input[@id='rememberUn']"));
			selectCheckBox(RemembermeCheckbox,"RememberMe");
			
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			
			WebElement UserMenudropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Dropdown(UserMenudropdown,"userName");
			
			Thread.sleep(4000);
			//Actions UserNameLabellink = new Actions(driver);
			//UserNameLabellink.moveToElement(UserMenudropdown).build().perform();
			
			
			WebElement logOutButton = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(logOutButton,"Logout");
			
			
		}
		
		
		public static void TC_04A_ForgotPassword() throws InterruptedException{
			System.out.println("ForgotPassword");
			System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			
			
			WebElement forgotPassWord = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
			ClickButton(forgotPassWord,"ForgotPassword");
			
			
			System.out.println("Salesforce Forgot Password page is displayed");
				
		
			WebElement UserNameinForgotPassword = driver.findElement(By.id("un"));
			enterText(UserNameinForgotPassword,"jyothipraveena194-xzax@force.com","email" );
				
				WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
				ClickButton(ContinueButton,"Continue");
				System.out.println("Password Reset message is dispalyed and email is sent");
		}
		
		public static void TC_04B_ForgotPassword(){
			System.out.println("04B_ForgotPassword");
			System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "123","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "22131","PassWord" );
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			System.out.println("Error message is displayed");
			
			WebElement ErrorMessage=driver.findElement(By.xpath("//div[@id='error']"));
			validateTextMessage(ErrorMessage,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.","ErrorMessage");
		}
	
		
	}	
	
	
		
	





	


