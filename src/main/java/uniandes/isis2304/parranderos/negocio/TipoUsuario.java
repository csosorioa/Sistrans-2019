package uniandes.isis2304.parranderos.negocio;

public class TipoUsuario implements VOTipoUsuario{
	private int idTipo;
	
	private String desc;
	
	public TipoUsuario(){
		idTipo = 0;
		desc = "";
	}
	
	public TipoUsuario(int pId, String pDesc){
		idTipo = pId;
		desc = pDesc;
	}

	@Override
	public int getTipoUsuario() {
		// TODO Auto-generated method stub
		return idTipo;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}

}
