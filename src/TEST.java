
public class TEST {
	public static void main(String[] args)
	{
	System.out.println(Operaciones.MULTIPLICACION);	
	System.out.println(Operaciones.SUMA.getValor());
	System.out.println(Operaciones.SUMA.name());
		for(Operaciones elemento:Operaciones.values())
		{
		System.out.println(elemento.getValor());
		System.out.println(elemento.name());
		
		}
	}
}
