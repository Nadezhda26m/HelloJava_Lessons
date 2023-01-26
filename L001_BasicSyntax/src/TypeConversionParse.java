public class TypeConversionParse {
    public static void main(String[] args) {

        // неявное преобразование типов
        int i = 123; double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0

        d = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3

        d = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3

        // явное приведение типов
        byte b = Byte.parseByte("123"); // 0...255
        System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range

        // НО
        int[] a = new int[10];
        // double[] p = a; // incompatible types
        // ИЗУЧАЕМ инвариантность, ковариантность и контравариантность

    }
}
