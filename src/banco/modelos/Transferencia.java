package banco.modelos;

import java.util.Date;

public class Transferencia {
	
	private Integer id;
	private Integer idOrdenante;
	private Integer idBeneficiario;
	private double importe;
	private String concepto;
	private Date fecha;
	

	public Transferencia() {
		// TODO Auto-generated constructor stub
	}
	
	public Transferencia(Integer id, Integer idOrdenante, Integer idBeneficiario, double importe, String concepto) {
		this.id = id;
		this.idOrdenante = idOrdenante;
		this.idBeneficiario = idBeneficiario;
		this.importe = importe;
		this.concepto = concepto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdOrdenante() {
		return idOrdenante;
	}

	public void setIdOrdenante(Integer idOrdenante) {
		this.idOrdenante = idOrdenante;
	}

	public Integer getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(Integer idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		return "Transferencia(id: " + this.id + " idOrdenante " + this.idOrdenante + " idBeneficiario " + this.idBeneficiario + " Importe " + this.importe + " Concepto " + this.concepto + " Fecha " + this.fecha + ")";
	}
	
	public boolean equals(Object t) {
		Transferencia g =(Transferencia) t;
		return this.id == g.id;
	}
}
