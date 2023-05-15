package model;

public class EnBaseDeDatos implements Persistir{

	private Persistir persistir;
	public EnBaseDeDatos(Persistir persisitir)
	{
		this.persistir = persisitir;
	}
	@Override
	public void almacenar(String cadena) {
		if(persistir!=null)
			persistir.almacenar(cadena);
		
		System.out.println("Almacenado en Base de datos");
	}

}
