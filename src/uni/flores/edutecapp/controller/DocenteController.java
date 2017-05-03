/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.flores.edutecapp.controller;

import uni.flores.edutecapp.model.Docente;
import uni.flores.edutecapp.service.DocenteService;
import uni.flores.edutecapp.service.impl.IDocenteService;

/**
 *
 * @author JeanCarlo
 */
public class DocenteController {
    
    public double calcularSueldo(Docente doc){
        IDocenteService docente=new IDocenteService();
        return docente.calcularSueldo(doc);
    }
    
    public double pagarBonificacion(double sueldo){
        IDocenteService docente=new IDocenteService();
        return docente.pagarBonificacion(sueldo);
    }
    
    public double calcularTotal(double sueldo,double bono){
        IDocenteService docente=new IDocenteService();
        return docente.calcularTotal(sueldo,bono);
    }
}
