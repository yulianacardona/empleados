import java.util.Scanner;

public class yuliana {
    public yuliana() {
    }

    public static void main(String[] args) {
        System.out.println("Hola empleado, por favor digite:");
        Scanner entrada = new Scanner(System.in);
        System.out.println("su apellido");
        String apellido = entrada.nextLine();
        System.out.println("su nombre");
        String nombre = entrada.nextLine();
        System.out.println("su edad");
        int edad = entrada.nextInt();
        System.out.println("¿cuantas horas trabaja?");
        int horas = entrada.nextInt();
        System.out.println("su nombre y apellidos son " + apellido + nombre);
        System.out.println("su edad es " + edad);
        System.out.println("usted trabaja: " + horas + " horas" + " por lo cual su salario es de " + 800000 * horas);
    }
}
