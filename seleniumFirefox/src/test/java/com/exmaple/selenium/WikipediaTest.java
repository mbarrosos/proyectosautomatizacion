package com.exmaple.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe;

public class WikipediaTest {
	
	private WebDriver driver;
	
	@Before
	public void inicializarDriver() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void test() {
		//Entrar a plataforma km choucair y buscar curso Gestión de Riesgos
		String usuario = "mbarrosos";
		String password = "Mede789*";
		String nombreCursoBuscar = "Diagrama de Pareto";
		driver.get("http://km.choucairtesting.com");
		
		WebElement campoUsuario = driver.findElement(By.id("username"));
		WebElement campoPass = driver.findElement(By.id("password"));
		
		campoUsuario.sendKeys(usuario);
		campoPass.sendKeys(password);
		WebElement botonIngresar = driver.findElement(By.id("loginbtn"));		
		botonIngresar.click();
		
		
		WebElement linkAreaPersonal = driver.findElement(By.id("label_2_2"));
		linkAreaPersonal.click();
		
		
		///aqui voy 
		
	
		/*WebElement curso = driver.findElement(By.id("yui_3_17_2_1_1548364126174_100"));
		curso.click();*/
	
		
		//WebElement nombreCurso = driver.findElement(By.className("sectionname"));
		WebElement nombreCurso = driver.findElement(By.cssSelector("#inst3060 > div:nth-child(2) > a:nth-child(1) > h2:nth-child(1)"));
		nombreCurso.click();
		
		WebElement ncurso = driver.findElement(By.cssSelector("#section-0 > div:nth-child(4) > h3:nth-child(1) > span:nth-child(1)"));
		
		
		assertEquals(nombreCursoBuscar, ncurso.getText());
				
		/*String palabraBuscar = "Colombia";
		driver.get("https://es.wikipedia.org");
		WebElement campoBusqueda = driver.findElement(By.id("searchInput"));
		WebElement botonBusqueda = driver.findElement(By.id("searchButton"));
		
		campoBusqueda.sendKeys(palabraBuscar);
		botonBusqueda.click();		
		WebElement titulo = driver.findElement(By.id("firstHeading"));
		
		assertEquals(palabraBuscar, titulo.getText());*/
		
	}
	/*
	@After
	public void cerrarDriver() {
		driver.quit();
	}*/
}
