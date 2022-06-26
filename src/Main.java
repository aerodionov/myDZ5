import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Домашнее задание "1.6 Массивы ч.2
        //Задание 1
        int[] accountBook = generateRandomArray();
        int amountForMonth = 0;

        for (int i = 0; i < accountBook.length; i++) {
            amountForMonth = amountForMonth + accountBook[i];
        }

        /* печать сгенерированного массива при необходимости проверить дальнейшие вычисления
                for (int i = 0; i < accountBook.length; i++) {
            System.out.println("Дата: " + i + ", Сумму за день: " + accountBook[i]);;
        }
        System.out.println("");
        */

        System.out.println("Сумма трат за месяц составила " + amountForMonth + " рублей");

        //Задание 2
        System.out.println("");
        int maxSpend = accountBook[0];
        int minSpend = accountBook[0];
        for (int i = 0; i < accountBook.length; i++) {
            if (accountBook[i] < minSpend) {
                minSpend = accountBook[i];
            }
            if (accountBook[i] > maxSpend) {
                maxSpend = accountBook[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей. Максимальная сумма трат за день составила " + maxSpend + " рублей");

        //Задание 3
        System.out.println("");
        float middleSpend = (float) amountForMonth / accountBook.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleSpend + " рублей");
        System.out.println("");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int length = reverseFullName.length - 1; length >= 0; length--) {
            System.out.print(reverseFullName[length]);
        }



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}