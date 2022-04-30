import java.util.Scanner;

public class Calculadora {
	public static int a;
	public static int b;
	public static int rpta;
	public static boolean resp = true;
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		while(resp) {
			System.out.println("\n\t-------Calculadora----\n"); 
			System.out.println("Que desea realizar...?");
			System.out.println("\tSuma---> (1)");
			System.out.println("\tResta---> (2)");
			System.out.println("\tMultiplicación---> (3)");
			System.out.println("\tDivision---> (4)");
			System.out.println("\tMódulo---> (5)");
			System.out.println("\tSalir---> (6)\n");
			
			System.out.print("Escriba un numero de la lista: ");

			rpta = sc.nextInt();
			
			if(rpta == 6) {
				System.out.println("\nGracias por su tiempo!! ");
				break;
			}
			
			System.out.print("\nIngrese 1er número entero: ");
			a = sc.nextInt();
			System.out.print("\nIngrese 2do número entero: ");
			b = sc.nextInt();
			
			switch(rpta) {
			
				case(1):
					System.out.println("La respuesta de la suma es: " + add(a,b));
	            			break;
				case(2):
					System.out.println("La respuesta de la resta es: " + sub(a,b));
	            			break;
				case(3):
					System.out.println("La respuesta de la multiplicacion es: " + mul(a,b));
	            			break;
				case(4):
					System.out.println("La respuesta de la division es: " + div(a,b));
	            			break;
				case(5):
					System.out.println("La respuesta de modulo es: " + mod(a,b));
	            			break;
			}
		}
    }
	public static int add(int a, int b) {
	    return a + b;
	}
	public static int sub(int a, int b) {
	    return a - b;
	}
	public static int mul(int a, int b) {    
	    return a*b;
	}
	public static int div(int a, int b) {
	    return a/b;
	}
	public static int mod(int a, int b) {
	    return a%b ;
	}
}
