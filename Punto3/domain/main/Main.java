package main;

import model.Adicional;
import model.Combo;
import model.Especial;
import model.Papas;
import model.Queso;
import model.Tomate;

public class Main {

	public static void main(String[] args) {
		Adicional queso = new Queso(null, 20);
		Adicional tomate = new Tomate(queso, 20);
		Adicional papas = new Papas(tomate, 10);

		Combo combo1 = new Especial(papas);
		System.out.println(combo1.calcularPrecio());
	}

}
