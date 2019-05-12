package uniandes.isis2304.parranderos.negocio;

public interface VOHabitacion {
	
	public long getIdHabitacion();
	
	public long getIdHotel();
	
	public int getTipoHabitacion();
		
	public String getReservada();
	
	public String getOcupada();
	
	public double getCosto();
	
	public int getCapacidad();
	
}
