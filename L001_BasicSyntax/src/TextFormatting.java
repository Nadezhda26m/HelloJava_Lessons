public class TextFormatting {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res); // 1 + 2 = 3

        String s = "qwe";
        int d = 123;
        String q = s + d; // конкатенация строк
        System.out.println(q); // qwe123

        // для операций присваивания
        String res2 = String.format("%d + %d = %d \n", a, b, c);
        System.out.println(res2); // 1 + 2 = 3
        // для вывода
        System.out.printf("%d + %d = %d \n", a, b, c); // 1 + 2 = 3

        // Виды спецификаторов (масок)
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

        // Выбор количества знаков после запятой
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00

        // Область видимости переменных
        // 1
        // int num = 123;
        // {
        //     int num = 234;
        //     System.out.println(num);
        //     // variable num is already defined in method main
        // }

        // 2
        int numB = 56;
        {
            int num = 234;
            System.out.println(num + numB); // 290
        }
        int num = 123;
        System.out.println(num); // 123

        // 3
        // {
        //     int num = 234;
        //     System.out.println(num);
        // }
        // System.out.println(num); // cannot find symbol

    }
}
