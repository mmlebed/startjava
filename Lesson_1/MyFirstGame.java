public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 50;
        int myNumber = 10;

        System.out.println("Start!!!");

        while (myNumber != computerNumber) {
            if (myNumber > computerNumber) {
                System.out.println("Вы ввели число = " + myNumber + " > чем то, что ввел компьютер!!");
                //myNumber = myNumber - 1;
                myNumber--;
            } if (myNumber < computerNumber) {
                System.out.println("Вы ввели число = " + myNumber + " < чем то, что ввел компьютер!!");
                //myNumber = myNumber + 1;
                myNumber++;
            } 
        }

        System.out.println("Вы угадали!!!");
        System.out.println("Вы победили!!!");
    }
}