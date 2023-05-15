package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnArchivo implements Persistir {

	private Persistir persistir;

	public EnArchivo(Persistir persistir) {
		this.persistir = persistir;
	}

	@Override
	public void almacenar(String cadena) {
		if (persistir != null)
			persistir.almacenar(cadena);

		try {
			writeTextFile("resources/txt/JSON.txt", cadena);
			System.out.println("El texto ha sido almacenado en el archivo ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Método para leer un archivo de texto y devolver su contenido como una cadena
	private static String readTextFile(String filePath) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line;

		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
		}

		reader.close();
		return stringBuilder.toString();
	}

	// Método para escribir una cadena en un archivo de texto
	private static void writeTextFile(String filePath, String content) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		writer.write(content);
		writer.close();
	}

	// Clase que representa el objeto JSON
	public static class TextObject {
		private String userId;
		private String id;
		private String title;
		private String body;

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}
	}

}
