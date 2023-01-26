public class LoopConstructs {
    public static void main(String[] args) {

        // условный оператор
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c); // 2

        // int a = 1;
        // int b = 2;
        // int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;
        System.out.println(c); // 2

        // тернарный оператор
        // int a = 1;
        // int b = 2;
        int min = a < b ? a : b;
        System.out.println(min); // 1

        // Оператор выбора
        int mounth = 5;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            // ...
            default:
                text = "mistake";
                break;
        }
        System.out.println(text); // mistake

        int t = 15;
        switch (t) {
            case 1:
                System.out.println("a");
                break;
            case 5:
            case 7:
            case 15:
                System.out.println("b"); // b
                break;
        }

        // Циклы
        // while;
        // do while;
        // for; и его модификация for in

        // цикл while
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count); // 3

        // Цикл do while
        value = 321;
        count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count); // 3

        // continue, break
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i); // 1 3 5 7 9
        }

        // цикл for
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s); // 55

        // Вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // цикл for : (только для коллекций)
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println(); // 0 0 0 0 0 0 0 0 0 0

        int[] brr = new int[]{1, 2, 5, 8, 6};
        for (int p : brr) {
            System.out.print((p + 5) + " "); // 6 7 10 13 11
        }


    }
}
