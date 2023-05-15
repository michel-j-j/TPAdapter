package main;

import java.io.File;

import model.Reporte;
import model.Reportes;

public class Main {

	public static void main(String[] args) {
		Reporte reporte = new Reporte("reporte.txt", new Reportes());
		reporte.export(new File("reporte.txt"));
	}

}
