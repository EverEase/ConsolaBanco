package banco.pruebas;

import banco.modelos.Gestor;

public class PruebasGestor {

	public static void main(String[] args) {
		
		Gestor gestor = new Gestor(1, "eider", "1234", "eider@gmail.com");
		gestor.setOficina("Valencia");
		Gestor gestorB = new Gestor();
		
		gestorB.setId(2);
		gestorB.setUsuario("alaya");
		gestorB.setPassword("2356");
		gestorB.setCorreo("alaya@gmail.com");
		
		System.out.println(gestor);
		
		if(gestor.equals(gestorB)) {
			System.out.println("Son el mismo gestor");
		}else {
			System.out.println("Son gestores distintos");
		}

	}

}
