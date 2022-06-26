package com.tp.dao;

import com.tp.modelo.Ciudad;
import com.tp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 * Integrantes:
 *
 * @author Baudino Gerardo
 * @author Poleri Franco
 * @author Pozzuto Romina
 */
public class CiudadDaoImp implements ICiudadDao {

    @Override
    public void registrar(Session session, Ciudad ciudad) {
       session.save(ciudad);
    }

    @Override
    public List<Ciudad> obtener(Session session) {
        String sql = "FROM CIUDAD ORDER BY ID";
        return session.createQuery(sql).list();
    }

    @Override
    public Ciudad obtenerPorId(Session session, int id) {
        String sql = "FROM CIUDAD WHERE ID=" + id;
        return (Ciudad) session.createQuery(sql).uniqueResult();
    }
}
