package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.sql.DriverManager.getDriver;

public class BasePage {

    // Título do Caso de Teste: Processo de registro, abertura de nova conta, visão geral das contas, transferir fundos, atividade da conta, para todas as etapas de Testes Front-end


    public static WebDriver driver;
    protected static final String URL = "https://parabank.parasoft.com/parabank/index.htm";

    public BasePage(){
        this.driver = new ChromeDriver();
    }

    public void openApp(){
        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public WebElement getWebElement(By locator){
        WebElement elemento = null;
        try{
            elemento = driver.findElement(locator);
        } catch (Exception e){
            System.out.println("Elemento não encontrado!");
            System.out.println("Mensagem de erro:" + e);
        }
        return elemento;
    }

    public void quitDriver(){
        getDriver().quit();
    }
}
