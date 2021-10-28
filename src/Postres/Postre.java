package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre (String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        precioParcial=0;
    }
    
	public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
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

    @Override
    public String toString() {
        return "Postre{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
}
