package Elementos;

public class Suelo {

	private int Minerales;
	private Agua Agua;
	
	public Suelo(int minerales, Agua agua) {
		
		this.Minerales = minerales;
		this.Agua = agua;
	}
	
	public int getMinerales() {
		return Minerales;
	}
	public void setMinerales(int minerales) {
		Minerales = minerales;
	}
	public Agua getAgua() {
		return Agua;
	}
	public void setAgua(Agua agua) {
		Agua = agua;
	}

	public String toString() 
	{
		
		return String.format("Tengo agua de tipo % con % cantidad de minerales",Agua,Minerales );
	}
	

}