package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public  class page {
    public  page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Ahmet
    @FindBy(id = "twotabsearchtextbox")
    public  WebElement aramaKutusu;
}