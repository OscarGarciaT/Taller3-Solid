/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract Aderezo {
	public abstract String nombre;
	abstract setNombre(String nomb) {
		nombre=nomb;
	}
    @Override
    public String toString() {
        return "Aderezo" + nombre.toUpperCase();
    }

    
}
