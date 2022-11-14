public class PrimitivosCaracteres {
    public static void main(String[] args){
        char caracterDecimal = 64;

        char caracterUnicode = '\u03a6';

        System.out.println("Caracter con Unicode: " + (caracterDecimal == caracterUnicode));
        System.out.println("Char byte: " + Character.BYTES);
        System.out.println("Character in bites: " + Character.SIZE);
        System.out.println("Character Min_Value: " + Character.MIN_VALUE);
        System.out.println("Character Max_Value: " + Character.MAX_VALUE);

        char espacio = ' ';
        char espacioUnicode = '\u0020';
        char backSpace = '\b';

        System.out.println("Chart con un esp\u0020acio" + espacio + Character.BYTES);



        System.out.println("Chart con un\b\b espacio:" + backSpace + Character.BYTES);
        System.out.println("Chart con espacio: " + System.getProperty("line.separator") + Character.BYTES);
    }

}


