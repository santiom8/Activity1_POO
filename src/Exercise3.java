public class Exercise3 {
    public static void main(String[] args) {
//      Ejercicio Propuesto No 12
        int valuePerHour = 5000;
        int hoursWorked = 48;
        float retention;
        float netSalary;
        float grossSalary;

        grossSalary = valuePerHour * hoursWorked;
        retention = grossSalary * 0.125f;
        netSalary = grossSalary - retention;
        System.out.println("Horas trabajadas: " + hoursWorked);
        System.out.println("Salario bruto: " + grossSalary);
        System.out.println("Retencion: " + retention);
        System.out.println("Salario neto: " + netSalary);
    }
}
