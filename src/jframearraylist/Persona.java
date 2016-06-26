/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframearraylist;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public abstract class Persona {
    ArrayList Nombre;
    ArrayList Edad;
    //Insertar constructor

    public Persona(ArrayList Nombre, ArrayList Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    //Insertar getter and setter

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getEdad() {
        return Edad;
    }

    public void setEdad(ArrayList Edad) {
        this.Edad = Edad;
    }
    
    //Ingresar metodos que vamos a usar
    public abstract void IngresarNombre(String nombres);
    public abstract void IngresarEdad(int edad);
    public abstract void EliminarNombre(String nombres);
    public abstract void EliminarEdad(int edad);
    public abstract String BuscarNombre(String nombres);
    public abstract int BuscarEdad(int edad);
    
    
    
    
    
    
}
