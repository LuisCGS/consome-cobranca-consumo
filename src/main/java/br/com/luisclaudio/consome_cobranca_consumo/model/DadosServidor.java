package br.com.luisclaudio.consome_cobranca_consumo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosServidor {
	private String codigoStatus;
	private Double consumoHoras;
	private Double valorCobranca;
	private String mensagem;
	private String mensagemExcecao;
	
	public String getCodigoStatus() {
		return codigoStatus;
	}
	public void setCodigoStatus(String codigoStatus) {
		this.codigoStatus = codigoStatus;
	}
	public Double getConsumoHoras() {
		return consumoHoras;
	}
	public void setConsumoHoras(Double consumoHoras) {
		this.consumoHoras = consumoHoras;
	}
	public Double getValorCobranca() {
		return valorCobranca;
	}
	public void setValorCobranca(Double valorCobranca) {
		this.valorCobranca = valorCobranca;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagemExcecao() {
		return mensagemExcecao;
	}
	public void setMensagemExcecao(String mensagemExcecao) {
		this.mensagemExcecao = mensagemExcecao;
	}
	
	@Override
	public String toString() {
		return "DadosServidor{"
				+ " codigoStatus: " + codigoStatus
				+ ", consumoHoras: " + consumoHoras
				+ ", valorCobranca: " + valorCobranca
				+ ", mensagem: " + mensagem
				+ ", mensagemExcecao: " + mensagemExcecao
				+ "}";
	}
}
