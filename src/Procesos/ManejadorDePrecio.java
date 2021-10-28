package Procesos;

import java.util.ArrayList;

import Adicionales.Aderezo;
import Postres.Postre;

public class ManejadorDePrecio {
	public static double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
	
	public static String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calcularPrecioFinal( postre);
    }
}
