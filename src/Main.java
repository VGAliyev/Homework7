import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 7\n");

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Task 1");
        int months = 0;
        int myMoney = 0;
        int result = 2_459_000;
        while (myMoney < result) {
            myMoney += 15_000;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + myMoney + " рублей.");
        }
        System.out.println("\n");
    }

    public static void task2() {
        System.out.println("Task 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Task 3");
        int years = 10;
        int i = 0;
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        while (i <= years) {
            System.out.println("Год " + i + ", численность населения составляет " + population);
            population = population + population * (fertility - mortality) / 1000;
            i++;
        }
        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("Task 4");
        double deposit = 15000;
        int result = 12_000_000;
        int months = 0;
        String formatedDeposit;
        while (deposit < result) {
            deposit = deposit + deposit * 7 / 100;
            formatedDeposit = String.format("%.2f", deposit); // Оставление двух цифр после запятой (копейки)
            months++;
            System.out.println("Месяц " + months + ", на счету " + formatedDeposit + " рублей.");
        }
        formatedDeposit = String.format("%.2f", deposit);
        System.out.println("Итого потребуется " + months + " месяцев, сумма при этом составит " + formatedDeposit + " рублей");
        System.out.println("\n");
    }

    public static void task5() {
        System.out.println("Task 5");
        double deposit = 15000;
        int result = 12_000_000;
        int months = 0;
        String formatedDeposit;
        while (deposit < result) {
            deposit = deposit + deposit * 7 / 100;
            formatedDeposit = String.format("%.2f", deposit); // Оставление двух цифр после запятой (копейки)
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", на счету " + formatedDeposit + " рублей.");
            }
        }
        formatedDeposit = String.format("%.2f", deposit);
        System.out.println("Итого потребуется " + months + " месяцев, сумма при этом составит " + formatedDeposit + " рублей");
        System.out.println("\n");
    }

    public static void task6() {
        System.out.println("Task 6");
        double deposit = 15000;
        int years = 9;
        int months = 0;
        String formatedDeposit;
        while ((months / 12) < years) {
            deposit = deposit + deposit * 7 / 100;
            formatedDeposit = String.format("%.2f", deposit);
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений " + formatedDeposit + " рублей.");
            }
        }
        System.out.println("\n");
    }

    public static void task7() {
        System.out.println("Task 7");
        int friday = 3;
        int days = 0;
        while (days <= 31) {
            if ((days - friday) % 7 == 0) {
                System.out.println("Сегодлня пятница, " + days + "-е число. Необходимо подготовить отчёт.");
            }
            days++;
        }
        System.out.println("\n");
    }

    public static void task8() {
        System.out.println("Task 8");
        int cometYear = 79;
        java.time.LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
        int year = currentDate.getYear() - 200; // Начало периода (за 200 лет до текущего года)
        int endPeriod = currentDate.getYear() + 100;   // Конец периода (через 100 лет после текущего года)
        while (year < endPeriod) {
            if (year % cometYear == 0) {
                System.out.println(year);
            }
            year++;
        }
        System.out.println("\n");
    }
}