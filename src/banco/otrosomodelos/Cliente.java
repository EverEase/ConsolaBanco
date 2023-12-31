package banco.otrosomodelos;

public class Cliente {
	
	private Integer id;
	private Integer idGestor;
	private String usuario;
	private String password;
	private String correo;
	private double saldo;

	public Cliente() {
		
	}
	
	public Cliente(Integer id, Integer idGestor, String usuario, String password, String correo, double saldo) {
		this.id = id;
		this.idGestor = idGestor;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(Integer idGestor) {
		this.idGestor = idGestor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "Cliente(id " + this.id + " idGestor " + this.idGestor + " usuario " + this.usuario + ")";
	}
	
	
	
}
