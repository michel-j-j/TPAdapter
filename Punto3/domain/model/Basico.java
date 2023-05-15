package model;

public class Basico implements Combo {

	private Porcion porcion;

	Basico(Porcion porcion) {
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
