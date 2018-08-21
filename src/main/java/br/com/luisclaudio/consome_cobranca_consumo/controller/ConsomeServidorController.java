package br.com.luisclaudio.consome_cobranca_consumo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import br.com.luisclaudio.consome_cobranca_consumo.model.DadosServidor;

public class ConsomeServidorController {
	public static void main(String[] args) {
		final Logger log = LoggerFactory.getLogger(ConsomeServidorController.class);
		RestTemplate restTemplate = new RestTemplate();
		
		final String uuidTeste1 = "123e4567-e89b-12d3-a456-426655440000";
		final String horasConsumidasTeste1 = "10";
		final String uuidTeste2 = "123e4567-e89b-12d3-a456-426655440002";
		final String horasConsumidasTeste2 = "15";
		
		DadosServidor dadosServidorInclusaoTeste1 = restTemplate.getForObject("http://localhost:8080/iniciarConsumo?uuid=" + uuidTeste1 + "&horasConsumidas=" + horasConsumidasTeste1, DadosServidor.class);
		DadosServidor dadosServidorInclusaoTeste2 = restTemplate.getForObject("http://localhost:8080/iniciarConsumo?uuid=" + uuidTeste2 + "&horasConsumidas=" + horasConsumidasTeste2, DadosServidor.class);
		DadosServidor dadosServidorInclusaoExcecaoUUID = restTemplate.getForObject("http://localhost:8080/iniciarConsumo?uuid=Hu3" + uuidTeste1 + "&horasConsumidas=" + horasConsumidasTeste1, DadosServidor.class);
		DadosServidor dadosServidorInclusaoExcecaoHC = restTemplate.getForObject("http://localhost:8080/iniciarConsumo?uuid=" + uuidTeste2 + "&horasConsumidas=" + "Hu3", DadosServidor.class);
		DadosServidor dadosServidor = restTemplate.getForObject("http://localhost:8080/consumoServidor?uuid=" + uuidTeste1, DadosServidor.class);
		DadosServidor dadosServidorExcecao = restTemplate.getForObject("http://localhost:8080/consumoServidor?uuid=Hu3" + uuidTeste1, DadosServidor.class);
		DadosServidor dadosTodosServidor = restTemplate.getForObject("http://localhost:8080/consumoTodosServidores", DadosServidor.class);
		
		log.info(dadosServidorInclusaoTeste1.toString());
		log.info(dadosServidorInclusaoTeste2.toString());
		log.info(dadosServidor.toString());
		log.info(dadosTodosServidor.toString());
		log.info(dadosServidorInclusaoExcecaoUUID.toString());
		log.info(dadosServidorInclusaoExcecaoHC.toString());
		log.info(dadosServidorExcecao.toString());
		
	}
}
