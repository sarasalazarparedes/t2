package com.example.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {
    private By usernameInput = By.id("sign-username");
    private By passInput = By.id("sign-password");
    private By successAlert = By.id("success-alert");
    private By errorAlert = By.id("danger-alert");

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addEmployee(String username, String password){
        webDriver.findElement(usernameInput).sendKeys(username);
        webDriver.findElement(passInput).sendKeys(password);

    }

    public void clickON(){
        WebElement botonRegistro = webDriver.findElement(By.xpath("//button[contains(@onclick, 'register()')]"));
        botonRegistro.click();

    }

       public boolean isSuccessAlertVisible(){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 3);
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(successAlert)));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isErrorAlertVisible(){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 3);
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(errorAlert)));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
