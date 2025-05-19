import com.tw.step10.Rect;

public class Main {
    public static void main(String[] args) {
    Rect rectangle = new Rect(7,2);
    int area = rectangle.area();
    int perimeter = rectangle.perimeter();

    System.out.printf("Area:%d\n",area);
    System.out.printf("Perimeter:%d",perimeter);
    }

}
