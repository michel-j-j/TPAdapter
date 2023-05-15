package model;

import java.util.Objects;

public class Adaptador implements Motor {
	private Electrico motorElectrico;

	public Adaptador(Electrico motorElectrico) {
		this.motorElectrico = Objects.requireNonNull(motorElectrico);
	}

	@Override
	public void arrancar() {
		motorElectrico.conectar();
		motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		motorElectrico.detener();
		motorElectrico.desconectar();

	}

}
