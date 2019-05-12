package uniandes.isis2304.parranderos.negocio;

public class Usuario implements VOUsuario {
	private long id;
	
	private String tipoDoc;
	
	private String correo;
	
	private String nombre;
	
	private int tipoUsuario;
	
	private int idHotel;
	
	public Usuario()
	{
		id = 0;
		tipoDoc = "";
		correo = "";
		nombre = "";
		tipoUsuario = 0;
		idHotel = 0;
	}
	
	public Usuario(long id, String tipoDoc, String correo, String nombre, int tipoUsuario, int idHotel) {
		this.id = id;
		this.tipoDoc = tipoDoc;
		this.correo = correo;
		this.nombre = nombre;
		this.tipoUsuario = tipoUsuario;
		this.idHotel = idHotel;
	}

	@Override
	public long getDoc() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getTipoDoc() {
		// TODO Auto-generated method stub
		return tipoDoc;
	}

	@Override
	public String getCorreo() {
		// TODO Auto-generated method stub
		return correo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public int getTipoUsuario() {
		// TODO Auto-generated method stub
		return tipoUsuario;
	}

	@Override
	public int getHotel() {
		// TODO Auto-generated method stub
		return idHotel;
	}

}