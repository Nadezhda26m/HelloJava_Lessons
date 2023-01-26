import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.*;
public class WorkWithFiles {
    // public static void main(String[] args) {
    // // Создание и запись \ дозапись
    // // import java.io.FileWriter;
    // // import java.io.IOException;
    //     try (FileWriter fw = new FileWriter("file1.txt", false)) {
    //         // true - дозапись
    //         // false - перезапись
    //         fw.write("line 1");
    //         fw.append('\n');
    //         fw.append('2');
    //         fw.append('\n');
    //         fw.write("line 3");
    //         fw.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    //     // line 1
    //     // 2
    //     // line 3
    // }

    // public static void main(String[] args) throws Exception {
    //     // Чтение, Вариант посимвольно
    //     // import java.io.FileReader
    //     FileReader fr = new FileReader("file1.txt");
    //     int c;
    //     while ((c = fr.read()) != -1) {
    //         // System.out.print(" >" + c + "(c): ");
    //         // >108(c): l >105(c): i >110(c): n >101(c): e >32(c):   >49(c): 1 >10(c):
    //         char ch = (char) c;
    //         if (ch == '\n') {
    //             System.out.print(ch);
    //         } else {
    //             System.out.print(ch);
    //         }
    //     }
    // }

    public static void main(String[] args) throws Exception {
        // Вариант построчно
        // import java.io.BufferedReader;
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
        // == line 1 ==
        // == 2 ==
        // == line 3 ==
    }



}
