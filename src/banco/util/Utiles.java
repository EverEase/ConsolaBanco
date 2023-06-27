package banco.util;

import java.util.Random;

public class Utiles {
	
	public static final String [] NOMBRES = { "Sandy", "Eider", "Alaya", "Mike", "Ever", "David", "Natalia" };
	
	public static final String [] APELLIDOS = { "Amoros", "Andreu", "Mas", "LLacer", "Estelles" };
	
	public static final String [] CORREOS = { "sandy@gmail.com", "eider@gmail.com", "alaya@gmail.com", "mike@gmail.com", "ever@gmail.com" };
	
public static String nombreAleatorio(String[] nombres, String[] apellidos) {
		
		Random random = new Random();
		
		int indexNombre = random.nextInt(nombres.length);
		String nombre = nombres[indexNombre];

		int indexApellido = random.nextInt(apellidos.length);
		String apellido = apellidos[indexApellido];

		String nombreCompleto = nombre + " " + apellido;

		System.out.println(nombreCompleto);

		return nombreCompleto;
	}
    public static String nombreAleatorio() {
	return nombreAleatorio(NOMBRES, APELLIDOS);
}

    public static String correoAleatorio(String[] correos) {
    	
    	Random random = new Random();
    	
    	int indexCorreo = random.nextInt(correos.length);
    	String correo = correos[indexCorreo];
    	
    	System.out.println(correo);
    	return correo;
    }
    
    public static String correoAleatorio() {
    	return correoAleatorio(CORREOS);
    }
}
