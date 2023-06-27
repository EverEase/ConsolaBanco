package banco.pruebas;

import banco.modelos.Mensaje;

public class PruebaMensaje {

	public static void main(String[] args) {
		
		Mensaje mensaje = new Mensaje(2, 2, 1, "Hello Papagena");
		Mensaje mensajeB = new Mensaje();
		
		mensajeB.setId(1);
		mensajeB.setIdOrigen(1);
		mensajeB.setIdDestino(2);
		mensajeB.setTexto("Tienes un pago de 20€");
		
        System.out.println(mensaje);
		
		if(mensaje.equals(mensajeB)) {
			System.out.println("Son el mismo gestor");
		}else {
			System.out.println("Son gestores distintos");
		}

	}

}
