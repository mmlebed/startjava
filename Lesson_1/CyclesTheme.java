public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int finish = 21;
        int counter = start;
        int sumEvenNums = 0;
        int sumOddNums = 0;

        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
        } while (++counter <= finish);

        System.out.println("В отрезке " + "[" + start + ", " + finish + "]" +
                " сумма четных чисел = " + sumEvenNums + ", а нечетных = " + sumOddNums);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = -1;
        int c = 5;
        int max = b;
        int min = a;

        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        // Решение 2
        // if (a > b) {
        //     min = b;
        //     max = a;
        // }

        // if (c > max) {
        //     max = c;
        // } 

        // if (c < min) {
        //     min = c;
        // }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;

        while (srcNum > 0) {
            int digit = srcNum % 10;
            System.out.print(digit);
            sum += digit;
            srcNum /= 10;
        }
        System.out.println("\nСумма его цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int size = 5;

        // Решение 1
        for (int i = 1; i < 30; ) {
            for (int j = 0; j < size; j++) {
                if (i < 30) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
                i += 2;
            }
            System.out.println();
        }

        // Решение 2: с использованием тернарного оператора
        // for (int i = 1; i < 30; ) {
        //     for (int j = 0; j < size; j++) {
        //         System.out.printf("%3d", (i < 30 ? i : 0));
        //         i += 2;
        //     }
        //     System.out.println();
        // }

        // Решение 3: код вывода нулей вынесен в отдельный цикл
        // int count = 0;
        // for (int i = 1; i < 24; i += 2) {
        //     if (count % size == 0) {
        //         System.out.println();
        //         count = 0;
        //     }
        //     System.out.printf("%3d", i);
        //     count++;
        // }

        // int needZeros = size - count;
        // if (needZeros != size) {
        //     for (int i = needZeros; i > 0; i--) {
        //         System.out.printf("%3d", 0);
        //     }
        // }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        srcNum = 3242592;
        int srcNumCopy = srcNum;
        int countTwos = 0;

        while (srcNumCopy > 0) {
            if (srcNumCopy % 10 == 2) {
                countTwos++;
            }
            srcNumCopy /= 10;
        }

        String state = " (нечетное) ";
        if (countTwos % 2 == 0) {
            state = " (четное) ";
        }
        System.out.println("В " + srcNum + state + "количество двоек - " + countTwos);

        // то же самое, но с помощью тернарного оператора
        // String state = countTwos % 2 == 0 ? " (четное) " : " (нечетное) ";
        // System.out.println("В " + srcNum + state + "количество двоек - " + countTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int cols = 5;
        int rows = 5;
        while (rows > 0) {
            while (cols > 0) {
                System.out.print("#");
                cols--;
            }
            System.out.println();
            rows--;
            cols = rows;
        }
        System.out.println();

        // Решение 1
        cols = 1;
        rows = 5;
        int mark = 1;

        do {
            do {
                System.out.print("$");
                cols--;
            } while (cols > 0);
            System.out.println();
            rows--;
            mark = rows > 2 ? ++mark : --mark;
            cols = mark;
        } while (rows > 0);

        // Решение 2
        // cols = 0;
        // rows = 5;
        // do {
        //     System.out.println('$');
        //     do {
        //         System.out.print('$');
        //         rows--;
        //     } while (rows == 3);
        //     cols++;
        // } while (cols <= 3);

        // Решение 3: с одним циклом
        // rows = 0;
        // cols = 0;
        // do {
        //     cols = rows < 3 ? ++cols : --cols;
        //     rows++;
        //     System.out.printf("%" + cols + "." + cols + "s%n", "$$$");
        // } while(rows < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%s%12s%14s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 122; i++) {
            if (((i <= '0') && (i % 2 != 0)) || ((i >= 'a') && (i % 2 == 0))) {
                System.out.printf("%n  %-12d%-13c%s", i, i, Character.getName(i));
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        srcNumCopy = srcNum;
        int reverse = 0;

        while (srcNumCopy > 0) {
            reverse = reverse * 10 + srcNumCopy % 10;
            srcNumCopy /= 10;
        }

        state = " является ";
        if (srcNum != reverse) {
            state = " не является ";
        }
        System.out.println("Число " + srcNum + state + "палиндромом");

        System.out.println("\n9. Проверка, является ли число счастливым");
        srcNum = 123321;
        int rightHalf = srcNum % 1000;
        int leftHalf = srcNum / 1000;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;

        while (leftHalf > 0) {
            sumRightHalf += rightHalf % 10;
            rightHalf /= 10;
            sumLeftHalf += leftHalf % 10;
            leftHalf /= 10;
        }

        state = " является ";
        if (sumRightHalf != sumLeftHalf) {
            state = " не является ";
        }
        System.out.println("Число " + srcNum + state + "счастливым");
        System.out.println("Сумма цифр " + (srcNum % 1000) + " = " + sumRightHalf +
                "\nСумма цифр " + (srcNum / 1000) + " = " + sumLeftHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("\tТАБЛИЦА ПИФАГОРА");

        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("--+------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }

        // Решение 2
//        for (int i = 1; i < 10; i++) {
//            if (i != 1) {
//                System.out.printf("%d ", i);
//            } else {
//                System.out.print("  ");
//            }
//            System.out.print("|");
//            for (int j = 2; j < 10; j++) {
//                System.out.printf("%3d", i * j);
//            }
//            if (i == 1) {
//                System.out.print("\n--+------------------------");
//            }
//            System.out.println();
//        }
    }
}