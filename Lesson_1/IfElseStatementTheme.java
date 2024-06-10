public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean maleGender = false;
        if (!maleGender) {
            System.out.print("Ты — женского пола,");
        } else {
            System.out.print("Ты — мужского пола,");
        }

        int age = 17;
        if (age > 18) {
            System.out.print(" совершеннолетний,");
        } else {
            System.out.print(" не совершеннолетний,");
        }

        double height = 1.79;
        if (height < 1.8) {
            System.out.print(" рост меньше 1.8 м.,");
        } else {
            System.out.print(" рост больше 1.8 м.,");
        }

        char capitalLetter = "Xam".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println(" имя начинается на 'M'");
        } else if (capitalLetter == 'I') {
            System.out.println(" имя начинается на 'I'");
        } else {
            System.out.println(" имя начинается на " + "'" + capitalLetter + "'");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 2;
        int b = 3;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(b + " > " + a);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int srcNum = -11;

        if (srcNum == 0) {
            System.out.println(srcNum);
        } else {
            System.out.print(srcNum + " является ");

            if (srcNum > 0) {
                System.out.print("положительным и ");
            } else {
                System.out.print("отрицательным и ");
            }

            if (srcNum % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        }

        // Решение 2
        // int srcNum = -1;
        // if (srcNum == 0) {
        //    System.out.println(srcNum);
        // } else {
        //    String positivity = (srcNum > 0) ? "положительным" : "отрицательным";
        //    String parity = (srcNum % 2 == 0) ? "четным" : "нечетным";
        //    System.out.printf("%d является %s и %s", srcNum, positivity, parity);
        // }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        a = 123;
        b = 133;

        boolean isEqualOnes = (a % 10) == (b % 10);
        boolean isEqualTens = (a / 10 % 10) == (b / 10 % 10);
        boolean isEqualHundreds = (a / 100) == (b / 100);

        if (!isEqualOnes && !isEqualTens && !isEqualHundreds) {
            System.out.println("В числах нет равных разрядов");
        } else {
            System.out.println("В числах " + a + " и " + b + " одинаковые цифры в разрядах:");
            if (isEqualOnes) {
                System.out.println("1 = " + a % 10);
            }
            if (isEqualTens) {
                System.out.println("2 = " + a / 10 % 10);
            }
            if (isEqualHundreds) {
                System.out.println("3 = " + a / 100);
            }
        }

        // Решение 2
//        boolean hasDigit = false;
//        int onesA = a % 10;
//        int tensA = a / 10 % 10;
//        int hundredsA = a / 100;
//        int onesB = b % 10;
//        int tensB = b / 10 % 10;
//        int hundredsB = b / 100;
//
//        System.out.println("Исходные числа: " + a + ", " + b);
//        if (onesA == onesB) {
//            System.out.println("В первом разряде (единицы) одинаковая цифра " + onesA);
//            hasDigit = true;
//        }
//        if (tensA == tensB) {
//            System.out.println("Во втором разряде (десятки) одинаковая цифра " + tensA);
//            hasDigit = true;
//        }
//        if (hundredsA == hundredsB) {
//            System.out.println("В третьем разряде (сотни) одинаковая цифра " + b);
//            hasDigit = true;
//        }
//
//        if (!hasDigit) {
//            System.out.println("Равных чисел нет");
//        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u0057';
        System.out.print("Символ " + someChar + " является ");

        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("маленькой буквой");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("большой буквой");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("цифрой");
        } else {
            System.out.println("ни буквой ни цифрой");
        }

        // Решение 2
//        if (Character.isLowerCase(someChar)) {
//            System.out.println("маленькой буквой");
//        } else if (Character.isUpperCase(someChar)) {
//            System.out.println("большой буквой");
//        } else if (Character.isDigit(someChar)) {
//            System.out.println("цифрой");
//        } else {
//            System.out.println("ни буквой ни цифрой");
//        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int rate = 10;

        if (deposit < 100_000) {
            rate = 5;
        } else if (deposit <= 300_000) {
            rate = 7;
        }
        double interest = deposit / 100 * rate;

        System.out.println("Сумма вклада: " + deposit +
                "\nСумма начисленного %: " + interest +
                "\nИтоговая сумма с %: " + (deposit + interest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        int csPercent = 92;
        int csGrade = 2;

        if (csPercent > 91) {
            csGrade = 5;
        } else if (csPercent > 73) {
            csGrade = 4;
        } else if (csPercent > 60) {
            csGrade = 3;
        }

        System.out.println("История - " + historyGrade +
                "\nПрограммирование - " + csGrade +
                "\nСредний балл оценок по предметам - " + ((historyGrade + csGrade) / 2f) +
                "\nСредний % по предметам - " + ((historyPercent + csPercent) / 2f));

        System.out.println("\n8. Расчет годовой прибыли");
        int rent = 5_000;
        int costPrice = 9_000;
        int revenue = 13_000;

        int profit = 12 * (revenue - costPrice - rent);
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }
    }
}