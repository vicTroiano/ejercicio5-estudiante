import java.util.ArrayList;

public class Inscripcion {
    private Estudiante estudiante;
    private ArrayList<Materia> materias;
    //metodo agregar materia

    //constructor
    public Inscripcion(Estudiante estudiante){
        this.estudiante = estudiante;
        setMaterias(new ArrayList<Materia>());
    }
    //getter y setter

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
}
