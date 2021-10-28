package Postres;

import java.util.ArrayList;

import Adicionales.*;

public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre (String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
	

	public void anadirAderezo(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
    	aderezos.remove(aderezo);
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    /*public double getPrecioParcial() {
		return precioParcial;
    }*/

    public double getPrecioParcial() {
		return precioParcial;
	}
    
    @Override
    public String toString() {
        return "Postre{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    /*
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

	public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }*/

	
}
