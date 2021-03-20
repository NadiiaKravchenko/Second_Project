import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFirst {

    WebDriver wb;

    @Test
    public void startgoogle() {
        wb = new ChromeDriver();
        wb.get("https://www.google.co.il/");
        wb.quit();
    }
}
