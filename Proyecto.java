public class Pagas{
    public static void main(String[] args){
        final int SUELDO_MENSUAL, PAGAS, SUELDO_ANUAL;
        final double SUELDO_ANUAL_12;
        SUELDO_MENSUAL = 1400;
        PAGAS = 14;
        SUELDO_ANUAL = SUELDO_MENSUAL * PAGAS;
        System.out.println("El sueldo anual es de " + SUELDO_ANUAL + " euros.");
        SUELDO_ANUAL_12 = SUELDO_ANUAL/12;
        System.out.println("El sueldo anual en 12 meses es de " + SUELDO_ANUAL_12 + " euros.");
    }
}
