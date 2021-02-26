package br.com.concessionaria.modelo;

public class Carro {
	//Sintaxe para os métodos
	// <modificador> <tipo do retorno> 
	//				<nome do metodo> (<tipo do param> <nome do param>){
	
	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;
	
	public String retornarResumo() {
		String strstatus = "Ligado";
		if (status==false) {
			strstatus = "Desligado";
		}
		return "modelo: " + modelo +
				"/nStatus: " + strstatus + 
				"/nVelocidade: " + velocidadeAtual;
		
	}
	
	public void brecar(short velocidade) {
		if (status==true && velocidadeAtual>=velocidade) {
			velocidadeAtual = (short) (velocidadeAtual - velocidade);
		}
	}
	
	public void acelerar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual + velocidade);
		}
	}
	
	public void desligar() {
		status=false;
		velocidadeAtual=0;
	}
	
	public void ligar() {
		status=true;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor=param;
		}
	}
	
	
	
	public String retornarCor() {
		return cor;
	}
	
	public void preencherCor(String param) {
		cor=param;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
