package p8; 
 import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import org.openqa.selenium.firefox.FirefoxDriver; import org.openqa.selenium.firefox.*; import org.openqa.selenium.firefox.FirefoxOptions; import org.openqa.selenium.firefox.FirefoxProfile; import org.openqa.selenium.firefox.internal.ProfilesIni; 
 
public class FindAllLinks { 
 	static String driverPath = "C:\\Users\\Usman\\503\\geckodriver.exe";  	public static void main(String[] args) { 
 	 	System.setProperty("webdriver.gecko.driver",driverPath); 
 	 	//NOTE THAT: following commented lines are required for old machines 
 	 	//DesiredCapabilities capabilities = DesiredCapabilities.firefox(); 
     	//capabilities.setCapability("marionette",true); 
     	//ProfilesIni allProfiles = new ProfilesIni(); 
     	//FirefoxProfile fp = new FirefoxProfile(); 
     	//fp.setPreference(FirefoxProfile.PORT_PREFERENCE,"7055"); 
     	//FirefoxOptions options = new FirefoxOptions(); 
     	//options.setProfile(fp); 
 	 	WebDriver driver = new FirefoxDriver();  	 	String appUrl ="https://mail.google.com/mail/"; 
 	 	driver.get(appUrl); 
 
 	 	java.util.List<WebElement> links = driver.findElements(By.tagName("a"));  	 
 
 	 	for (int i = 1; i<links.size(); i=i+1) 
 	 	{ 
 	 	 	System.out.println(links.get(i).getText()); 
 	 	} 
 	 	System.out.println("Total No. of Links: "+links.size()); 
 	 	//driver.quit(); 
 	} 
} 
