/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.persistence;

import co.edu.sena.model.Entrada;
import java.util.List;

/**
 *
 * @author BRYAN
 */
public interface IEntradaDAO {
    public void insert(Entrada entrada) throws Exception;
    public void update(Entrada entrada) throws Exception;
    public Entrada find(Integer numeroaprendiz) throws Exception;
    public List<Entrada> findAll() throws Exception;
}
