/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.prueba;

import uni.flores.edutecapp.controller.DocenteController;
import uni.flores.edutecapp.model.Docente;

/**
 *
 * @author JeanCarlo
 */
public class Prueba01 {
    public static void main(String[] args) {
        Docente nuevod=new Docente();
    nuevod.setCategoria("Docente");
    nuevod.setSueldo(120);
    nuevod.setHoras(10);
    DocenteController doc=new DocenteController();
    double n=doc.calcularSueldo(nuevod);
        System.out.println("Sueldo Total :"+n);
        double m=doc.pagarBonificacion(n);
        System.out.println("Bonificacion :"+m);
        double ñ=doc.calcularTotal(m, n);
        System.out.println("Sueldo Final :"+ñ);
    }
    
}
