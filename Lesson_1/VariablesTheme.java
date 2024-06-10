public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte ramSizeGb = 16;
        short countCores = 4;
        char systemDisc = 'C';
        int pcPrice = 70_000;
        long ssdSizeGb = 128;
        float monitorWidthPx = 1024;
        double monitorHeightPx = 768;
        boolean isPc = false;

        System.out.println("Размер ОЗУ - " + ramSizeGb + "Гб" +
                "\nКоличество ядер - " + countCores +
                "\nСистемный диск - " + systemDisc +
                "\nСтоимость PC - " + pcPrice + "руб." +
                "\nОбъем SSD - " + ssdSizeGb + "Гб" +
                "\nРазрешение монитора - " + monitorWidthPx + "x" + monitorHeightPx + " пикселей" +
                "\nЭто PC? - " + isPc);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int totalSum = penPrice + bookPrice;
        int discountPrice = totalSum / 100 * 11;

        System.out.println("Общая стоимость товара без скидки: " + totalSum + "руб.");
        System.out.println("Сумма скидки: " + discountPrice + "руб.");
        System.out.println("Общая стоимость товара со скидкой " + (totalSum - discountPrice) + "руб.");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // Решение 2
        // System.out.println(
        //         "   J    a  v     v  a\n" +
        //         "   J   a a  v   v  a a\n" +
        //         "J  J  aaaaa  V V  aaaaa\n" +
        //         " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        char charMax = Character.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("Исходное значение byte: " + byteMax +
                "\nПосле инкремента: " + ++byteMax +
                "\nПосле декремента: " + --byteMax);

        System.out.println("\nИсходное значение short: " + shortMax +
                "\nПосле инкремента: " + ++shortMax +
                "\nПосле декремента: " + --shortMax);

        System.out.println("\nИсходное значение char: " + (int) charMax +
                "\nПосле инкремента: " + (int) ++charMax +
                "\nПосле декремента: " + (int) --charMax);

        System.out.println("\nИсходное значение int: " + intMax +
                "\nПосле инкремента: " + ++intMax +
                "\nПосле декремента: " + --intMax);

        System.out.println("\nИсходное значение long: " + longMax +
                "\nПосле инкремента: " + ++longMax +
                "\nПосле декремента: " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("\tИсходные значения: a = " + a + "; b = " + b);
        System.out.println("a. С помощью третьей переменной");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("\tПосле перестановки: a = " + a + "; b = " + b);

        System.out.println("\nb. С помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("\tПосле перестановки: a = " + a + "; b = " + b);

        System.out.println("\nc. С помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("\tПосле перестановки: a = " + a + "; b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = srcNum / 10 % 10;
        int ones = srcNum % 10;

        System.out.println("Число " + srcNum + " содержит:" +
                "\n\tсотен - " + hundreds +
                "\n\tдесятков - " + tens +
                "\n\tединиц - " + ones +
                "\n\tСумма его цифр = " + (hundreds + tens + ones) +
                "\n\tПроизведение = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = totalSeconds / 60 % 60;
        int ss = totalSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss); 
    }
}