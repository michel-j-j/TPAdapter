package model;

import java.io.File;

public class Reportes implements ReporteInterface { // Decorador

	public Reportes() {
	}

	public void export(File file) {
		if (file == null)
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		if (file.exists())
			throw new IllegalArgumentException("File ya existe, no se puede sobrescribir.");
		System.out.println("Validar que no se sobreescriba.");
	}
}
