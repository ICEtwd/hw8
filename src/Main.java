import java.time.LocalDate;

public class Main {

    //Task 1
    private static void printYear (int year) {

        if (year % 4 == 0 || year % 400 == 0 && year %100 != 0 ) {
            System.out.println(year + " - Год високосный");
        }else {
            System.out.println(year + " - Год не високосный");
        }
    }


    //Task 2


    private static void printClientOS (String osName, int phoneYear ) {


        int currentYear = LocalDate.now().getYear();
        if (phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName);
        } else {
            System.out.println("Установите версию приложения для " + osName);
        }
    }


    //Task 3

    private static int calculateDeliver (int distance){
        int startInterval = 20;
        int interval = 40;
        int day = 1;
        if (distance <= startInterval) {
            day = 1;
        } else {
            day = day + (int) Math.ceil((distance - startInterval) / interval) + 1;
        }
        return day;
    }

    public static void main(String[] args) {

        //Task 1

        printYear(2024);

        //Task 2

        printClientOS("IOS",2023);

        //Task 3

        int lenght = 95;
        int deliveryDays = calculateDeliver(lenght);
        System.out.println("Доставка займет " + deliveryDays + " дня");

    }
}