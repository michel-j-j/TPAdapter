package model;

public class Comun implements Motor {

	@Override
	public void arrancar() {
		System.out.println("Arrancar");

	}

	@Override
	public void acelerar() {

		System.out.println("Acelerar");

	}

	@Override
	public void apagar() {
		System.out.println("Apagar");

	}

}
