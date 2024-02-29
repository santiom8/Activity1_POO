public class Exercise1 {
    public static void main(String[] args) {
//      Ejercicio Resuelto No 4
        int edJuan = 9, edAlber, edadAna, edadMama;

        edAlber = (edJuan * 2) / 3;
        edadAna = (edJuan * 4) / 3;
        edadMama = (edJuan + edAlber + edadAna);

        System.out.println("Las edades son: ");
        System.out.println("Alberto: " + edAlber);
        System.out.println("Juan: " + edJuan);
        System.out.println("Ana: " + edadAna);
        System.out.println("Mama: " + edadMama);
    }
}
