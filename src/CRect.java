import lombok.Data;

@Data public class CRect {
    private int height;
    private int width;


    public CRect() {
        this.height = 0;
        this.width = 0;
        System.out.println("Brak wymiarów");
    }
    public CRect(int width, int height) {
        this.height = height;
        this.width = width;
        if (height == width) {
            System.out.println("Stworzyłeś kwadrakt o boku równym " + this.height);
        } else {
            System.out.println("Stworzyłeś Prostokąt o szerokosci " + this.width + " i wysokosci " + this.height);
        }


    }
    public CRect(int height) {
        this.height = height;
        this.width = height;
        height++;
        System.out.println("Stworzyłeś kwadrakt o boku równym " + this.height);
    }
    public void showValues() {
        if (height == this.width) {
            System.out.println("Kwadrat o boku: " + width);
        } else {
            System.out.println("Prostokąt o szerokosci " + width + " i wysokosci " + height);
        }
    }
}
