import java.util.Scanner;

public class Soccer {
    public void soccerClub () {
        int result, point, k;
        String teamNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер футбольной команды от 1 до 10 "+ "\n");
        while (true) {
            result = scanner.nextInt();
            if (!(result < 11 && result > 0 && result == (int) result))
                System.out.println("Введены неверные данные, попробуйте еще");
            else break;
        }
        teamNumber = teamNumber(result);
        System.out.println("Выбранная вами команда " + teamNumber);
        System.out.print("Введите очки вашей команды за сезон от 0 до 200 "+ "\n");
        while (true) {
            point = scanner.nextInt();
            if (!(point < 200 && point > -1 && point == (int) point))
                System.out.println("Введены неверные данные, попробуйте еще");
            else break;
        }
        System.out.print("Введите коэфициент ставок на команду от 1 до 10 "+ "\n");
        while (true) {
            k = scanner.nextInt();
            if (!(k < 11 && k > 0 && k == (int) k))
                System.out.println("Введены неверные данные, попробуйте еще");
            else break;
        }
        int pointScore = point * k;
        String resultScore = score(pointScore);
        System.out.println("Количество очков выбранной вами команды - " + pointScore + ". " + teamNumber + resultScore);
    }

    public static String teamNumber(int result) {
        String teamNumber;
        switch (result) {
            case 1:
                teamNumber = "Manchester United";
                break;
            case 2:
                teamNumber = "Juventus";
                break;
            case 3:
                teamNumber = "Arsenal";
                break;
            case 4:
                teamNumber = "Chelsea";
                break;
            case 5:
                teamNumber = "Real Madrid";
                break;
            case 6:
                teamNumber = "Barcelona";
                break;
            case 7:
                teamNumber = "Liverpool";
                break;
            case 8:
                teamNumber = "Bavaria";
                break;
            case 9:
                teamNumber = "Munich";
                break;
            case 10:
                teamNumber = "Paris Saint-Germain";
                break;
            default:
                teamNumber = "Неправильное значение";
                System.exit(0);
                break;

        }
        return teamNumber;
    }

    public static String score(int pointScore) {
        String result;
        if (pointScore < 1000) {
            result = " в следующем сезоне будет играть в чемпионате страны.";
        } else if (pointScore >= 1000 && pointScore < 2000) {
            result = " в следующем сезоне будет играть в лиге европы.";
        } else {
            result = " в следующем сезоне будет играть в лиге чемпионов.";
        }
        return result;

    }


}
