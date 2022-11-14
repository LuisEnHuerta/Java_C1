public class PrimitivosCaracteres {
    public static void main(String[] args){
        char caracterDecimal = 64;

        char caracterUnicode = '\u03a6';

        System.out.println("Caracter con Unicode: " + (caracterDecimal == caracterUnicode));
        System.out.println("Char byte: " + Character.BYTES);
        System.out.println("Character in bites: " + Character.SIZE);
        System.out.println("Character Min_Value: " + Character.MIN_VALUE);
        System.out.println("Character Max_Value: " + Character.MAX_VALUE);
    }

}


