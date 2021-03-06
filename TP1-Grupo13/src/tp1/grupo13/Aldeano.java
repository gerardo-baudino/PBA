package tp1.grupo13;

public class Aldeano extends Personaje {

    private Moneda moneda;
    
    public Aldeano(String nombre, String camisa, String pantalon, String gorro, char inicial) {
        super(nombre, camisa, pantalon, gorro, inicial);
        moneda = new Moneda();
    }

    public Aldeano(String nombre, String camisa, String pantalon, String gorro, char inicial, int posicionX, int posicionY, String orientacion) {
        super(nombre, camisa, pantalon, gorro, inicial, posicionX, posicionY, orientacion);
        moneda = new Moneda();
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
