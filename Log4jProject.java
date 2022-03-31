package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jProject {

	public static void main(String[] args) {
		
		
		 Logger log = Logger.getLogger(Log4jProject.class);
       PropertyConfigurator.configure("C:\\selenium\\log4j.properties");
       System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

     driver.get("https://www.google.com");
      log.info("Application started sucessfully");
  
       String expectedtitle="Google";
       String actualtitle=driver.getTitle();    
      log.warn("check status");
           if(expectedtitle.equals(actualtitle))
      {
         System.out.println("Correct Tittle");
         log.info("correct title");
          driver.close();
      }
     else
      {
           System.out.println("incorrect title");
          log.info("Incorrect title");
      }

}
}
