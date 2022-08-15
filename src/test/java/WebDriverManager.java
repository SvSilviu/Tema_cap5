import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {


    public static ChromeDriver createChromeDriver() {
        System.setProperty ("webdriver.chrome.driver" ,"src/chromedriver_win32/chromedriver.exe");

        return new ChromeDriver ();
    }


}
