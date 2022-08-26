/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.controller;

import co.edu.sena.model.Entrada;
import java.util.List;
import co.edu.sena.persistence.DAOFactory;
import co.edu.sena.persistence.EntityManagerHelper;

/**
 *
 * @author BRYAN
 */
public class EntradaController {
     public void validate(Entrada entrada) throws Exception
    {
        if(entrada.getFecha()==null)
        {
            throw new Exception("La fecha es obligatoria");
        }
        if(entrada.getObservacion()==null)
        {
            throw new Exception("La observacion es obligatoria");
        }
    }
    
    public void insert(Entrada entrada) throws Exception
    {
        validate(entrada);
        EntityManagerHelper.beginTransaction();
        DAOFactory.getEntradaDAO().insert(entrada);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }
    public void update (Entrada entrada) throws Exception
    {
        validate(entrada);
        Entrada oldEntrada= DAOFactory.getEntradaDAO().
                find(entrada.getNumeroaprendiz());
        if(oldEntrada==null)
        {
            throw new Exception("No existe el registro de llegada tarde");
        }
        oldEntrada.setFecha(entrada.getFecha());
        oldEntrada.setObservacion(entrada.getObservacion());
        EntityManagerHelper.beginTransaction();
        DAOFactory.getEntradaDAO().update(entrada);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }
    public Entrada find(Integer cedulaaprendiz) throws Exception
    {
        if(cedulaaprendiz == 0)
        {
            throw new Exception("El número del aprendiz es obligatorio");
        }
          
        return DAOFactory.getEntradaDAO().find(cedulaaprendiz);
    }
    public List<Entrada> findAll() throws Exception
    {
        return DAOFactory.getEntradaDAO().findAll();
    }
}
