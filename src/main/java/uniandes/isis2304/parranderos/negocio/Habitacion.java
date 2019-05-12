package uniandes.isis2304.parranderos.negocio;

public class Habitacion implements VOHabitacion{

	private long idHabitacion;

	private long idHotel;

	private int tipoHabitacion;

	private String ocupada;

	private String reservada;

	private double costo;

	private int capacidad;

	public Habitacion(){
		idHabitacion = 0;
		idHotel = 0;
		tipoHabitacion = 0;
		reservada = "";
		ocupada = "";
		costo = 0;
		capacidad = 0;
	}

	public Habitacion(long id, long idHotel, int tipo, String reservada, String ocupada, int capacidad, double costo) {
		// TODO Auto-generated constructor stub

		this.idHabitacion = id;
		this.idHotel = idHotel;
		this.tipoHabitacion = tipo;
		this.reservada = reservada;
		this.costo = costo;
		this.capacidad = capacidad; 
		this.ocupada = ocupada;
	}

	@Override
	public long getIdHabitacion() {
		// TODO Auto-generated method stub
		return idHabitacion;
	}

	@Override
	public long getIdHotel() {
		// TODO Auto-generated method stub
		return idHotel;
	}

	@Override
	public int getTipoHabitacion() {
		// TODO Auto-generated method stub
		return tipoHabitacion;
	}

	@Override
	public String getReservada() {
		// TODO Auto-generated method stub
		return reservada;
	}

	@Override
	public String getOcupada() {
		// TODO Auto-generated method stub
		return ocupada;
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return costo;
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

}
