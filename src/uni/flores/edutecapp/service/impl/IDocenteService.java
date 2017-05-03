/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.service.impl;

import uni.flores.edutecapp.model.Docente;
import uni.flores.edutecapp.service.DocenteService;

/**
 *
 * @author JeanCarlo
 */
public class IDocenteService implements DocenteService{

    @Override
    public double calcularSueldo(Docente doc) {
        Docente docente=new Docente();
        docente.setCategoria(doc.getCategoria());
        docente.setSueldo(doc.getSueldo());
        docente.setHoras(doc.getHoras());
        double sueldo=docente.getSueldo()*docente.getHoras();
       return sueldo;
    }

    @Override
    public double pagarBonificacion(double sueldoTotal) {
        double bono=sueldoTotal*0.7;
        return bono;
    }

    @Override
    public double calcularTotal(double sueldoTotal, double bono) {
       double sueldoFinal=sueldoTotal+bono;
       return sueldoFinal;
    }
    
}
