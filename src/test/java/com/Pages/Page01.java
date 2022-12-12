package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Page01 extends BasePage {

    // Registro
    protected static final String clickRegister = "//*[@id=\"loginPanel\"]/p[2]/a"; //Xpath
    protected static final String formFistName = "//*[@id=\"customer.firstName\"]"; //Xpath
    protected static final String formLastName = "//*[@id=\"customer.lastName\"]"; //Xpath
    protected static final String formAddress = "//*[@id=\"customer.address.street\"]"; //Xpath
    protected static final String formCity = "//*[@id=\"customer.address.city\"]"; //Xpath
    protected static final String formState = "//*[@id=\"customer.address.state\"]"; //Xpath
    protected static final String formZipCode = "//*[@id=\"customer.address.zipCode\"]"; //Xpath
    protected static final String formPhone = "//*[@id=\"customer.phoneNumber\"]"; //Xpath
    protected static final String formSsn = "//*[@id=\"customer.ssn\"]"; //Xpath
    protected static final String formUsername = "//*[@id=\"customer.username\"]"; // Xpath
    protected static final String formPassword = "//*[@id=\"customer.password\"]"; // Xpath
    protected static final String formConfirm = "//*[@id=\"repeatedPassword\"]"; // Xpath
    protected static final String formClickConfirm = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"; // Xpath
    protected static final String formVerifyTextSuccess = "//*[@id=\"rightPanel\"]/p"; // Xpath

    // Abertura de nova conta
    protected static final String clickOpenNewAccount = "//*[@id=\"leftPanel\"]/ul/li[1]/a"; // Xpath
    protected static final String typeAccount = "//*[@id=\"type\"]"; // Xpath
    protected static final String clickSavings = "//*[@id=\"type\"]/option[2]"; // Xpath
    protected static final String clickButtonOpenNewAccount = "//*[@id=\"rightPanel\"]/div/div/form/div/input"; // Xpath
    protected static final String verifyTextSuccess = "//*[@id=\"rightPanel\"]/div/div/p[1]"; // Xpath

    // Visão geral das contas
    protected static final String overview = "//*[@id=\"leftPanel\"]/ul/li[2]/a"; // Xpath
    protected static final String verifyOverviewText = "//*[@id=\"accountTable\"]/tfoot/tr/td"; // Xpath

    // Transferir Fundos
    protected static final String transferFunds = "//*[@id=\"leftPanel\"]/ul/li[3]/a"; // Xpath
    protected static final String verifyTextTransferFunds = "//*[@id=\"rightPanel\"]/div/div/h1"; // Xpath
    protected static final String amount = "//*[@id=\"amount\"]"; // Xpath
    protected static final String toAccount = "//*[@id=\"toAccountId\"]"; // Xpath
    protected static final String changeToAccount = "//*[@id=\"toAccountId\"]/option[2]"; // Xpath
    protected static final String clickTransfer = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input"; // Xpath
    protected static final String verifyTextTransferComplete = "//*[@id=\"rightPanel\"]/div/div/h1"; // Xpath

    // Atividades da conta (todos os meses)
    protected static final String accountsOverview = "//*[@id=\"leftPanel\"]/ul/li[2]/a"; // Xpath
    protected static final String verifyText = "//*[@id=\"accountTable\"]/tfoot/tr/td"; // Xpath
    protected static final String  = ""; // Xpath
    protected static final String  = ""; // Xpath
    protected static final String  = ""; // Xpath
    protected static final String  = ""; // Xpath
    protected static final String  = ""; // Xpath

    // Testes back-end API Rest:


    // Métodos de registro
    public void AccountRegister (){
        WebElement register = getWebElement(By.xpath(clickRegister));
        register.click();
    }

    public void sessaoRegistro (String primeiroNome, String ultimoNome, String endereco, String cidade, String estado, String zipCode,
                                String telefone, String ssn, String nome, String senha, String confirmarSenha){

        WebElement firstName = getWebElement(By.xpath(formFistName));
        firstName.clear();
        firstName.sendKeys(primeiroNome);

        WebElement lastName = getWebElement(By.xpath(formLastName));
        lastName.clear();
        lastName.sendKeys(ultimoNome);

        WebElement address = getWebElement(By.xpath(formAddress));
        address.clear();
        address.sendKeys(endereco);

        WebElement city = getWebElement(By.xpath(formCity));
        city.clear();
        city.sendKeys(cidade);

        WebElement state = getWebElement(By.xpath(formState));
        state.clear();
        state.sendKeys(estado);

        WebElement code = getWebElement(By.xpath(formZipCode));
        code.clear();
        code.sendKeys(zipCode);

        WebElement telephone = getWebElement(By.xpath(formPhone));
        telephone.clear();
        telephone.sendKeys(telefone);

        WebElement inputSsn = getWebElement(By.xpath(formSsn));
        inputSsn.clear();
        inputSsn.sendKeys(ssn);

        WebElement inputNome = getWebElement(By.xpath(formUsername));
        inputNome.clear();
        inputNome.sendKeys(nome);

        WebElement password = getWebElement(By.xpath(formPassword));
        password.clear();
        password.sendKeys(senha);

        WebElement passwordConfirm = getWebElement(By.xpath(formConfirm));
        passwordConfirm.clear();
        passwordConfirm.sendKeys(confirmarSenha);
    }

    public void getClickRegister (){
        WebElement clickRegister = getWebElement(By.xpath(formClickConfirm));
        clickRegister.click();
    }

    public String getVerifyTextSuccess(){
        WebElement identificarTextoDeSucesso = getWebElement(By.xpath(formVerifyTextSuccess));
        return identificarTextoDeSucesso.getText();
    }


    // Métodos de Account

    public void openAccount (){
        WebElement account = getWebElement(By.xpath(clickOpenNewAccount));
        account.click();
    }

    public void getClickType (){
        WebElement clickType = getWebElement(By.xpath(typeAccount));
        clickType.click();
    }

    public void getClickSavings (){
        WebElement clickTypeSavings = getWebElement(By.xpath(clickSavings));
        clickTypeSavings.click();
    }

    public void getClickButtonAccount (){
        WebElement clickButtonAccount = getWebElement(By.xpath(clickButtonOpenNewAccount));
        clickButtonAccount.click();
    }

    public String getVerifyText(){
        WebElement identificarTexto = getWebElement(By.xpath(verifyTextSuccess));
        return identificarTexto.getText();
    }


    // Métodos de Visão Geral

    public void getClickOverview (){
        WebElement clickButtonAccount = getWebElement(By.xpath(overview));
        clickButtonAccount.click();
    }

    public String getVerifyOverviewText(){
        WebElement identificarTextoOverview = getWebElement(By.xpath(verifyOverviewText));
        return identificarTextoOverview.getText();
    }


    // Métodos Tranfer Funds

    public void getClickTransferFunds (){
        WebElement tranferFunds = getWebElement(By.xpath(transferFunds));
        tranferFunds.click();
    }

    public String getVerifyTransferFunds(){
        WebElement identificarTexto = getWebElement(By.xpath(verifyTextTransferFunds));
        return identificarTexto.getText();
    }

    public void getClickAmount (String valor){
        WebElement value = getWebElement(By.xpath(amount));
        value.clear();
        value.sendKeys(valor);
    }

    public void getClickToAccount (){
        WebElement clickToAccount = getWebElement(By.xpath(toAccount));
        clickToAccount.click();
    }

    public void getClickChangeAccount (){
        WebElement changeAccount = getWebElement(By.xpath(changeToAccount));
        changeAccount.click();
    }

    public void getClickTranfer (){
        WebElement tranfer = getWebElement(By.xpath(clickTransfer));
        tranfer.click();
    }

    public String getVerifyTextTransferComplete(){
        WebElement identificarTexto = getWebElement(By.xpath(verifyTextTransferComplete));
        return identificarTexto.getText();
    }


    // Métodos de Atividades da conta (todos os meses)


}
