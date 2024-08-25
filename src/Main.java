import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa un número entre 1 y 14, o 15 para terminar:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4");
                    break;
                case 5:
                    System.out.println("Has seleccionado la opción 5");
                    break;
                case 6:
                    System.out.println("Has seleccionado la opción 6");
                    break;
                case 7:
                    System.out.println("Has seleccionado la opción 7");
                    break;
                case 8:
                    System.out.println("Has seleccionado la opción 8");
                    break;
                case 9:
                    System.out.println("Has seleccionado la opción 9");
                    break;
                case 10:
                    System.out.println("Has seleccionado la opción 10");
                    break;
                case 11:
                    System.out.println("Has seleccionado la opción 11");
                    break;
                case 12:
                    System.out.println("Has seleccionado la opción 12");
                    break;
                case 13:
                    System.out.println("Has seleccionado la opción 13");
                    break;
                case 14:
                    System.out.println("Has seleccionado la opción 14");
                    break;
                case 15:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 15);

        scanner.close();
    }
}