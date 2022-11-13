public class PrimitivosFloat {
    public static void main(String[] args){

        float realFloat = 1.9e-3F; //0.0019
        float realFloat2 = 0.6e-5F; //0.000006
        float realFloat3 = 45.64e-2F; //0.4564
        System.out.println(realFloat);
        System.out.println(realFloat2);
        System.out.println(realFloat3);
        System.out.println("realFloat: " + realFloat);
        System.out.println("float byte: " + Float.BYTES);
        System.out.println("float bites: " + Float.SIZE);
        System.out.println("float max value: " + Float.MAX_VALUE);
        System.out.println("float min value:" + Float.MIN_VALUE);


        double realDouble = 3.98273904E35D;
        System.out.println(realDouble);
        System.out.println("realdouble: " + realDouble);
        System.out.println("double byte: " + Double.BYTES);
        System.out.println("double bites: " + Double.SIZE);
        System.out.println("double max value: " + Double.MAX_VALUE);
        System.out.println("double min value:" + Double.MIN_VALUE);
}
}