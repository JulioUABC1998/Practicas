package pruebas;

import Ecosistema.Biocenosis;
import Ecosistema.Biotopo;
import Ecosistema.Ecosistema;

public class PruebaEcosistema {

	public PruebaEcosistema() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ecosistema elEcosistema = new Ecosistema("Sistema digestivo");
		
		Biocenosis laBiocenosis = new Biocenosis("Lombrices", elEcosistema);
		
		elEcosistema.losBiocenosis.add(laBiocenosis);
		
		Biotopo elBiotopo = new Biotopo("Estomago", elEcosistema);
		
		elEcosistema.losBiotopos.add(elBiotopo);
		
		System.out.println(elEcosistema);
		
		
	}

}
