import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
//      Ejercicio Propuesto No 14
        double number = 9;
        double square, cube;

        square =  Math.pow(number, 2);
        cube = Math.pow(number, 3);

        System.out.println("Numero: " + number);
        System.out.println("El numero ingresado al cuadrado es: " + square);
        System.out.println("El numero ingresado al cubo es: " + cube);
    }
}
