/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.controller;

import co.edu.sena.model.Informacionaprendiz;

import persistence.DAOFactory;
import persistence.EntityManagerHelper;

/**
 *
 * @author Aprendiz
 */
public class AprendizController {
    public void validate(Informacionaprendiz informacionaprendiz) throws Exception
    {
        if(informacionaprendiz.getCedulaaprendiz()== null)
        {
            throw new Exception("La cedula es obligatoria");
        }
        
        if(informacionaprendiz.getObservaciones()== null)
        {
            throw new Exception("La Observacion es obligatoria");
        } 
    }
    
    public void insert(Informacionaprendiz informacionaprendiz) throws Exception
    {
        validate(informacionaprendiz);
        EntityManagerHelper.beginTransaction();
        DAOFactory.getInformacionaprendiz().insert(informacionaprendiz);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }
    
    public Informacionaprendiz find(Integer cedulaaprendiz) throws Exception
    {
        if(cedulaaprendiz == 0)
        {
            throw new Exception("El número del aprendiz es obligatorio");
        }
          
        return DAOFactory.getInformacionaprendiz().find(cedulaaprendiz);
    }
}
