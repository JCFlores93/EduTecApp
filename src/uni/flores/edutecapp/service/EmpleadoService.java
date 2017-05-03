/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.service;

/**
 *
 * @author Alumno
 */
public interface EmpleadoService {
     public double calcularBonificacion(double sueldo);
     public double calcularTotal(double sueldo,double bono);
}
