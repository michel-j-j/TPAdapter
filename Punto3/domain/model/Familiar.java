package model;

public class Familiar implements Combo {

	private Porcion porcion;

	Familiar(Porcion porcion) {
		this.porcion = porcion;
	}

	@Override
	public Integer calcularPrecio() {
		return porcion.obtenerPrecio();
	}

	@Override
	public void tipoCombo() {
		System.out.println(getClass().getName());
	}
}
