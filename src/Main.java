public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");

        int[] arr = generateRandomArray();
        int allPayments = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int payments = arr[i];
            allPayments = payments + allPayments;
        }
        System.out.println("Сумма трат за месяц составила " + allPayments + " рублей");
    }

    public static void task2() {
        System.out.println("Задание 2");

        int[] arr = generateRandomArray();
        int maxPayments = 99_999;
        int minPayments = 200_001;
        for (int i = 0; i < arr.length - 1; i++) {
            if (maxPayments < arr[i]) {
                maxPayments = arr[i];
            }
            if (minPayments > arr[i]) {
                minPayments = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayments + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxPayments + " рублей");
    }

    public static void task3() {
        System.out.println("Задание 3");

        int[] arr = generateRandomArray();
        int allPayments = 0;
        for (int payments = 0; payments < arr.length - 1; payments++) {
            allPayments = allPayments + arr[payments];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (float) allPayments / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i]);
        }
    }
}
