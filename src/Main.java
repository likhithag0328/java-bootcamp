import com.tw.step10.Rect;
import com.tw.step10.Square;

public class Main {
    public static void main(String[] args) {
        Rect rectangle = new Rect(7, 2);
        int rectArea = rectangle.area();
        int rectPerimeter = rectangle.perimeter();

        System.out.printf("Area:%d\n", rectArea);
        System.out.printf("Perimeter:%d", rectPerimeter);

        Square square = new Square(7);
        int squareArea = square.area();
        int squarePerimeter = square.perimeter();

        System.out.printf("Area:%d\n", squareArea);
        System.out.printf("Perimeter:%d", squarePerimeter);

    }

}
