import java.lang.reflect.Type;

public class Operators {
    public static void main(String[] args) {

        /* Операции Java
        Присваивание: =
        Арифметические: *, /, +, -, %, ++, --
        Операции сравнения: <, >, ==, !=, >=, <=
        Логические операции: ||, &&, ^, !
        Побитовые операции: <<, >>, &, |, ^
         */

        int num1 = 15;
        int res1 = num1 / 4;
        System.out.println(res1); // 3
        System.out.println(num1 / 4); // 3

        double res2 = num1 / 4; // integer division in floating-point context
        System.out.println(res2); // 3.0

        double num2 = 15;
//        int res3 = num2 / 4; // lossy conversion from double to int
        double res3 = num2 / 4;
        System.out.println(res3); // 3.75
        System.out.println(num2 / 4); // 3.75

//        float res4 = (num2 / 4); // lossy conversion from double to float
        float num3 = 15f;
        double res4 = num3 / 4;
        System.out.println(res4); // 3.75
        float res5 = num3 / 4;
        System.out.println(res5); // 3.75

        res4 = 23 / 3; // integer division in floating-point context
        System.out.println(res4); // 7.0
        res4 = 23.0 / 3; // double
        System.out.println(res4); // 7.666666666666667

        res5 = 23 / 3; // integer division in floating-point context
        System.out.println(res5); // 7.0
        res5 = 23f / 3; // float
        System.out.println(res5); // 7.6666665

        res1 = num1 % 2; // int 15 % 4
        System.out.println(res1); // 1
        res4 = num1 % 2; // int 15 % 4, double
        System.out.println(res4); // 1.0
        res5 = num1 % 2; // int 15 % 4, float
        System.out.println(res5); // 1.0

        num3 = 124f; // float
        num2 = 124; // double
        num1 = 124; // int

        var res6 = num3 % 8; // float 15 % 4, float
        System.out.println(res6); // 4.0
        int res7 = num1 % 8; // int 15 % 4, int
        System.out.println(res7); // 4
        var res8 = num1 % 8; // int 15 % 4, int
        System.out.println(res8); // 4
        res4 = num2 % 8; // double 15 % 4, double
        System.out.println(res4); // 4.0
        res5 = num3 % 8; // float 15 % 4, float
        System.out.println(res5); // 4.0

        // Инкремент и декремент
        int a = 123;
        System.out.println(a); // 123
        System.out.println(a++); // 123
        System.out.println(a); // 124
        System.out.println(++a); // 125
        System.out.println(a); // 125
        System.out.println(a--); // 125
        System.out.println(a); // 124

        a = a-- - --a;
        System.out.println(a); // 123 - 121 = 2
        // (123 (-1 -> 122) - 121 (-1 + 122 -> 121))

        a = 123;
        int b = --a-a--;
        System.out.println(b); // 122 - 122 (a -> 121) = 0
        System.out.println(a); // 121

        // Операции сравнения (boolean)
        boolean f = 123 > 234;
        System.out.println(f); // false
        f = 123 <= 234;
        System.out.println(f); // true

        // Логические операции
        boolean flag2 = 123 >= 234 || 123 <= 234;
        System.out.println(flag2); // true
        // Разделительная дизъюнкция ^
        boolean flag3 = 123 <= 234 ^ flag2;
        System.out.println(flag3); // false
        boolean flag4 = true && false;
        System.out.println(flag4); // false

        // Побитовые операции
        int ab = 8;
        // 1000
        // ab = ab << 1;
        System.out.println(ab << 1); // 16
        // 10000
        ab = 18;
        // 10010
        System.out.println(ab >> 1); // 9
        // 1001

        int item1 = 5;
        int item2 = 2;
        System.out.println(item1 | item2); // 7
        // 101 (5) 1 or 0 = 1, 0 or 1 = 1
        // 010 (2) дописываем впереди нули
        // 111 далее побитово
        System.out.println(item1 & item2); // 0
        // 101
        // 010
        // 000

        boolean f1 = false;
        boolean f2 = true;
        System.out.println(f1 & f2); // 0 * 1 = 0
        System.out.println(f1 && f2); // 0 --> = 0

        String s = "qwer"; // 4, 0...3
        boolean b2 = s.length() >= 5 && s.charAt(4) == '1';
        System.out.println(b2); // false
        s = "qwe1"; // 4, 0...3
        b2 = s.length() >= 5 && s.charAt(4) == '1';
        System.out.println(b2); // false
        // b2 = s.length() >= 5 & s.charAt(4) == '1'; // вычисляются обе части
        // System.out.println(b2); // Index 4 out of bounds for length 4
        s = "qwwe1"; // 5, 0...4
        b2 = s.length() >= 5 && s.charAt(4) == '1';
        System.out.println(b2); // true

    }
}
