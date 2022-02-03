package suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import test.TesteCadastro;
import test.TesteRegrasCadastro;

@RunWith(Suite.class)
@SuiteClasses({
	TesteCadastro.class,
	TesteRegrasCadastro.class,

})
public class SuiteTeste {
	

	
	@AfterClass
	public static void finalizatudo() {
		DriverFactory.killDriver();
	}
}
