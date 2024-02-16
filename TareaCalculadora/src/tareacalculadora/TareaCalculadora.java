/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacalculadora;

import java.util.Scanner;

/**
 *
 * @Natalia Ixmatul 
 */
public class TareaCalculadora {

    
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);

        int op;

        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Tablas de Multiplicar");
            System.out.println("6. Salir");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                   
                    System.out.println("Suma");
                    System.out.println("Ingresa el primer digito");
                    double nom1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo digito");
                    double nom2 = scanner.nextDouble();
                    double solve = nom1 + nom2;
                    System.out.println("La suma es: " + solve);
                    break;
                case 2:
                   
                    System.out.println("Resta");
                    System.out.println("Ingresa el primer digito");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo digito");
                    double num2 = scanner.nextDouble();
                    double sol = num1 - num2;
                    System.out.println("La resta es: " + sol);
                    break;
                case 3:
                   
                    System.out.println("Multiplicación");
                    System.out.println("Ingresa el primer digito");
                    double dig1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo digito");
                    double dig2 = scanner.nextDouble();
                    double solv = dig1 * dig2;
                    System.out.println("La multiplicación es: " + solv);
                    break;
                case 4:
                   
                    System.out.println("División");
                    System.out.print("Ingrese el numerador: ");
                    int num = scanner.nextInt();
                    int den;
                    do {
                        System.out.print("Ingrese el denominador (debe ser diferente de cero): ");
                        den = scanner.nextInt();
                        if (den == 0) {
                            System.out.println("Error: El denominador no puede ser cero. Inténtelo de nuevo.");
                        }
                    } while (den == 0);
                    int cc = num / den;
                    int rd = num % den;
                    System.out.println("El cociente es:" + cc);
                    System.out.println("El residuo es:" + rd);
                    break;
                case 5:
                   
                    System.out.println("Tabla de multiplicar");
                    System.out.println("El numero");
                    double digg1 = scanner.nextDouble();
                    System.out.println("Ingrese el inicio");
                    int beg, end;
                    do {
                        System.out.println("Ingrese el inicio");
                        beg = scanner.nextInt();
                        System.out.println("Ingrese el fin");
                        end = scanner.nextInt();
                        if (beg > end) {
                            System.out.println("El fin no debe ser mayor al inicio");
                        }
                    } while (beg > end);
                    for (int i = beg; i <= end; i++) {
                        System.out.println(digg1 + " x " + i + " = " + (digg1 * i));
                    }
                    break;
                case 6:
                   
                    System.out.println("Hasta la próxima");
                    System.out.println("Felix Godinez");
                    System.out.println("202300608");
                    System.out.println(": ) ");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

           
            if (op != 6) {
                System.out.print("¿Desea regresar al menú principal? (1: Sí / 2: No): ");
                int regresar = scanner.nextInt();
                if (regresar != 1) {
                    op = 6;
                }
            }

        } while (op != 6);

        System.out.println("Hasta la próxima");
        System.out.println("Natalia Ixmatul");
        System.out.println("201901182");
        System.out.println(": ) ");

        scanner.close();
  
    }
}
