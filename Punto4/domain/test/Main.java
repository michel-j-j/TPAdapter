package test;

import model.EnArchivo;
import model.EnBaseDeDatos;
import model.Persistir;
import model.RestCall;

public class Main {
	public static void main(String[] args) {
		Persistir archivo = new EnArchivo(new EnBaseDeDatos(null));
		Persistir archivo2 = new EnBaseDeDatos(new EnArchivo(null));
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts", archivo2);
		rest.run();
		// System.out.println(rest.run());
		// System.out.println("Gola");
	}
}