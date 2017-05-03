/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.controller;

import uni.flores.edutecapp.service.impl.IDocenteService;
import uni.flores.edutecapp.service.impl.IEmpleadoService;

/**
 *
 * @author JeanCarlo
 */
public class EmpleadoController {
    public double calcularBonificacion(double sueldo){
        IEmpleadoService docente=new IEmpleadoService();
        return docente.calcularBonificacion(sueldo);
    }
    
    public double calcularTotal(double sueldo,double bono){
        IEmpleadoService docente=new IEmpleadoService();
        return docente.calcularTotal(sueldo,bono);
    }
    
   
 
}
