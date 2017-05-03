/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.model;

/**
 *
 * @author JeanCarlo
 */
public class Coordinador extends Empleados{
    public Coordinador(String cat,double sul){
    this.categoria=cat;
    this.sueldo=sul;
}

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
