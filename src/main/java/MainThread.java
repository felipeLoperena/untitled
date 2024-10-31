
import com.example.data.DataProcessor;
import com.example.entity.Alumno;
import java.util.ArrayList;
import java.util.List;

//Ejemplo de multihilos
public class MainThread {

    List<Alumno> listaAlumnos;// Datos de ejemplo

    public List<Alumno> contenedorAlumnos(){
        listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno(1,"Paco Jerte", true));
        listaAlumnos.add(new Alumno(2,"Mercurio", false));
        listaAlumnos.add(new Alumno(3,"Techito", false));
        listaAlumnos.add(new Alumno(4,"Cutyo Kioto", false));
        listaAlumnos.add(new Alumno(5,"Pinozuarez", false));
        listaAlumnos.add(new Alumno(6,"Rey Instance", false));
        listaAlumnos.add(new Alumno(7,"MEons", false));
        listaAlumnos.add(new Alumno(8,"upgrade", false));
        listaAlumnos.add(new Alumno(9,"Medico", false));
        listaAlumnos.add(new Alumno(10,"MM CC", false));
        return listaAlumnos;
    }

    public void createThread(){
        // Crear hilos para procesar tareas en paralelo
        List<Thread> threads = new ArrayList<>();
        for (Alumno listaAlumno : listaAlumnos) {
            Thread thread1 = new DataProcessor(listaAlumno);
            thread1.start();
            threads.add(thread1);
        }

        // Esperar a que todos los hilos terminen
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MainThread main = new MainThread();

        //Cargamos la lista con el contenedor de los alumnos
        main.listaAlumnos = main.contenedorAlumnos();

        //Inicializamos los hilos
        main.createThread();
    }
}
