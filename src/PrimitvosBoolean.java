public class PrimitvosBoolean {
    public static void main(String[] args){

        boolean datoLogico = Boolean.TRUE.booleanValue();
        System.out.println("DatoLogico es igual a " + datoLogico);

        double datoDouble = 98000.0e-3; //98.0000
        System.out.println("double = " + datoDouble);
        float datoFloat = .10000e3f; //100.00
        System.out.println("float = " + datoFloat);

        datoLogico = (datoDouble > datoFloat);
        System.out.println("datoLogico es " + datoLogico);

        boolean esIgual1 = (3-3 == 1);
        System.out.println("esIgual1 a " + esIgual1 );
    }
}
