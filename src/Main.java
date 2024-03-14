import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массивы, часть 2
        // Задача 1
        int [] expenses = {3500, 7600, 6656, 855, 8};
        int resultExpenses = 0;

        for (int expense : expenses){
            resultExpenses += expense;
        }

        System.out.printf("Сумма трат за месяц составила %d рублей\n\n", resultExpenses);

        // Задача 2
        int [] weekExpenses = {666, 54534, 6, 2324, 9};

        Arrays.sort(weekExpenses);

        int minExpense = weekExpenses[0];
        int maxExpenses = weekExpenses[weekExpenses.length-1];

        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей.\n\n", minExpense, maxExpenses);

        // Задача 3
        int [] anotherWeekExpenses = new int[] {1, 22, 333, 4444, 55555};
        double totalExpenses = 0;

        for (int currentExpense : anotherWeekExpenses){
            totalExpenses += currentExpense;
        }

        double avgExpense = totalExpenses / anotherWeekExpenses.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n\n", avgExpense);

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}