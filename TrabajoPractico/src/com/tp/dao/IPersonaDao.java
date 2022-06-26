package com.tp.dao;

import com.tp.modelo.Persona;
import com.tp.modelo.Vendedor;
import java.util.List;
import org.hibernate.Session;

/**
 * Integrantes:
 *
 * @author Baudino Gerardo
 * @author Poleri Franco
 * @author Pozzuto Romina
 */
public interface IPersonaDao {

    public void registrar(Session session, Persona persona);
    
    public void actualizar(Session session, Persona persona);

    public List<Persona> obtener(Session session);
    
    public Vendedor obtenerPorId(Session session, int id);

}
