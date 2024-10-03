package ejercicios;

import static java.lang.Math.round;

public class Conversion {

    private static final double EQUEVALENCIA_EP = 166.386;
    private static final double EQUIVALENCIA_PE = 1 / EQUEVALENCIA_EP;

    public static double eurosAPesetas(double euros) {
        return round(euros * EQUEVALENCIA_EP);
    }

    public static double pesetasAEuros(double pesetas) {
        return round(pesetas * EQUIVALENCIA_PE);
    }

}