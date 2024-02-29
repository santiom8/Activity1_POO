public class Exercise2 {
    public static void main(String[] args) {
//      Ejercicio Resuelto No 5
        double suma = 0;
        int x = 20;
        suma = suma + x;
        double y = 40;
        x += (int) Math.pow(y,2);
        suma += x / y;
        System.out.println("El valor de la suma es: " + suma);
    }
}
