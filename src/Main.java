import cine.Cine;
import cine.Director;
import cine.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine();
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\n================ MENÚ PRINCIPAL ================");
            System.out.println("1. Agregar película");
            System.out.println("2. Mostrar cartelera");
            System.out.println("3. Ver detalle de una película");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.print("\nIngrese su rol (ej. admin): ");
                    String rol = scanner.nextLine().trim();

                    System.out.print("Título de la película: ");
                    String titulo = scanner.nextLine().trim();

                    System.out.print("Género: ");
                    String genero = scanner.nextLine().trim();

                    System.out.print("Duración (en minutos): ");
                    int duracion;
                    duracion = Integer.parseInt(scanner.nextLine().trim());

                    System.out.print("Nombre del director: ");
                    String nombreDirector = scanner.nextLine().trim();

                    System.out.print("Nacionalidad del director: ");
                    String nacDirector = scanner.nextLine().trim();

                    Director director = new Director(nombreDirector, nacDirector);
                    Pelicula pelicula = new Pelicula(titulo, genero, duracion, director);

                    cine.setAuxPelicula(pelicula);
                    cine.agregarPelicula(rol);
                    break;
                case "2":
                    cine.mostrarCartelera();
                    break;
                case "3":
                    System.out.print("\nIngrese el índice de la película a consultar: ");
                    int index = Integer.parseInt(scanner.nextLine().trim());
                    cine.mostrarDetallePeliculaa(index);
                    break;
                case "4":
                    System.out.println("\nCerrando el sistema. ¡Hasta pronto!");
                    ejecutando = false;
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese un número del 1 al 4.");
                    break;
            }
        }

        scanner.close();
    }
}