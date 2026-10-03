package cine;

public class Cine {
    private Pelicula[] listaPeliculas;
    private Pelicula auxPelicula;


    public Cine() {
        this.listaPeliculas = new Pelicula[5];
    }

    public void agregarPelicula(String rol) {
        if (!esAdmin(rol)) {
            System.out.println("Permiso denegado: Solo administradores pueden agregar películas.");
            return;
        }

        if (auxPelicula == null) {
            System.out.println("No hay películas para agregar.");
            return;
        }

        int i = 0;
        boolean aniadido = false;

        while (i < listaPeliculas.length && !aniadido) {
            if (listaPeliculas[i] == null) {
                listaPeliculas[i] = auxPelicula;
                aniadido = true;
                this.auxPelicula = null;
                System.out.println("Película agregada a la cartelera.");
            } else if (i == (listaPeliculas.length) - 1) {
                System.out.println("La cartelera de este fin de semana está llena.");
            }
            i++;
        }
    }

    public void mostrarCartelera() {
        System.out.println("\n========== CARTELERA ACTUAL ==========");
        boolean hayPeliculas = false;
        for (int i = 0; i < listaPeliculas.length; i++) {
            if (listaPeliculas[i] != null) {
                System.out.println("  [" + i + "] " + listaPeliculas[i].getTitulo() + " (" + listaPeliculas[i].getGenero() + ")");
                hayPeliculas = true;
            }
        }
        if (!hayPeliculas) {
            System.out.println("  (No hay películas registradas en este momento)");
        }
        System.out.println("======================================");
    }

    public void mostrarDetallePeliculaa(int index) {
        if (index < 0 || index >= listaPeliculas.length) {
            System.out.println("Índice fuera de rango. Debe ser entre 0 y " + (listaPeliculas.length - 1) + ".");
            return;
        }
        if (listaPeliculas[index] == null) {
            System.out.println("No hay ninguna película asignada en el índice [" + index + "].");
            return;
        }
        System.out.println(listaPeliculas[index].toString());
    }

    public boolean esAdmin(String rol) {
        return rol.equals("admin");
    }

    public void setAuxPelicula(Pelicula auxPelicula) {
        this.auxPelicula = auxPelicula;
    }
}
