
public class TEST {
	public static void main(String[] args)
	{
	System.out.println(Operaciones.MULTIPLICACION);	
	System.out.println(Operaciones.SUMA.getValor());
	System.out.println(Operaciones.SUMA.name());
	Operaciones[] values = Operaciones.values();
		for (int i = 0; i < values.length; i++) {
			Operaciones elemento = values[i];
		}Operaciones[] values = Operaciones.values();
		for (int i = 0; i < values.length; i++) {
			Operaciones elemento = values[i];
		}
	}
}
