package system;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import pages.FotoGaleriasPage;

public class NewsLettersSteps {
	
	@Dado("^que acesse o site \"([^\"]*)\"\\.$")
	public void que_acesse_o_site(String urlSite) {
		TestRule.getDriver().get(urlSite);
		Utils.logInfo("Acesse o site "+urlSite);
	}
	
	@Entao("^validar numero (\\d+) fotografias area recomendados\\.$")
	public void validar_numero_fotografias_area_recomendados(int valorRecomendados) throws InterruptedException {
		FotoGaleriasPage  fotoGaleriasPage = new FotoGaleriasPage();
		boolean validarRecomendados = fotoGaleriasPage.Recomendadas(valorRecomendados);
		if (validarRecomendados) {
			Utils.logPass("validar 6 fotografias area recomendados OK!");
		}else {
			Utils.logFail("validar 6 fotografias area recomendados NOK!");
		}
		Assert.assertTrue("Falha na validacao Recomendados", validarRecomendados );
	}
	
	@Entao("^validar numero (\\d+) fotografias area mais vistas\\.$")
	public void validar_numero_fotografias_area_mais_vistas(int valorMaisVistos) {
		FotoGaleriasPage  fotoGaleriasPage = new FotoGaleriasPage();
		boolean validarMaisVistas = fotoGaleriasPage.MaisVistas(valorMaisVistos);
		if (validarMaisVistas) {
			Utils.logPass("validar 3 fotografias area mais vistas OK!");
		}else {
			Utils.logFail("validar 3 fotografias area mais vistas NOK!");
		}
		Assert.assertTrue("Falha na validacao Mias Vistas", validarMaisVistas );
	}
	
	@Dado("^validar opcao defaut de selecao \"([^\"]*)\"\\.$")
	public void validar_opcao_defaut_de_selecao(String valorDefaut) {
		FotoGaleriasPage  fotoGaleriasPage = new FotoGaleriasPage();
		boolean validarSelecao = fotoGaleriasPage.validarSelecao(valorDefaut);
		if (validarSelecao) {
			Utils.logPass("validar opcao defaut de selecao 'Todas' OK!");
		}else {
			Utils.logFail("validar opcao defaut de selecao 'Todas' NOK!");
		}
		Assert.assertTrue("Falha na validacao Default Select", validarSelecao );
	}
	
	@Entao("^selecionar \"([^\"]*)\" Select ultimas de\\.$")
	public void selecionar_Select_ultimas_de(String selecao) {
		FotoGaleriasPage  fotoGaleriasPage = new FotoGaleriasPage();
		fotoGaleriasPage.selectUltimas(selecao);
		Utils.logInfo("Selecionar a opcao "+selecao);
	}
	
	@Dado("^validar numero (\\d+) fotografias area ultimas de\\.$")
	public void validar_numero_fotografias_area_ultimas_de(int valorUltima) {
		FotoGaleriasPage  fotoGaleriasPage = new FotoGaleriasPage();
		boolean validarAreaUltima = fotoGaleriasPage.Ultima_de(valorUltima);
		if (validarAreaUltima) {
			Utils.logPass("3 fotografias area ultimas de OK!");
		}else {
			Utils.logFail("3 fotografias area ultimas de NOK!");
		}
		Assert.assertTrue("Falha na validaÃ§Ã£o Ultima de", validarAreaUltima );
	}
}
