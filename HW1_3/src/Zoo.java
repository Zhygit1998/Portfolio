public class Zoo {
    int bear = 12;
    int giraffe = 14;
    int elephant = 16;
    int tiger = 18;
    int parrot = 24;
    int raccoon = 20;
    public void result() {
        int year1 = countAnimals(bear, giraffe,elephant,tiger,parrot);
        System.out.println("Общее количество зверей в зоопарке: - " + year1);
        int year2 = countAnimalsNestYear(bear, giraffe,elephant,tiger,parrot);
        System.out.println("Общее количество зверей в зоопарке через год: - " + year2);
        int yearRaccoon = countAnimalsNestYear(bear, giraffe,elephant,tiger,parrot,raccoon);
        System.out.println("Общее количество зверей в зоопарке через год, с завезенными енотами: - " + yearRaccoon);

    }

    public static int countAnimals(int bear, int giraffe, int elephant, int tiger, int parrot) {
        int resultSum = bear + giraffe + elephant + tiger + parrot;
        return resultSum;
    }

    public static int countAnimalsNestYear(int bear, int giraffe, int elephant, int tiger, int parrot) {
        double bear1, giraffe1, elephant1, tiger1, parrot1;
        //Прирост зверей в процентах на следующий год
        bear1 = 0.25;
        giraffe1 = 0.5;
        elephant1 = 0.75;
        tiger1 = 0.28;
        parrot1 = 1.25;
        int result1 = (int) ((bear + bear * bear1) + (giraffe + giraffe * giraffe1) + (elephant + elephant * elephant1) + (tiger + tiger * tiger1) + (parrot + parrot * parrot1));
        return result1;
    }

    public static int countAnimalsNestYear(int bear, int giraffe, int elephant, int tiger, int parrot, int raccoon){
        //Прирост Енотов
        double racoon1 = 0.8;
        int result2 = (int)(countAnimalsNestYear(bear,giraffe,elephant,tiger,parrot) + (raccoon+raccoon*racoon1));
        return result2;
    }
}
