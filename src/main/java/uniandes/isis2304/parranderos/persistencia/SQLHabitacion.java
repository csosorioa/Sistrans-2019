package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLHabitacion {
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaParranderos pp;
	
	public SQLHabitacion(PersistenciaParranderos pp) {
		this.pp = pp;
	}
	
	public long adicionarHabitacion(PersistenceManager pm, long pIdHabitacion, long pIdHotel, int tipoHabitacion, String pReservada, String ocupada, double pCosto, int pCapacidad) {
		System.out.println(pIdHabitacion);
		System.out.println(pIdHotel);
		System.out.println(tipoHabitacion);
		System.out.println(pReservada);
		System.out.println(ocupada);
		System.out.println(pCosto);
		System.out.println(pCapacidad);
		System.out.println();
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaHabitacion() + "(ID, ID_HOTEL, TIPO, RESERVADA, OCUPADA, COSTO, CAPACIDAD) VALUES (?, ?, ?, ?, ?, ?, ?)");
		
		q.setParameters(pIdHabitacion, pIdHotel, tipoHabitacion, pReservada, ocupada, pCosto, pCapacidad);
		return (long)q.executeUnique();
	}
}
