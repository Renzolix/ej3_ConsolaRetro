public class ConsolaRetro {
    String modelo;
    String numeroSerie;
    boolean encendida = false; // Inicializado explícitamente en false

    public ConsolaRetro(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void encender() {
        this.encendida = true;
        System.out.println("La consola " + modelo + " (S/N: " + numeroSerie + ") se ha encendido.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("La consola " + modelo + " (S/N: " + numeroSerie + ") se ha apagado.");
    }

    public void mostrarEstado() {
        if (this.encendida) {
            System.out.println("Estado actual de la consola " + modelo + ": ENCENDIDA");
        } else {
            System.out.println("Estado actual de la consola " + modelo + ": APAGADA");
        }
    }

    public static void main(String[] args) {
        ConsolaRetro consola = new ConsolaRetro("Game Boy Color", "GBC-1998-MENDOZA");

        System.out.println("--- Secuencia de Prueba de Consola ---");
        consola.mostrarEstado();
        consola.encender();
        consola.mostrarEstado();
        consola.apagar();
        consola.mostrarEstado();
    }
}