package banco.pruebas;

import banco.modelos.Transferencia;

public class PruebasTransferencia {

	public static void main(String[] args) {
		
		Transferencia transferencia = new Transferencia(2,6,1, 50.0, "Cumpleaños");
		Transferencia transferenciaB = new Transferencia();
		
		transferenciaB.setId(3);
		transferenciaB.setIdOrdenante(1);
		transferenciaB.setIdBeneficiario(3);
		transferenciaB.setImporte(30.0);
		transferenciaB.setConcepto("Regalo de Navidad");
		
System.out.println(transferencia);
		
		if(transferencia.equals(transferenciaB)) {
			System.out.println("Son el mismo gestor");
		}else {
			System.out.println("Son gestores distintos");
		}
		
		
		

	}

}
