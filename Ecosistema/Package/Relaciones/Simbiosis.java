package Relaciones;

public class Simbiosis extends Interacciones {

	public Simbiosis(String especies) {
		super(especies);
		// TODO Auto-generated constructor stub
	}

	public String Huesped;
	public String Parasito;
	
	public Simbiosis(String especies, String huesped, String parasito) {
		super(especies);
		Huesped = huesped;
		Parasito = parasito;
	}
	public String getHuesped() {
		return Huesped;
	}
	public void setHuesped(String huesped) {
		Huesped = huesped;
	}
	public String getParasito() {
		return Parasito;
	}
	public void setParasito(String parasito) {
		Parasito = parasito;
	}

	

}