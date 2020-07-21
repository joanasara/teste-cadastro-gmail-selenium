package br.test.telaCadastro.br;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestGoogleEmail {

	
	@Test
	public void criarConta() {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		
		
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().setSize(new Dimension(1200, 760));
         driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%3Fhl%3Dpt-BR&hl=pt-BR&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		 driver.findElement(By.id("firstName")).sendKeys("nome");
		 Assert.assertEquals( "nome",driver.findElement(By.id("firstName")).getAttribute("value"));
		 driver.findElement(By.id("lastName")).sendKeys("sobrenome");
		 Assert.assertEquals("sobrenome",driver.findElement(By.id("lastName")).getAttribute("value") );
		 driver.findElement(By.id("username")).sendKeys("seleniumwebdriveemail@gmail.com");
		 Assert.assertEquals("seleniumwebdriveemail@gmail.com",driver.findElement(By.id("username")).getAttribute("value"));
		 driver.findElement(By.name("Passwd")).sendKeys("09052020");
		 Assert.assertEquals("09052020", driver.findElement(By.name("Passwd")).getAttribute("value"));
		 driver.findElement(By.name("ConfirmPasswd")).sendKeys("09052020");
		 Assert.assertEquals("09052020",driver.findElement(By.name("Passwd")).getAttribute("value"));
		 //CLICK NO ELEMENTO
		 driver.findElement(By.id("accountDetailsNext")).click();
		
		 
		 
	}
	
	
	
}
