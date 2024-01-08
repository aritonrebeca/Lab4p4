public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Getter pentru width
    public double getWidth() {
        return width;
    }

    // Setter pentru width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter pentru length
    public double getLength() {
        return length;
    }

    // Setter pentru length
    public void setLength(double length) {
        this.length = length;
    }

    // Metoda pentru a calcula aria
    public double calculateArea() {
        return width * length;
    }

    // Metoda pentru a calcula perimetrul
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
