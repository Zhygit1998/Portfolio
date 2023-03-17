public class Parallelepiped {
    int height = 5;
    int length = 6;
    int width = 10;
    int volume;
    public void volume () {
        int volume;
        volume = height*length*width;
        System.out.println("Oбъем параллелепипеда = " + volume + " см^3");
    }
    public void lengthTotal(){
        int lengthTotal;
        lengthTotal = height+length+width;
        System.out.println("Общая длинна = " + lengthTotal + " см");
    }
}
