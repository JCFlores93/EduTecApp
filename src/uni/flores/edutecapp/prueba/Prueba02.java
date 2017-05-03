/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.prueba;


import uni.flores.edutecapp.controller.EmpleadoController;
import uni.flores.edutecapp.model.Coordinador;


/**
 *
 * @author Alumno
 */
public class Prueba02 {
     public static void main(String[] args) {
    Coordinador coo=new Coordinador("Coordinador",200);
    EmpleadoController empctl=new EmpleadoController();
    double n=empctl.calcularBonificacion(coo.getSueldo());
    System.out.println("Sueldo :"+200);
    System.out.println("Bonificacion :"+n);
    double ñ=empctl.calcularTotal(200, n);
    System.out.println("Sueldo Final :"+ñ);
    }
}
