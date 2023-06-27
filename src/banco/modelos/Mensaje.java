package banco.modelos;

import java.util.Date;

public class Mensaje {
	
	private Integer id;
	private Integer idOrigen;
	private Integer idDestino;
	private String texto;
	private Date fecha;
	

	public Mensaje(Integer id, Integer idOrigen, Integer idDestino, String texto) {
		
		this.id=id;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.texto = texto;
		this.fecha=new Date();
	}


	public Mensaje() {
		
	
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getIdOrigen() {
		return idOrigen;
	}


	public void setIdOrigen(Integer idOrigen) {
		this.idOrigen = idOrigen;
	}


	public Integer getIdDestino() {
		return idDestino;
	}


	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return "Mensaje(id: " + this.id + " idOrigen: " + this.idOrigen + " idDestino: " + this.idDestino + " Texto: " + this.texto + " Fecha: " + this.fecha + ")";
	}
	
	

}
