import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa un número entre 1 y 14, o 15 para terminar:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    String nombre = "Fernando";  // Declara un String con tu nombre
                    System.out.println("Bienvenido " + nombre);
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    System.out.println("Ingrese nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Bienvenido " + nombre);
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    System.out.println("Ingrese numero 1");
                    int num1 = sc.nextInt();
                    System.out.println("Ingrese numero 2");
                    int num2 = sc.nextInt();

                    System.out.println("Suma: " + (num1 + num2));
                    System.out.println("Resta: " + (num1 - num2));
                    System.out.println("Multiplicacion: " + (num1 * num2));
                    System.out.println("Division: " + (float)num1 / num2);
                    System.out.println("Modulo: " + (num1 % num2));
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4");
                    System.out.println("Ingrese numero 1");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese numero 2");
                    num2 = sc.nextInt();
                    if (num1 > num2) {
                        System.out.println(num1 + " es mayor que " + num2);
                    } else if (num1 < num2) {
                        System.out.println(num1 + " es menor que " + num2);
                    } else {
                        System.out.println(num1 + " es igual a " + num2);
                    }
                    break;
                case 5:
                    System.out.println("Has seleccionado la opción 5");
                    System.out.println("Ingrese numero");
                    num1 = sc.nextInt();
                    if (num1 % 2 == 0){
                        System.out.println(num1 + " es divisible por 2");
                    } else {
                        System.out.println(num1 + " no es divisible por 2");
                    }
                    break;
                case 6:
                    System.out.println("Has seleccionado la opción 6");
                    System.out.println("Ingrese precio");
                    double num01 = sc.nextDouble();
                    System.out.println("El precio con IVA seria: " + (num01 * 1.21));
                    break;
                case 7:
                    System.out.println("Has seleccionado la opción 7");
                    int i = 1;
                    while (i <= 100) {
                        System.out.println(i);
                        i++;
                    }
                    break;
                case 8:
                    System.out.println("Has seleccionado la opción 8");
                    i = 1;
                    for (i = 1; i <= 100; i++) {
                        System.out.println(i);
                    }
                    break;
                case 9:
                    System.out.println("Has seleccionado la opción 9");
                    i = 1;
                    for (i = 1; i <= 100; i++) {
                        if (i % 2 == 0) {
                            if (i % 3 == 0) {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                case 10:
                    System.out.println("Has seleccionado la opción 10");
                    do {
                        System.out.println("Ingrese numero mayor que 0");
                        num1 = sc.nextInt();
                    } while (num1 <= 0);
                    System.out.println("Numero ingresado: " + num1 + " es mayor que 0");
                    break;
                case 11:
                    System.out.println("Has seleccionado la opción 11");
                    String contraseña = "1234";
                    int contraseñaCounter = 0;
                    while (contraseñaCounter < 3) {
                        System.out.println("Ingrese contraseña");
                        String intento = sc.nextLine();
                        if (intento.equals(contraseña)) {
                            System.out.println("Acceso correcto");
                            break;
                        } else {
                            System.out.println("Incorrecto");
                            contraseñaCounter = contraseñaCounter + 1;
                        }
                    }
                    if (contraseñaCounter >= 3){
                        System.out.println("Superado la cantidad de intentos");
                    }
                    break;
                case 12:
                    System.out.println("Has seleccionado la opción 12");
                    System.out.println("Lunes: 1");
                    System.out.println("Martes: 2");
                    System.out.println("Miercoles: 3");
                    System.out.println("Jueves: 4");
                    System.out.println("Viernes: 5");
                    System.out.println("Sabado: 6");
                    System.out.println("Domingo: 7");
                    do {
                        System.out.println("Que numero de dia quiere consultar si es laboral?");
                        num1 = sc.nextInt();
                    } while (num1 < 1 || num1 > 7);
                    if (num1 <= 5) {
                        System.out.println("El dia es laboral");
                    } else {
                        System.out.println("El dia no es laboral");
                    }
                    break;
                case 13:
                    System.out.println("Has seleccionado la opción 13");
                    System.out.print("Introduce un número para verificar si es primo: ");
                    int numero = sc.nextInt();

                    boolean esPrimo = true;
                    if (numero <= 1) {
                        esPrimo = false;
                    } else {
                        int raiz = (int) Math.sqrt(numero);
                        for (i = 2; i <= raiz; i++) {
                            if (numero % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }
                    if (esPrimo) {
                        System.out.println(numero + " es un número primo.");
                    } else {
                        System.out.println(numero + " no es un número primo.");
                    }
                    break;
                case 14:
                    System.out.println("Has seleccionado la opción 14");
                    int x = new Double(Math.random() * 100).intValue();
                    int intentoCount = 0;
                    int intento;
                    System.out.println("x: " + x);
                    do {
                        System.out.println("Ingrese un numero entre 0 y 100.");
                        intento = sc.nextInt();
                        if (intento < x){
                            System.out.println("Es muy bajo");
                            intentoCount = intentoCount + 1;
                        } else if (intento > x) {
                            System.out.println("Es muy alto");
                            intentoCount = intentoCount + 1;
                        } else {
                            System.out.println("El numero es correcto");
                        }
                    } while (intento != x);
                        System.out.println("Numero de intentos necesarios: " + intentoCount);
                    break;
                case 15:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 15);

        sc.close();
    }
}