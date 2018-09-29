package Elementos;

public class Agua {

	public int Cantidad;
	public String Calidad;
	
	
	
	public Agua(int cantidad, String calidad) {
		this.Cantidad = cantidad;
		this.Calidad = calidad;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public String getCalidad() {
		return Calidad;
	}
	public void setCalidad(String calidad) {
		Calidad = calidad;
	}

	public String toString() 
	{
		
		return String.format("Tengo una % cantidad de agua y % de calidad",Cantidad,Calidad );
	}

}