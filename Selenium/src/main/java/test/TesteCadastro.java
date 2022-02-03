package test;

import static core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import page.CampoTreinametoPage;

public class TesteCadastro extends BaseTest {

	
	private CampoTreinametoPage page;

	@Before
	public void inicializa() {

		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoTreinametoPage();
	}



	@Test
	public void deveRealizarCadastroComSucesso() {
		page.setNome("Jonathan");
		page.setSobrenome("Reis");
		page.setSexoMasculino();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();
		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
		Assert.assertEquals("Jonathan",page.obterNomeCadastro());
		Assert.assertEquals( "Reis", page.obterSobrenomeCadastro());
		Assert.assertEquals("Masculino", page.obterSexoCadastro());
		Assert.assertEquals("Pizza", page.obterComidaCadastro());
		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());
		Assert.assertEquals("Natacao", page.obterEsporteCadastro());
	}


}
