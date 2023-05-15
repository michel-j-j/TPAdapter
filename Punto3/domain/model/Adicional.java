package model;

import java.util.Objects;

public abstract class Adicional implements Porcion {

	private Porcion porcion;
	private Integer precio;

	Adicional(Porcion porcion, Integer precio) {
		this.porcion = porcion;
		this.precio = Objects.requireNonNull(precio);
	}

	@Override
	public Integer obtenerPrecio() {
		Integer total = 0;
		if (porcion != null)
			total += porcion.obtenerPrecio();
		return total + precio;
	}

}
