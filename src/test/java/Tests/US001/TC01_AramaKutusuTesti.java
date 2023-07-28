package Tests.US001;

import Pages.Page;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_AramaKutusuTesti {
    @Test
    public void test01 () {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
}
