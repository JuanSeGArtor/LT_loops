package loops;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int op;
        do{
            System.out.println("Ingresa el número de la operación que requieras realizar");
            System.out.println("(0) Salir - (1) Suma - (2) Resta - (3) Multiplicación - (4) División");
            op = scan.nextInt();

            int num1;
            int num2;

            switch(op) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("Ingresa un 1er número");
                    num1 = scan.nextInt();
                    System.out.println("Ingresa un 2do número");
                    num2 = scan.nextInt();

                    System.out.println("El resultado de la suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("Ingresa un 1er número");
                    num1 = scan.nextInt();
                    System.out.println("Ingresa un 2do número");
                    num2 = scan.nextInt();

                    System.out.println("El resultado de la resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACIÓN");
                    System.out.println("Ingresa un 1er número");
                    num1 = scan.nextInt();
                    System.out.println("Ingresa un 2do número");
                    num2 = scan.nextInt();

                    System.out.println("El resultado de la multiplicación es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("DIVISIÓN");
                    System.out.println("Ingresa un 1er número");
                    num1 = scan.nextInt();

                    System.out.println("Ingresa un 2do número");
                    num2 = scan.nextInt();
                    // Validar que no se divida entre 0 hasta que ingrese un número distinto
                    while(num2==0) {
                        System.out.println("Por favor señor usuario, ingrese un número distinto, ya que no se pueden realizar divisiones entre 0");
                        num2 = scan.nextInt();
                    };

                    System.out.println("El resultado de la división es: " + (num1/num2));
                    break;
            }
        }while(op!=0);
    }
}
