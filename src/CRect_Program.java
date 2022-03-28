import java.util.Scanner;

public class CRect_Program {
    public static void main(String[] args) {
        int height, width;
        CRect rect1, rect2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz utworzyc kwadrat (1) czy prostokat (2)?");
        int fig = scanner.nextInt();
        if (fig == 1) {
            System.out.println("Podaj bok: ");
            width = scanner.nextInt();
            rect1 = new CRect(width);
        } else {
            System.out.println("Podaj szerokość i wysokość: ");
            height = scanner.nextInt();
            width = scanner.nextInt();
            rect1 = new CRect(height, width);
        }
        System.out.println("Chcesz utworzyc kwadrat (1) czy prostokat (2)?");
        fig = scanner.nextInt();
        if (fig == 1) {
            System.out.println("Podaj bok: ");
            width = scanner.nextInt();
            rect2 = new CRect(width);
        } else {
            System.out.println("Podaj szerokość i wysokość: ");
            height = scanner.nextInt();
            width = scanner.nextInt();
            rect2 = new CRect(height, width);
        }

        rect1.showValues();
        rect2.showValues();


    }
}
