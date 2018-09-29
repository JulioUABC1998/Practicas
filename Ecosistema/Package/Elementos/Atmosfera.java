package Elementos;

public class Atmosfera {

	public String Clima;
	public int Temperatura;
	public int Humedad;
	public String CalidadAire;
	
	public Atmosfera(String clima, int temperatura, int humedad, String calidadAire) {
		this.Clima = clima;
		this.Temperatura = temperatura;
		this.Humedad = humedad;
		this.CalidadAire = calidadAire;
	}

	public String getClima() {
		return Clima;
	}

	public void setClima(String clima) {
		Clima = clima;
	}

	public int getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(int temperatura) {
		Temperatura = temperatura;
	}

	public int getHumedad() {
		return Humedad;
	}

	public void setHumedad(int humedad) {
		Humedad = humedad;
	}

	public String getCalidadAire() {
		return CalidadAire;
	}

	public void setCalidadAire(String calidadAire) {
		CalidadAire = calidadAire;
	}
	public String toString() 
	{
		
		return String.format("Mi temperatura es de % C y % porcentage de humedad con clima % y calidad de aire %",Temperatura,Humedad,Clima,CalidadAire );
	}

	
}