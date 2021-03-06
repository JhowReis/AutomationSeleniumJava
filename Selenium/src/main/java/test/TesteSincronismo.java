package test;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.DSL;

public class TesteSincronismo {

	private DSL dsl;

	@Before
	public void inicializa(){
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL();
	}
	
	@After
	public void finaliza(){
		killDriver();
	}
	
	@Test
	public void esperaFixa() throws InterruptedException {
		dsl.clicarBotao("buttonDelay");
		Thread.sleep(5000);
		dsl.escrever("novoCampo", "Deu Certo?");
	}
}
//	@Test
//	public void esperaImplicita() throws InterruptedException {
//		dsl.clicarBotao("buttonDelay");
//		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		dsl.escrever("novoCampo", "Deu Certo?");
//	}
//	@Test
//	public void esperaExplicita() throws InterruptedException {
//		dsl.clicarBotao("buttonDelay");
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("novoCampo")));
//		dsl.escrever("novoCampo", "Deu Certo?");
//	}
//}
