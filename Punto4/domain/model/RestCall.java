package model;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestCall {
	private String url;
	private Persistir persistir;

	public RestCall(String url, Persistir persistir) {
		this.url = url;
		this.persistir = persistir;
	}

	public String run() {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(this.url).build();

		try (Response response = client.newCall(request).execute()) {
			String cadena = response.body().string();
			persistir.almacenar(cadena);
			return cadena;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}