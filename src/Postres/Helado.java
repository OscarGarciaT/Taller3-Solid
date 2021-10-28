/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
    public Helado(String sabor){
    	super(sabor);
    	aderezos= new ArrayList<>();
    	this.precioParcial = 7.85;
    }
    @Override
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    @Override
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    @Override
    public void anadirAderezo(Aderezo aderezo){
        super.anadirAderezo(aderezo);
    }
    
    @Override
    public void quitarAderezo(Aderezo aderezo){
    	super.quitarAderezo(aderezo);
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    @Override
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
    
    
}
