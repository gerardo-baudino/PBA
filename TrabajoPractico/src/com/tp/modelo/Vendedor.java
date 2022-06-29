package com.tp.modelo;

import java.util.List;

/**
 * Integrantes:
 *
 * @author Baudino Gerardo
 * @author Poleri Franco
 * @author Pozzuto Romina
 */
public class Vendedor extends Persona {

    private int cuit;
    private double porcentajeDeComision;
    private List<Articulo> articulos;
    private Ciudad ciudad;

    public Vendedor() {
    }

    public Vendedor(int cuit, double porcentajeDeComision,
            List<Articulo> articulos, Ciudad ciudad, String nombre,
            String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.cuit = cuit;
        this.porcentajeDeComision = porcentajeDeComision;
        this.articulos = articulos;
        this.ciudad = ciudad;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public double getPorcentajeDeComision() {
        return porcentajeDeComision;
    }

    public void setPorcentajeDeComision(double porcentajeDeComision) {
        this.porcentajeDeComision = porcentajeDeComision;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "CUIT: " + getCuit() + " - " + getNombre() + ", " + getApellido();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        return true;
    }
}
