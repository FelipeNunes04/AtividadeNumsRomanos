package br.edu.ifpi.converteromanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {
	private Map<String,Integer> romanos = new HashMap<>();
	
	public ConversorDeNumeroRomano() {
		iniciaRomanos(romanos);
	}
	
	public int converte(String valor) {
		String numeros[] = valor.split("");
		int soma = romanos.get(numeros[0]);
		for (int i = 1; i < numeros.length; i++) {
			if(romanos.get(numeros[i]) <= romanos.get(numeros[i-1])){
				soma+=romanos.get(numeros[i]);
			}else{
				soma=romanos.get(numeros[i])-romanos.get(numeros[i-1]);
			}
		}
		return soma;
	}
	
	private void iniciaRomanos(Map romanos) {
		romanos.put("I",1);
		romanos.put("V",5);
		romanos.put("X",10);
		romanos.put("L",50);
		romanos.put("C",100);
		romanos.put("D",500);
		romanos.put("M",1000);

	}
}
