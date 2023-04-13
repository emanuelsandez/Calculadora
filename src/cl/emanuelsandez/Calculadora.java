//Programa que permite realizar funciones básicas de una calculadora
package cl.emanuelsandez;
import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int op;
		
		do{
			
			System.out.println("Bienvenido a Calculadora");
			System.out.println("Para la acción que desea realizar oprima una de las siguientes opciones");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5-Salir");
			op = sc.nextInt();
			
		
	switch(op) {
	case 1:
		suma();
		break;
	case 2:
		resta();
		break;
	case 3:
		multiplicacion();
		break;
	case 4:
		division();
		break;
	case 5:
		salir();
	
	default:
		System.out.println("Opción inválida");
	
		
	}
		} while (op!=5);

	}
	
	public static void suma() {
		System.out.println("Función de Suma");
		System.out.println("Ingrese valor 1");
		float valor1 = sc.nextFloat();
		System.out.println("Ingrese valor 2");
		float valor2 = sc.nextFloat();
		float suma = valor1 + valor2;
		System.out.printf("La suma de sus valores es %.2f \n", suma);
		
	}
	
	public static void resta() {
		System.out.println("Función de Resta");
		System.out.println("Ingrese valor 1");
		float valor1 = sc.nextFloat();
		System.out.println("Ingrese valor 2");
		float valor2 = sc.nextFloat();
		float resta = valor1 - valor2;
		System.out.printf("La resta de sus valores es %.2f \n", resta);
	}
	
	public static void multiplicacion() {
		System.out.println("Función de Multiplicación");
		System.out.println("Ingrese valor 1");
		float valor1 = sc.nextFloat();
		System.out.println("Ingrese valor 2");
		float valor2 = sc.nextFloat();
		float multiplica = valor1 * valor2;
		System.out.printf("La multiplicación de sus valores es %.2f \n", multiplica);
		
	}
	
	public static void division() {
		System.out.println("Función de División");
		System.out.println("Ingrese valor 1");
		float valor1 = sc.nextFloat();
		System.out.println("Ingrese valor 2");
		float valor2 = sc.nextFloat();
		if (valor2 ==0) {
			System.out.println("Valor inválido");
		}else {
		
		float multiplica = valor1 / valor2;
		System.out.printf("La multiplicación de sus valores es %.2f \\n", multiplica);
		}
	}
	
	public static void salir() {
	}
}
