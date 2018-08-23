
public class TEST {
	public static void main(String[] args)
	{
	System.out.println(Operaciones.MULTIPLICACION);	
	System.out.println(Operaciones.SUMA.getValor());
	System.out.println(Operaciones.SUMA.name());
//<<<<<<< HEAD
		for(Operaciones elemento:Operaciones.values())
		{
		System.out.println(elemento.getValor());
		System.out.println(elemento.name());
		
//=======
	Operaciones[] values = Operaciones.values();
		for (int i = 0; i < values.length; i++) {
			Operaciones elemento = values[i];
		}Operaciones[] values = Operaciones.values();
		for (int i = 0; i < values.length; i++) {
			Operaciones elemento = values[i];
//>>>>>>> branch 'master' of https://github.com/JulioUABC1998/Practicas.git
		}
	}
	}
}
