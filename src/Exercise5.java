public class Exercise5 {
    public static void main(String[] args) {
        double radius = 5;
        double area, length;

        area = Math.PI * (Math.pow(radius, 2));
        length = 2 * Math.PI * radius;

        System.out.println("Radio del circulo: " + radius);
        System.out.println("Area del circulo: " + area);
        System.out.println("Longitud de la circunferencia del circulo: " + length);
    }
}
