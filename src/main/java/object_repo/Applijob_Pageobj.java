package object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applijob_Pageobj {

    WebDriver driver;
    public Applijob_Pageobj(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

   @FindBy(linkText = "Apply")
    WebElement applybutton;

    @FindBy(name = "ApplicantFirstName")
    WebElement firstname;

    @FindBy(name = "ApplicantSurname")
    WebElement surname;
    @FindBy(name = "ApplicantEmail")
    WebElement email;
    @FindBy(name = "ApplicantMobile")
    WebElement mobilenumber;
    @FindBy(name = "ApplicantMunicipality")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"ApplicantDetailsControl\"]/div[2]/div[1]/div[5]/div/div")
    WebElement uploadfile;
    @FindBy(id = "btnCreateApplication")
    WebElement submit;


    public void clickapply(){
        applybutton.click();

    }
    public void enterfirstname(String fname){
        firstname.sendKeys(fname);
    }
    public void entersurname(String sname){
        surname.sendKeys(sname);
    }
    public  void enteremail(String ename){
        email.sendKeys(ename);
    }
    public void entermobile(String number){
        mobilenumber.sendKeys(number);
    }
    public void entercity(String cname){
        city.sendKeys(cname);

    }
    public void uploaadfiles(String file){
//        WebDriverWait wait = new WebDriverWait(driver, 10.0);
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys(file);

//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input[type='file']")));


    }
    public void submitapp(){
        submit.click();
    }





}
