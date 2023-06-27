package banco.pruebas;

import java.util.ArrayList;
import java.util.List;

import banco.modelos.Gestor;
import banco.util.Utiles;

public class PruebaUtil {

	public static void main(String[] args) {
		
		String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
		
		System.out.println(nombreAleatorio);
		
		nombreAleatorio = Utiles.nombreAleatorio();
		
		System.out.println(nombreAleatorio);
		
		String [] nombres = {"Sandy", "Eider", "Alaya", "Mike", "Ever"};
		String[] apellidos = {"Amoros", "Andreu", "Mas", "LLacer", "Estelles"};
		
		nombreAleatorio = Utiles.nombreAleatorio(nombres, apellidos );
		
		System.out.println(nombreAleatorio);
		
		String correoAleatorio = Utiles.correoAleatorio(Utiles.CORREOS);
		
		System.out.println(correoAleatorio);
		
		correoAleatorio = Utiles.correoAleatorio();
		
		System.out.println(correoAleatorio);
		
		String [] correos = {"sandy@gmail.com", "eider@gmail.com", "alaya@gmail.com", "mike@gmail.com", "ever@gmail.com"};
		
		correoAleatorio = Utiles.correoAleatorio(correos);
		
		System.out.println(correoAleatorio);
		
		List<Gestor> gestores = new ArrayList<>();
		
		for(int i = 0; i<10; i++) {
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			Gestor gestor = new Gestor(i + 1, usuario, "", correo);
			gestores.add(gestor);
		}
		
		System.out.println(gestores);
	}

}
