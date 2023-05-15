package model;

import java.io.File;

public class Reporte implements ReporteInterface {

	private String reporte;
	private ReporteInterface validar;

	public Reporte(String reporte, ReporteInterface validar) {
		this.reporte = reporte;
		this.validar = validar;
	}

	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		if (validar != null)
			validar.export(file);

		System.out.println("Exportar a Archivo");
	}
}
