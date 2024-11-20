package stepDef;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestStep extends env_target {

    //* SCENARIO CASE REGISTER *//

    //Scenario case register
    @Given("^User is on sign up page$")
    public void UserIsOnSignUpPage() {
        System.setProperty("webserver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(cermatiLink);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/main/header/div/div[2]/div[2]/div/a[1]/div/div[2]"))
        );

    }

    @Then("^user input field Nomor Handphone$")
    public void UserInputFieldNomorHandphone() {
        driver.findElement(By.xpath("//*[@id='mobilePhone']")).sendKeys("082274027988");
    }

    @And("^user input field email$")
    public void UserInputFieldEmail() {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("yohanacrisma27@gmail.com");
    }

    @And("user input nama depan")
    public void UserInputNamaDepan() {
        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Yohana");
    }

    @And("user input nama belakang")
    public void UserInputNamaBelakang() {
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Crisma");
    }

    @And("user click button daftar")
    public void userClickButtonDaftar() {
        driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/button")).click();
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/main/div/div[2]/div/button"))
        );
        driver.close();
    }
}
