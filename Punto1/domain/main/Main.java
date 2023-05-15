package main;

import model.Adaptador;
import model.Comun;
import model.Economico;
import model.Electrico;
import model.Motor;

public class Main {

	public static void main(String[] args) {
		Motor comun = new Comun();
		Motor economico = new Economico();
		Motor electrico = new Adaptador(new Electrico());

		comun.arrancar();
		comun.acelerar();
		comun.apagar();
		System.out.println("////////ADAPTADOR////////");
		electrico.arrancar();
		electrico.acelerar();
		electrico.apagar();

	}

}
