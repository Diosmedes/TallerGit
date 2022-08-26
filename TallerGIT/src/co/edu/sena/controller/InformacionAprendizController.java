/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.controller;

import co.edu.sena.model.Informacionaprendiz;

import co.edu.sena.persistence.DAOFactory;
import co.edu.sena.persistence.EntityManagerHelper;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class InformacionAprendizController {
    public void validate(Informacionaprendiz informacionaprendiz) throws Exception
    {
        if(informacionaprendiz.getCedulaaprendiz()== null)
        {
            throw new Exception("La cedula es obligatoria");
        }
        
        if(informacionaprendiz.getFichaaprendiz()== 0)
        {
            throw new Exception("La Observacion es obligatoria");
        } 
        if(informacionaprendiz.getNombreaprendiz()==null)
        {
            throw new Exception("el nombre del aprendiz es obligatoria");
        }
        if(informacionaprendiz.getNombreficha()==null)
        {
            throw new Exception("El nombre de la ficha es obligatoria");
        }
    }
    
    public void insert(Informacionaprendiz informacionaprendiz) throws Exception
    {
        validate(informacionaprendiz);
        EntityManagerHelper.beginTransaction();
        DAOFactory.getInformacionaprendizDAO().insert(informacionaprendiz);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }
    public void update (Informacionaprendiz informacionaprendiz) throws Exception
    {
        validate(informacionaprendiz);
        Informacionaprendiz oldInformacionaprendiz= DAOFactory.getInformacionaprendizDAO().
                find(informacionaprendiz.getCedulaaprendiz());
        if(oldInformacionaprendiz==null)
        {
            throw new Exception("No existe el aprendiz");
        }
        oldInformacionaprendiz.setCedulaaprendiz(informacionaprendiz.getCedulaaprendiz());
        oldInformacionaprendiz.setNombreaprendiz(informacionaprendiz.getNombreaprendiz());
        oldInformacionaprendiz.setFichaaprendiz(informacionaprendiz.getFichaaprendiz());
        oldInformacionaprendiz.setNombreficha(informacionaprendiz.getNombreficha());
        EntityManagerHelper.beginTransaction();
        DAOFactory.getInformacionaprendizDAO().update(informacionaprendiz);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }
    public Informacionaprendiz find(Integer cedulaaprendiz) throws Exception
    {
        if(cedulaaprendiz == 0)
        {
            throw new Exception("El número del aprendiz es obligatorio");
        }
          
        return DAOFactory.getInformacionaprendizDAO().find(cedulaaprendiz);
    }
    public List<Informacionaprendiz> findAll() throws Exception
    {
        return DAOFactory.getInformacionaprendizDAO().findAll();
    }
}
