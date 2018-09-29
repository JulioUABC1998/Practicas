package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorBoton implements ActionListener {
	private Calculadora c;
	public ControladorBoton(Calculadora c) {
		this.c=c;
		// TODO Auto-generated constructor stub
	}
	public void actionPerformed(ActionEvent e)
	{
		String comando=e.getActionCommand();
		double operacion1=Double.parseDouble(c.getTxtoperador1().getText());
		double operacion2=Double.parseDouble(c.getTxtoperador2().getText());
		double res=0;
		switch(comando)
		{
		case "Suma":
			res=operaciones1+operaciones2;
			break;
		case "Resta":
			res=operaciones1+operaciones2;
			break;
		case "Multiplicacion":
			res=operaciones1*operaciones2;
			break;
		case "Division":
			res=operaciones1/operaciones2;
			break;
		}
		c.getTxtresultado().setText(String.valueOf(res));
	}

}
