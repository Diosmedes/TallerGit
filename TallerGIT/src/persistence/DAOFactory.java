/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import co.edu.sena.model.Informacionaprendiz;

/**
 *
 * @author Aprendiz
 */
public class DAOFactory {
    private static IInformacionaprendizDAO informacionaprendizDAO = new InformacionaprendizDAO();
    private static IEntradaDAO entradaDAO = new EntradaDAO();
    public static IInformacionaprendizDAO getInformacionaprendizDAO() {
        return informacionaprendizDAO;
    }

    public static IEntradaDAO getEntradaDAO() {
        return entradaDAO;
    }
    
    
}