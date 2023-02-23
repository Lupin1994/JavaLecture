package Java_Project;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // String s = null;
        // System.out.println(s);
    //     float f = 123.45f;
    //     double d = 123.48;
    //     System.out.println(f);
    //     System.out.println(d);
        // char ch =1233;
        // System.out.println(ch);
        // var i = 123.68;
        // System.out.println(i);
        // System.out.println(getType(i));
        // int i = 23_123_34;
        // System.out.println(i);
        // System.out.println(Integer.MAX_VALUE);
        // String s = "qwer";
        // s.charAt(1);
        // int a = 123;
        // System.out.println(a++); // Сначала он пишет и только потом выполняет
        // System.out.println(a); // Тут он выводит уже с учетом инкремента
        // System.out.println(++a); // А при такой записи он сначала прибавляет,а потом выводит
        // int a =123;
        // a = --a-a--;
        // System.out.println(++a);
        // boolean f = 123 != 234;
        // System.out.println(f);
        //int a = 18;
        // 10010
        // a = a<<1;
        //System.out.println(a>>1);
        //1001
        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);
        // System.out.println(a & b);
        // System.out.println(a ^ b);
        // 101       101      101
        // 010       010      010
        // 111       000      111
        //String s = "qwer1"; // 4 , 0...3
        //String s = "qwr1"; // 4 , 0...3
        //boolean b = s.length()>= 5 && s.charAt(4) == '1';
        //boolean b = s.length()>= 5 & s.charAt(4) == '1';
        //System.out.println(b);
        // byte b = Byte.parseByte("1112");
        // System.out.println(b);
        Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Hi, %s!, ",name);
        // iScanner.close();
        //Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x,y,x+y);
        // iScanner.close();
        // int a = 1, b = 2;
        // int c = a+b;
        // String res = a + "+" + b + "=" +c;
        // System.out.println(res);
        // String s = "qwe";
        // int a = 123;
        // String q = s+a;
        // System.out.println(q);
        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00
        // lib.sayHi();
        // int a =1;
        // switch (a) {
        //     case 1: System.out.println("a");
        //         break;
        //     case 10: System.out.println('b');
        //         break;
//         Циклы
// Цикл — это многократное выполнение одинаковой
// последовательности действий.
// В java доступны следующие циклы:
// ● цикл while;
// ● цикл do while;
// ● цикл for; и его модификация for in
        // int value = 321;
        // int count = 0;
        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);
        //-------------------------------------
        // int value = 321;
        // int count = 0;
        // do {
        // value /= 10;
        // count++;
        // } while (value != 0);
        // System.out.println(count);
        //--------------------------
        // int s = 0;
        // for (int i = 1; i <= 10; i++) {
        // s += i;
        // }
        // System.out.println(s);
        //----------------------------------
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //     System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //--------------------------------------
        // int arr[] = new int[10];
        // for (int item : arr) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
            } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }

    }
    // static String getType(Object o){
    // return o.getClass().getSimpleName();
    // }
}

/**
 * Типы данных:
 * 1)ссылочные ()
 * 2)примитивные (boolean,int,short,long,etc. float,double,Char)
 */
