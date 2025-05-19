import com.tw.step10.Rect;
import com.tw.step10.Square;

public class Main {
    public static void main(String[] args) {
        Rect rectangle = new Rect(7, 2);
        int rectArea = rectangle.area();
        int rectPerimeter = rectangle.perimeter();

        System.out.printf("Rectangle Area:%d\n", rectArea);
        System.out.printf("Rectangle Perimeter:%d\n", rectPerimeter);

        Square square = new Square(7);
        int squareArea = square.area();
        int squarePerimeter = square.perimeter();

        System.out.printf("Square Area:%d\n", squareArea);
        System.out.printf("Square Perimeter:%d\n", squarePerimeter);

    }

}
