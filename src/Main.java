public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        // Afișăm informații despre dreptunghi
        System.out.println("Informații despre dreptunghi:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Arie: " + rectangle.calculateArea());
        System.out.println("Perimetru: " + rectangle.calculatePerimeter());

        // Modificăm proprietățile folosind setter-ele
        rectangle.setWidth(7.5);
        rectangle.setLength(15.0);

        // Afișăm informații actualizate despre dreptunghi
        System.out.println("\nInformații actualizate despre dreptunghi:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Arie: " + rectangle.calculateArea());
        System.out.println("Perimetru: " + rectangle.calculatePerimeter());
    }
}
