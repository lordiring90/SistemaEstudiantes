public class Main {
    public static void main(String[] args) { // <--- Te faltaba esta línea mágica

        // 1. Creamos el objeto Sofia
        Estudiante e1 = new Estudiante("Sofia", 3.5, 3.9, 4.5);
        // 2. Usamos tus métodos propios
        System.out.println("========================================");
        e1.mostrarInformacion();

        System.out.println("El promedio es: " + e1.calcularPromedio());
        System.out.println("Estado: " + e1.estaAprobado(3.0));
        System.out.println();
        System.out.println("========================================");
        Estudiante e2 = new Estudiante("laura");
        e2.asignarNotas(2.1,3.1,1.9);
        e2.mostrarInformacion();
        System.out.println("El promedio es: " + e2.calcularPromedio());
        System.out.println("Estado: " + e2.estaAprobado(4.0));
        System.out.println("========================================");
    }
}
