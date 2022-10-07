package BaseFunction;//import java.util.*;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.apache.maven.surefire.api.event.StandardStreamOutEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartBrowser {

    public static WebDriver start(String url) {
        System.out.println("Step -> Opening Browser");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Step -> Opening " + url + " url");
        driver.get(url);

        return driver;
    }

    public static WebDriver firefoxStart(String url) {
        System.out.println("Step -> Opening Browser");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println("Step -> Opening " + url + " url");
        driver.get(url);

        return driver;
    }
}
