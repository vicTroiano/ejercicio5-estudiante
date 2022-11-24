import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    //metodo agregar curso a materia
    public void agregarCurso(Curso curso) {
        getCursos().add(curso);
    }

    //constructor
    public Materia(String nombre){
        this.nombre = nombre;
        setCursos(new ArrayList<Curso>());
        setProfesores(new ArrayList<Profesor>());
    }


    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
}
