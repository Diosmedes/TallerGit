/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.persistence;

import co.edu.sena.model.Entrada;
import co.edu.sena.model.Informacionaprendiz;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Aprendiz
 */
public class InformacionaprendizDAO implements IInformacionaprendizDAO{

    @Override
    public void insert(Informacionaprendiz informacionaprendiz) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().persist(informacionaprendiz);
        } catch (Exception e) {
            throw e;
        }
    }


    @Override
    public Informacionaprendiz find(Integer cedulaaprendiz) throws Exception {
        try {
            return EntityManagerHelper.getEntityManager().find(Informacionaprendiz.class,cedulaaprendiz);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Informacionaprendiz> findAll() throws Exception {
        try {
            Query query=EntityManagerHelper.getEntityManager().createNamedQuery("Informacionaprendiz.findAll");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(Informacionaprendiz informacionaprendiz) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().merge(informacionaprendiz);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
