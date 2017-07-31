package br.edu.ifpi.converteromanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {
	private Map<String,Integer> romanos = new HashMap<>();
	
	public ConversorDeNumeroRomano() {
		iniciaRomanos(romanos);
	}
	
	public int converte(String valor) {
		String[] numeros = valor.split("");
		if(validaRomanos(numeros)){
			int soma = romanos.get(numeros[0]);
			for (int i = 1; i < numeros.length; i++) {
				if(romanos.get(numeros[i]) <= romanos.get(numeros[i-1])){
					soma+=romanos.get(numeros[i]);
				}else{
					soma+=romanos.get(numeros[i])-romanos.get(numeros[i-1])*2;
				}
			}
			return soma;
		}else{
			return 0;
		}
	}
	
	private boolean validaRomanos(String[] numeros) {
		int contI=0,contV=0,contX=0,contL=0,contC=0,contD=0,contM=0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i].equals("I")) contI++;
			if(numeros[i].equals("V")) contV++;
			if(numeros[i].equals("X")) contX++;
			if(numeros[i].equals("L")) contL++;
			if(numeros[i].equals("C")) contC++;
			if(numeros[i].equals("D")) contD++;
			if(numeros[i].equals("M")) contM++;
		}
		if(contI>3 || contV>1 || contX>3 || contL>1 || contC>3 || contD>1 ||
				contM>3) return false;
		return true;
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
