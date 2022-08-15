public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Task 01.
        int total = 0;
        for (int sum : arr) {
            total += sum;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        System.out.println("--------------------------------------");

        // Task 02.
        int minValueOfDay = Integer.MAX_VALUE;
        int maxValueOfDay = Integer.MIN_VALUE;

        for (int j : arr) {
            if (minValueOfDay > j) {
                minValueOfDay = j;
                continue;
            }
            if (maxValueOfDay < j) {
                maxValueOfDay = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValueOfDay + " рублей. " +
                "Максимальная сумма трат за день составила " + maxValueOfDay + " рублей.");
        System.out.println("--------------------------------------");

        // Task 03.
        System.out.println("Средняя сумма трат за месяц составила " + total / arr.length + " рублей");
        System.out.println("--------------------------------------");

        // Task 04.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }
}