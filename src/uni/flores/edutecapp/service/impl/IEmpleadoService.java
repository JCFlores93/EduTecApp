/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.service.impl;
import uni.flores.edutecapp.service.EmpleadoService;
import uni.flores.edutecapp.service.EmpleadoService;



/**
 *
 * @author Alumno
 */
public  class IEmpleadoService  implements EmpleadoService{

    @Override
    public double calcularBonificacion(double sueldo) {
        double bono=sueldo*1;
        return bono;
    }

    @Override
    public double calcularTotal(double sueldo, double bono) {
        double sueldoFinal=sueldo+bono;
       return sueldoFinal;
    }
    
}

 

   
