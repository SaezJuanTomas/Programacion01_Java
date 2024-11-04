import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CargarNotas {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = new Alumno();

            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            alumno.setNombreCompleto(nombre);

            System.out.print("Ingrese el legajo del alumno: ");
            long legajo = scanner.nextLong();
            alumno.setLegajo(legajo);

            ArrayList<Nota> notas = new ArrayList<Nota>();
            boolean salirNotas = false;
            scanner.nextLine();

            while (!salirNotas) {
                Nota nota = new Nota();
                System.out.print("Ingrese el nombre de la catedra: ");
                String nombreCatedra = scanner.nextLine();
                nota.setCatedra(nombreCatedra);

                System.out.print("Ingrese la nota: ");
                double notaExamen = scanner.nextDouble();
                nota.setNotaExamen(notaExamen);

                notas.add(nota);

                System.out.print("Desea salir de la carga de notas? (true/false): ");
                salirNotas = scanner.nextBoolean();
                scanner.nextLine();
            }

            alumno.setNotas(notas);
            alumnos.add(alumno);
        }
        for (Alumno alumno : alumnos) {
            System.out.println("Datos Alumno: " + alumno.getNombreCompleto() + ", Legajo: " + alumno.getLegajo());
            ArrayList<Nota> notas = alumno.getNotas();
            double sumaNotas = 0;
            for (Nota nota : notas) {
                System.out.println("Nota: " + nota.getCatedra() + " : " + nota.getNotaExamen());
                sumaNotas += nota.getNotaExamen();
            }
            double promedio = sumaNotas / notas.size();
            System.out.println("El promedio del alumno es: " + promedio);
        }

        scanner.close();
    }
}
