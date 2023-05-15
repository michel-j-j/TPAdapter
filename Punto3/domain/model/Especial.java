package model;

public class Especial implements Combo {
	private Porcion porcion;

	public Especial(Porcion porcion) {
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
