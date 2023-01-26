import java.util.Scanner;

public class ConsoleScanner {
    public static void main(String[] args) {

        // Строки
        Scanner iScanner = new Scanner(System.in); // откуда и что забирать
        System.out.printf("name: "); // name: Сергей
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name); // Привет, Сергей!
        // iScanner.close();

        System.out.println();
        // Некоторые примитивы
        // Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: "); // 4
        int x = iScanner.nextInt();
        System.out.printf("double a: "); // 2
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y); // 4 + 2,000000 = 6,000000
        // iScanner.close();

        System.out.println();
        // Проверка на соответствие получаемого типа
        // Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // проверка валидности данных
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}
