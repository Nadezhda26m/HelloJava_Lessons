public class Array {
    public static void main(String[] args) {

        // одномерные
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
        arr = new int[10];
        System.out.println(arr.length); // 10

        System.out.println(arr[3]); // 0 (значение int по умолчанию)
        arr[3] = 14;
        System.out.println(arr[3]); // 14

        int[] brr;
        int prr[]; // так тоже можно, но есть особенности

        // многомерные
        int[] vrr[] = new int[3][5];
        for (int[] line : vrr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        System.out.println();

        // Массивы массивов со своими особенностями
        int[][] trr = new int[3][5];
        for (int i = 0; i < trr.length; i++) {
            for (int j = 0; j < trr[i].length; j++) {
                System.out.printf("%d ", trr[i][j]);
            }
            System.out.println();
        }
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0


    }
}
