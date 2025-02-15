public class Rectangle {
    public static void calculatePerimeter() {
        int length = 10; // Example length of the rectangle
        int width = 5;   // Example width of the rectangle

        int perimeter = 2 * (length + width); // Perimeter formula: 2 * (length + width)

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle.calculatePerimeter();
    }
}