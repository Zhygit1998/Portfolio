import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Airplanes {
    public void result() {
        String fighter = buildAirplane("Jet", "F22 Raptor");
        System.out.println(fighter);
        String airliner1 = buildAirplane("AirLiner", "Aerobus 737", 120);
        System.out.println(airliner1);
        String airliner2 = buildAirplane("AirLiner", "Aerobus 777", 120, 28);
        System.out.println(airliner2);
        orderTicket();//Придумывал велосипед, пока было свободное время)
    }

    public static String buildAirplane(String brand, String model) {
        String resultFighter = "Тип самолета: " + brand + ", " + "Модель: " + model;
        return resultFighter;

    }

    public static String buildAirplane(String brand, String model, int economyClass) {
        String airliner1 = "Тип самолета: " + brand + ", " + "Модель: " + model
                + ", кол. пасажиров эконом класса: " + economyClass;
        return airliner1;


    }

    public static String buildAirplane(String brand, String model, int economyClass, int businessClass) {
        String airliner2 = "Тип самолета: " + brand + ", " + "Модель: " + model
                + ", кол. пасажиров эконом класса: " + economyClass + ", пассажиров бизне скласса: " + businessClass;
        return airliner2;

    }

    public static String orderTicket() {
        int[] monthUp = {1, 3, 5, 7, 8, 10, 12};
        System.out.println("Введите дату вылета и мы подберем подходящий для вас рейс");
        Scanner in = new Scanner(System.in);
        String typeAirliner, model, typeClass;
        int day , month , year, place, typeClassCount;
        System.out.print("Месяц - ");
        while (true) {
            month = in.nextInt();
            if (!(month <= 12 && month > 0 && month == (int) month))
                System.out.println("Введены неверные данные, попробуйте еще");
            else break;
        }
        System.out.print("День - ");
        boolean found = Arrays.stream(monthUp).boxed().collect(Collectors.toSet()).contains(month);
        if (found) {
            while (true) {
                day = in.nextInt();
                if (!(day < 32 && day > 0 && day == (int) day))
                    System.out.println("Введены неверные данные, попробуйте еще");
                else break;
            }
        }
       else if (month == 2) {
            while (true) {
                day = in.nextInt();
                if (!(day < 29 && day > 0 && day == (int) day))
                    System.out.println("Введены неверные данные, попробуйте еще");
                else break;
            }
        }
       else {
            while (true) {
                day = in.nextInt();
                if (!(day < 31 && day > 0 && day == (int) day))
                    System.out.println("Введены неверные данные, попробуйте еще");
                else break;
            }
        }
        year = 2020;
        System.out.print("Быбирите тип посадочного места 1 или 2 "+"\n"+ "1 - Эконом"+"\n"+ "2 - Бизнес"+"\n");
        typeClassCount = in.nextInt();
        if (typeClassCount==1) {
            model = "Aerobus 777";
            place = 28;
            typeClass = "Эконом";
        } else {
            model = "Aerobus 737";
            place = 120;
            typeClass = "Бизнес";
        }
        System.out.println("Дата вашего вылета: " + day + "." + month + "." + year);
        System.out.println("Класс посадочного места - " + typeClass + ", Ваше место номер - " + (int) (1 + Math.random() * place));
        typeAirliner = buildAirplane("AirLiner", model);
        System.out.println(typeAirliner);
        System.exit(0);
        return orderTicket();
    }
}