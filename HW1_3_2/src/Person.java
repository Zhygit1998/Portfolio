public class Person {
    public static void main(String[] args) {
        String result1 = personInfo("Will", "Smith", "New York", "2936729462846");
        String result2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String result3 = personInfo("Shelock", "Holmes", "London", "37742123513");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static String personInfo(String name, String lastName, String city, String number) {
        String result = "Позвонить гражданину " + name + " " + lastName + " из города " + city + " можно по номеру " + number + ".";
        return result;


    }
}