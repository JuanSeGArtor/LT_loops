package loops;

import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // loops.Animal por defecto a mostrar
        Animal animal = new Animal(
                "Lobo Gris",
                "Canis lupus",
                "Mamífero carnívoro, vive en montañas, praderas y bosques, mide de 120 a 200 centímetros y pesa entre 18 y 79 kilogramos",
                "Su aullido"
        );

        System.out.println("ZOO");
        int op;
        do{
            System.out.println("Selecciona una opción");
            System.out.println("(0) Salir - (1) Ver info de un animal - (2) Agregar un nuevo animal");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    animal.printInfo();
                    break;
                case 2:
                    System.out.println("Agrega información del nuevo animal");
                    System.out.println("Ingresa nombre:");
                    String pNombre = sc.nextLine();
                    System.out.println("Ingresa especie:");
                    String pEspecie = sc.nextLine();
                    System.out.println("Ingresa caracteristicas:");
                    String pCaracteristicas = sc.nextLine();
                    System.out.println("Ingresa preferencia:");
                    String pPreferencia = sc.nextLine();

                    animal = new Animal(pNombre, pEspecie, pCaracteristicas, pPreferencia);

                    System.out.println(pNombre + " agregado éxitosamente");
                    break;
            }
        }while(op!=0);

        sc.close();
    }
}

