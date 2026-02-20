public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante() {
    }
//construcctor con todos los parametros
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    //metodos propios
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("nota1: " + this.getNota1());
        System.out.println("nota2: " + this.getNota2());
        System.out.println("nota3: " + this.getNota3());
    }
    public void asignarNotas(double n1, double n2, double n3){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }


    public double calcularPromedio(){
        return (this.nota1+this.nota2+this.nota3)/3;
    }

    public String estaAprobado(double notaMinima){
        double promedio = calcularPromedio();
        if(promedio>=notaMinima){
            return ("Esta aprobado");
        } else {
            return ("Esta desaprobado");
        }
    }
}
