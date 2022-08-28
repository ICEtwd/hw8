import java.time.LocalDate;

public class Main {

    //Task 1
    private static void year (String[] args) {
        int year = 2024;
        if (year % 4 == 0 || year % 400 == 0 && year %100 != 0 ) {
            System.out.println(year + " - Год високосный");
        }else {
            System.out.println(year + " - Год не високосный");
        }
    }

    //Task 2
    private static String getClientOS (String name) {
        if (name.equals("IOS")) {
        }
        return name;
    }

    private static int getYearOS (int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (phoneYear < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        return phoneYear;
    }


    //Task 3

    private static int getDeliver (int distance){
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


        //Task 2

        String osName = "IOS";
        int phYear = 2023;
        String clientOS = getClientOS(osName);
        int phoneYear = getYearOS(phYear);
        System.out.println(clientOS);


        //Task 3

        int lenght = 95;
        int deliveryDays = getDeliver(lenght);
        System.out.println("Доставка займет " + deliveryDays + " дня");

    }
}