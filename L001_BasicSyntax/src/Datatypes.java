import jdk.jshell.Snippet;

public class Datatypes {
    public static void main(String[] args) {
//        System.out.println("Hello world!2");
        /**
         * многострочный комментарий 1
         */

        /*
        комментарий 2
         */

        // комментарий 3

        // <тип> <идентификатор>; // объявление переменной
        // <идентификатор> = <значение>;  // инициализация

        String s;
        s = null;
//        System.out.println(s);
//        java: variable s might not have been initialized

        // целые числа
        short age = 10;
        int salary = 123456;
//        int salary = 123_456;
//        System.out.println(age); //10
//        System.out.println(salary); //123456

        // вещественные числа
        float e = 2.7f;
        // float p = 2.7; // lossy conversion from double to float
        double pi = 3.1415;
//        System.out.println(e); // 2.7
//        System.out.println(pi); // 3.1415

        int num = 15;
        double k = num;
//        System.out.println(k);

        // символьный тип
        char ch = '1';
//        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
//        System.out.println(Character.isDigit(ch)); // false
        ch = '{';
//        System.out.println(ch); // {
        char ch2 = 123;
//        System.out.println(ch2); // {

        // логический тип данных
        boolean flag1 = 123 <= 234;
//        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
//        System.out.println(flag2); // true
        // Разделительная дизъюнкция ^
        boolean flag3 = flag1 ^ flag2;
//        System.out.println(flag3); // false
        boolean flag4 = true && false;
//        System.out.println(flag4); // false

        // Строковый тип
        String msg ="Hello world";
//        System.out.println(msg); // Hello world

        var a = 123;
//        System.out.println(a); // 123
        var d = 123.456;
//        System.out.println(d); // 123.456
//        System.out.println(getType(a)); // Integer
//        System.out.println(getType(d)); // Double
        d = 1022;
//        System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

        /* Классы-обертки
        Примитив/обертка
        int / Integer
        short / Short
        long / Long
        byte / Byte
        float / Float
        double / Double
        char / Character
        boolean / Boolean
        */

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        // Работа со строками
        String st = "qwert";
        int len = st.length(); // длина строки
        char item = st.charAt(4); // обращение к элементу строки по индексу



    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
