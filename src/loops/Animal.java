package loops;

public class Animal {
    private String nombre;
    private String especie;
    private String caracteristicas;
    private String preferencia;

    public Animal(String pNombre, String pEspecie, String pCaracteristicas, String pPreferencia) {
        this.nombre = pNombre;
        this.especie = pEspecie;
        this.caracteristicas = pCaracteristicas;
        this.preferencia = pPreferencia;
    }

    public void printInfo(){
        System.out.println("loops.Animal info:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Características: " + this.caracteristicas);
        System.out.println("Preferencia: " + this.preferencia);
    }
}
