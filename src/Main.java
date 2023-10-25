public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
    }

    public static void test1() {
        System.out.println("               Задача №1      ");
        byte number1 = 127;
        short number2 = 466;
        int number3 = 456841;
        long number4 = 4568545456L;
        float number5 = 45689.45f;
        double number6 = 4588440.45456;
        System.out.println("Значение переменной = " + number1 + " с типом byte.");
        System.out.println("Значение переменной = " + number2 + " с типом short.");
        System.out.println("Значение переменной = " + number3 + " с типом int.");
        System.out.println("Значение переменной = " + number4 + " с типом long.");
        System.out.println("Значение переменной = " + number5 + " с типом float.");
        System.out.println("Значение переменной = " + number6 + " с типом double.");


    }

    public static void test2() {
        System.out.println("               Задача №2      ");
        byte number1 = 67;
        short number2 = -159;
        short number3 = 569;
        int number4 = 27897;
        long number5 = 987678965549L;
        float number6 = 27.12f;
        double number7 = 2.786;
        System.out.println("byte = " + number1);
        System.out.println("short = " + number2);
        System.out.println("short = " + number3);
        System.out.println("int = " + number4);
        System.out.println("long = " + number5);
        System.out.println("float = " + number6);
        System.out.println("double = " + number7);

    }

    public static void test3() {
        System.out.println("               Задача №3      ");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        int totalStudent = class1 + class2 + class3;
        int result = paper / totalStudent;
        System.out.println("Людмила Павловна - 23 ученика в классе.");
        System.out.println("Анна Сергеевна - 27 ученика в классе.");
        System.out.println("Екатерина Андреевна - 30 ученика в классе.");
        System.out.println("Количество бумаги на всех 480 листов. ");
        System.out.println("Количество бумаги на каждого ученика рассчитано по " + result + " лестов");
    }

    public static void test4() {
        System.out.println("               Задача №4      ");
        byte bottle = 16;
        byte minute2 = 2;
        byte minute20 = 20;
        byte hoursMinute = 60;
        byte hoursDay = 24;
        int day1Minute = hoursDay * hoursMinute;
        int day3Minute = day1Minute * 3;
        int monthDay31Minute = day1Minute * 31;
        int result1 = minute20 / minute2 * bottle;
        int result2 = day1Minute / minute2 * bottle;
        int result3 = day3Minute / minute2 * bottle;
        int result4 = monthDay31Minute / minute2 * bottle;
        System.out.println("Проезводство бутылок за 2 мин 16шт.");
        System.out.println("За 20 мин машина произвела - " + result1 + " штук бутылок.");
        System.out.println("За один день машина произвела - " + result2 + " штук бутылок.");
        System.out.println("За Три дня машина произвела - " + result3 + " штук бутылок.");
        System.out.println("За один месяц машина произвела- " + result4 + " штук бутылок.");
    }

    public static void test5() {
        System.out.println("               Задача №5      ");
        System.out.println("На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.");
        System.out.println("На один класс уходит 2 банки белой и 4 банки коричневой краски.");
        System.out.println("Сколько банок каждой краски было куплено?");
        byte paintWhite = 2;
        byte paintBrown = 4;
        byte paintTotal = 120;
        int class1 = paintWhite + paintBrown;
        int TotalClass = paintTotal / class1;
        int paintWhiteTotal = TotalClass * paintWhite;
        int paintBrownTotal = TotalClass * paintBrown;

        System.out.println("В школе, где " + TotalClass + " классов, нужно " + paintWhiteTotal + " банок белой краски и " +
                paintBrownTotal + " банок коричневой краски.");

    }

    public static void test6() {
        System.out.println("               Задача №6      ");
        byte banana1 = 80;
        byte milk1 = 105;
        byte iceCream1 = 100;
        byte egg1 = 70;
        int banana5 = banana1 * 5;
        int milk2 = milk1 * 2;
        int iceCream2 = iceCream1 * 2;
        int egg4 = egg1 * 4;
        float gram = banana5 + milk2 + iceCream2 + egg4;
        float kilogramm = gram / 1000;
        System.out.println("Бананы — 5 штук (1 банан = 80 грамм) Масса = " + banana5 + " грамм.");
        System.out.println("Молоко — 200 мл (100 мл = 105 грамм) Масса = " + milk2 + " грамм.");
        System.out.println("Мороженое-пломбир — 2 брикета (1 = 100 грамм) Масса = " + iceCream2 + " грамм.");
        System.out.println("Яйца сырые – 4 яйца (1 яйцо — 70 грамм) Масса = " + egg4 + " грамм.");
        System.out.println("Общая масса Коктейля в граммах  " + gram + " гр");
        System.out.println("Общая масса Коктейля в килограммах " + kilogramm + " кг");

    }

    public static void test7() {
        System.out.println("               Задача №7      ");
        short gram250 = 250;
        short gram500 = 500;
        int gram1Kilogram = 1000;
        int targetKilogram = 7;
        int target250GramDay = targetKilogram * gram1Kilogram / gram250;
        int target500GramDay = targetKilogram * gram1Kilogram / gram500;
        System.out.println("     Цель похудеть на 7 килограмм.");
        System.out.println("Если худеть по 250 грамм в день понадобится = " + target250GramDay + " дней.");
        System.out.println("Если худеть по 500 грамм в день понадобится = " + target500GramDay + " дней.");
    }

    public static void test8() {
        System.out.println("               Задача №8      ");

        byte monthYears = 12;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float percent = 0.10f;

        float mashaNewSalary = mashaSalary + (mashaSalary * percent);
        float mashaSalaryDifference = mashaSalary * percent;
        float mashaSalaryYearDifference = mashaSalaryDifference * monthYears;

        float denisNewSalary = denisSalary + (denisSalary * percent);
        float denisSalaryDifference = denisSalary * percent;
        float denisSalaryYearDifference = denisSalaryDifference * monthYears;

        float kristinaNewSalary = kristinaSalary + (kristinaSalary * percent);
        float kristinaSalaryDifference = kristinaSalary * percent;
        float kristinaSalaryYearDifference = kristinaSalaryDifference * monthYears;

        System.out.println("Маша получала в месяц - " + mashaSalary + " рублей. Теперь получает в месяц - "
                + mashaNewSalary + " рублей. Годовой доход вырос на - " +
                mashaSalaryYearDifference + " рублей.");

        System.out.println("Денис получала в месяц - " + denisSalary + " рублей. Теперь получает в месяц - "
                + denisNewSalary + " рублей. Годовой доход вырос на - " +
                denisSalaryYearDifference + " рублей.");

        System.out.println("Кристина получала в месяц - " + kristinaSalary + " рублей. Теперь получает в месяц - "
                + kristinaNewSalary + " рублей. Годовой доход вырос на - " +
                kristinaSalaryYearDifference + " рублей.");

    }
}
