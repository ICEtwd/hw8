import java.time.LocalDate;

public class Main {

    //Task 1
    public static int selectYear (){
        int year = 2021;
        return year;
    }

    //Task 2
    public static String getClientOS (String name) {
        if (name.equals("IOS")) {
            return name;
        }
        return name;
    }

    public static int getYearOS (int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (phoneYear < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        return phoneYear;
    }


    //Task 3

    public static int deliver (int distance){
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
            int total = selectYear();
        if (total % 4 == 0 && total % 100 != 0 || total % 400 == 0 && total %100 != 0) {
            System.out.println(total + " - Год високосный");
        }else {
            System.out.println(total + " - Год не високосный");
        }

        //Task 2

        String osName = "IOS";
        int phYear = 2015;
        String clientOS = getClientOS(osName);
        int phoneYear = getYearOS(phYear);
        System.out.println(clientOS);


        //Task 3

        int lenght = 95;
        int deliveryDays = deliver(lenght);
        System.out.println("Доставка займет " + deliveryDays + " дня");

    }
}