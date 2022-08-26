/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import co.edu.sena.model.Informacionaprendiz;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public interface IInformacionaprendizDAO{
    public void insert(Informacionaprendiz informacionaprendiz) throws Exception;       
    public Informacionaprendiz find(Integer cedulaaprendiz) throws Exception;
    public List<Informacionaprendiz> findAll() throws Exception;
}
