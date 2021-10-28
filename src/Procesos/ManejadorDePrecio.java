package Procesos;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class ManejadorDePrecio {
	public double calcularPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
	
	public String showPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos){
        return "Precio Final: $ " + calcularPrecioFinal(precioParcial, aderezos);
    }
}
