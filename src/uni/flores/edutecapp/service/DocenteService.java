/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.service;

import uni.flores.edutecapp.model.Docente;

/**
 *
 * @author JeanCarlo
 */
public interface DocenteService {
    public double calcularSueldo(Docente doc);
    public double pagarBonificacion(double sueldoTotal);
    public double calcularTotal(double sueldoTotal,double bono);
}
