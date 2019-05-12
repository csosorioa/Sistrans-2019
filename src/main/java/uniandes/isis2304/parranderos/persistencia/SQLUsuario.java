package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLUsuario {
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acÃ¡ para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicaciÃ³n
	 */
	private PersistenciaParranderos pp;
	
	public SQLUsuario(PersistenciaParranderos pp) {
		this.pp = pp;
	}
	
	public long adicionarUsuario(PersistenceManager pm, long numDoc, String tipoDocumento, String nombre, String correo, int tipoUsuario, int idHotel) 
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaUsuario() + "(ID, TIPODOCUMENTO, CORREO, NOMBRE, TIPO, IDHOTEL) values (?, ?, ?, ?, ?, ?)");
		q.setParameters(numDoc, tipoDocumento, correo, nombre, tipoUsuario, idHotel);
		return (long) q.executeUnique();
	}
}
