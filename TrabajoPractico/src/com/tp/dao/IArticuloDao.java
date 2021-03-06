package com.tp.dao;

import com.tp.modelo.Articulo;
import java.util.List;
import org.hibernate.Session;

/**
 * Integrantes:
 *
 * @author Baudino Gerardo
 * @author Poleri Franco
 * @author Pozzuto Romina
 */
public interface IArticuloDao {

    public void registrar(Session session, Articulo articulo);
    
    public void borrar(Session session, Articulo articulo);

    public List<Articulo> obtener(Session session);

    public Articulo obtenerPorId(Session session, int id);
}
