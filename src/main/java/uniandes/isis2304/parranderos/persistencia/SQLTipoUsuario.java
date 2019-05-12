package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLTipoUsuario {
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

	/* ****************************************************************
	 * 			MÃ©todos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicaciÃ³n
	 */
	public SQLTipoUsuario(PersistenciaParranderos pp)
	{
		this.pp = pp;
	}
	
	public long adicionarTipoUsuario(PersistenceManager pm, int pId, String pDesc) {
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaTipoUsuario() + "(ID, DESCRIPCION) VALUES (?, ?)");
		q.setParameters(pId, pDesc);
		return (long) q.executeUnique();
	}
}
