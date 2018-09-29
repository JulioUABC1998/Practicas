package Relaciones;

public class Depredacion extends Interacciones {
	
	public int Depredador;
	public int Presa;

	public Depredacion(String especies) {
		super(especies);
		// TODO Auto-generated constructor stub
	}
	
	public Depredacion(String especies, int depredador, int presa) {
		super(especies);
		Depredador = depredador;
		Presa = presa;
	}

	public int getDepredador() {
		return Depredador;
	}

	public void setDepredador(int depredador) {
		Depredador = depredador;
	}

	public int getPresa() {
		return Presa;
	}

	public void setPresa(int presa) {
		Presa = presa;
	}
	




}