package tp1.grupo13;

import java.util.Scanner;

public class SuperMarioBros {

    protected static Aldeano luigi;
    protected static Aldeano mario;
    protected static Aldeano princesaPeach;

    protected static Scanner entrada;

    public static void main(String[] args) {
        nivel1();
        nivel2();
    }

    /**
     * Nivel 1: El encuentro
     */
    public static void nivel1() {
        luigi = crearLuigi();
        mario = crearMario();

        mostrarUbicacion(luigi.indicarUbicacion(), mario.indicarUbicacion());

        if (luigi.getPosicion().getX() > mario.getPosicion().getX()) {
            luigi.girar();
        } else if (mario.getPosicion().getX() > luigi.getPosicion().getX()) {
            mario.girar();
        }
        while (luigi.getPosicion().getX() != mario.getPosicion().getX()) {
            luigi.caminar();
            mario.caminar();

            mostrarUbicacion(luigi.indicarUbicacion(), mario.indicarUbicacion());
        }
        mostrarSaludo(luigi.saludar(), mario.saludar());
    }

    private static Aldeano crearLuigi() {
        return new Aldeano(
                "Luigi",
                "Verde",
                "Azul oscuro",
                "Verde",
                'L',
                (int) (Math.random() * 99 - 50),
                0,
                "Derecha"
        );
    }

    private static Aldeano crearMario() {
        return new Aldeano(
                "Mario",
                "Roja",
                "Azul claro",
                "Rojo",
                'M'
        );
    }

    private static void mostrarUbicacion(String ubicacionLuigi, String ubicacionMario) {
        System.out.println(ubicacionLuigi);
        System.out.println(ubicacionMario);
    }

    private static void mostrarSaludo(String saludoLuigi, String saludoMario) {
        System.out.println("\nFelicitaciones se encontraron!!");
        System.out.println(saludoLuigi);
        System.out.println(saludoMario);
    }

    /**
     * Nivel 2: El rescate
     */
    public static void nivel2() {
        princesaPeach = crearPrincesaPeach();
        etapa1();
    }

    private static Aldeano crearPrincesaPeach() {
        return new Aldeano(
                "Princesa Peach",
                "Violeta",
                "Amarillo",
                "Violeta",
                'P',
                (int) (Math.random() * 99 - 50),
                0,
                "Derecha"
        );
    }

    /**
     * Etapa 1 - Dónde está Princesa Peach?
     */
    private static void etapa1() {
        Oraculo whallum = crearWhallum();
        entrada = new Scanner(System.in);

        Aldeano protagonista = elegirProtagonista();
        presentarMenu();

        int opcion = elegirOpcionDeMenu();
        int valor = ingresarValor();
        boolean esGameOver = false;

        while (!esGameOver) {
            String respuesta = whallum.esRespuestaValida(princesaPeach.getPosicion(), valor, opcion);
            switch (opcion) {
                case 1:
                    System.out.println("¿La posición de la Princesa Peach es mayor que: " + valor + "?");
                    System.out.println("Respuesta: " + respuesta + "\n");
                    presentarMenu();
                    opcion = elegirOpcionDeMenu();
                    valor = ingresarValor();
                    break;
                case 2:
                    System.out.println("¿La posición de la Princesa Peach es menor que: " + valor + "?");
                    System.out.println("Respuesta: " + respuesta + "\n");
                    presentarMenu();
                    opcion = elegirOpcionDeMenu();
                    valor = ingresarValor();
                    break;
                case 3:
                    if (valor == princesaPeach.getPosicion().getX()) {
                        etapa2();
                    } else {
                        System.out.println("GAME OVER");
                    }
                    esGameOver = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static Oraculo crearWhallum() {
        return new Oraculo(
                "Whallum",
                0,
                (int) (Math.random() * 99 - 50),
                "Derecha"
        );
    }

    private static Aldeano elegirProtagonista() {
        System.out.print("\nElija un personaje mediante su inicial: Mario 'M' o Luigi 'L': ");
        String inicial = entrada.nextLine().toUpperCase();

        while (!inicial.equals("M") && !inicial.equals("L")) {
            System.err.println("No es una inicial valida, ingrese 'M' o 'L': ");
            inicial = entrada.nextLine().toUpperCase();
        }
        if (inicial.equals("M")) {
            return mario;
        } else {
            return luigi;
        }
    }

    private static void presentarMenu() {
        System.out.println("Oráculo Whallum, te tengo que hacer una pregunta sobre la ubicación de\n"
                + "Princesa Peach:\n"
                + "1.- Posición de Princesa Peach mayor que ...\n"
                + "2.- Posición de Princesa Peach menor que ...\n"
                + "3.- Te arriesgas al valor ..."
        );
    }

    private static int elegirOpcionDeMenu() {
        System.out.print("\nElija una opción de menú (1-2-3): ");
        int opcion = entrada.nextInt();

        while (opcion != 1 && opcion != 2 && opcion != 3) {
            System.err.print("No es una opcion valida, ingrese (1-2-3): ");
            opcion = entrada.nextInt();
            System.out.println();
        }
        return opcion;
    }

    private static int ingresarValor() {
        System.out.print("Ingrese el valor de X: ");
        return entrada.nextInt();
    }

    /**
     * Etapa 2 - Carrera de pretendientes.
     */
    private static void etapa2() {
        orientarJugadores();

        int cantFloresMario = 0;
        int cantFloresLuigi = 0;

        System.out.println("\nMario y Luigi caminan hacia la torre...");

        while (mario.getPosicion().getX() != princesaPeach.getPosicion().getX()) {
            mario.caminar();
            luigi.caminar();

            int posicionMario = Math.abs(mario.getPosicion().getX());
            int posicionLuigi = Math.abs(luigi.getPosicion().getX());

            if (posicionMario % 2 == 0 || posicionMario % 7 == 0) {
                cantFloresMario++;
            }
            if (posicionLuigi % 3 == 0 || posicionLuigi % 5 == 0) {
                cantFloresLuigi++;
            }
        }

        elegirGanador(cantFloresMario, cantFloresLuigi);
    }

    private static void orientarJugadores() {
        String orientacion = princesaPeach.getOrientacion();
        if (!luigi.getOrientacion().equals(orientacion)) {
            luigi.setOrientacion(orientacion);
        }
        if (!mario.getOrientacion().equals(orientacion)) {
            mario.setOrientacion(orientacion);
        }
    }

    private static void elegirGanador(int cantFloresMario, int cantFloresLuigi) {
        if (cantFloresMario > cantFloresLuigi) {
            System.out.println("Princesa Peach se quedó con Mario");
        } else if (cantFloresMario < cantFloresLuigi) {
            System.out.println("Princesa Peach se quedó con Luigi");
        } else {
            princesaPeach.getMoneda().lanzar();
            String lado = princesaPeach.getMoneda().getLado();

            if (lado.equals("Cruz")) {
                System.out.println("Princesa Peach se quedó con Mario");
            } else {
                System.out.println("Princesa Peach se quedó con Luigi");
            }
        }
    }
}
