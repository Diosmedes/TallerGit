/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import co.edu.sena.model.Entrada;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author BRYAN
 */
public class EntradaDAO implements IEntradaDAO {

    @Override
    public void insert(Entrada entrada) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().persist(entrada);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Entrada find(Integer numeroaprendiz) throws Exception {
       try {
            return EntityManagerHelper.getEntityManager().find(Entrada.class,numeroaprendiz);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
   public List<Entrada> findAll() throws Exception {
        try {
            Query query =EntityManagerHelper.getEntityManager().createNamedQuery("Entrada.findAll");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(Entrada entrada) throws Exception {
         try {
            EntityManagerHelper.getEntityManager().merge(entrada);
        } catch (Exception e) {
            throw e;
        }
    }
}