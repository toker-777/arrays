import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");

        byte[] byteArr = new byte[3];
        float[] floatArr = {1.57f, 7.654f, 9.986f};
        int[] intArr = new int[6];
        byteArr[0] = 1;
        byteArr[1] = 2;
        byteArr[2] = 3;
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;
        intArr[5] = 60;
        System.out.print(byteArr[0] + " ");
        System.out.print(byteArr[1] + " ");
        System.out.println(byteArr[2] + " ");
        System.out.print(floatArr[0] + " ");
        System.out.print(floatArr[1] + " ");
        System.out.println(floatArr[2] + " ");
        System.out.print(intArr[0] + " ");
        System.out.print(intArr[1] + " ");
        System.out.print(intArr[2] + " ");
        System.out.print(intArr[3] + " ");
        System.out.print(intArr[4] + " ");
        System.out.println(intArr[5] + " ");
    }

    public static void task2() {
        System.out.println("Задание 2");

        byte[] byteArr = new byte[3];
        float[] floatArr = {1.57f, 7.654f, 9.986f};
        int[] intArr = new int[6];
        byteArr[0] = 1;
        byteArr[1] = 2;
        byteArr[2] = 3;
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;
        intArr[5] = 60;
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
    }

    public static void task3() {
        System.out.println("Задание 3");

        byte[] byteArr = new byte[3];
        float[] floatArr = {1.57f, 7.654f, 9.986f};
        int[] intArr = new int[6];
        byteArr[0] = 1;
        byteArr[1] = 2;
        byteArr[2] = 3;
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;
        intArr[5] = 60;
        System.out.print(byteArr[2] + ", ");
        System.out.print(byteArr[1] + ", ");
        System.out.println(byteArr[0] + " ");
        System.out.print(floatArr[2] + ", ");
        System.out.print(floatArr[1] + ", ");
        System.out.println(floatArr[0] + " ");
        System.out.print(intArr[5] + ", ");
        System.out.print(intArr[4] + ", ");
        System.out.print(intArr[3] + ", ");
        System.out.print(intArr[2] + ", ");
        System.out.print(intArr[1] + ", ");
        System.out.println(intArr[0] + " ");
    }

    public static void task4() {
        System.out.println("Задание 4");

        byte[] byteArr = new byte[3];
        byteArr[0] = 1;
        byteArr[1] = 2;
        byteArr[2] = 3;
        for (byte i = 0; i < byteArr.length; i++) {
            if (byteArr[i] % 2 != 0) {
                if (i == byteArr.length - 1) {
                    System.out.println(byteArr[i] + 1 + " ");
                    break;
                }
                System.out.print(byteArr[i] + 1 + ", ");
            } else {
                System.out.print(byteArr[i] + ", ");
            }
        }
    }
}

