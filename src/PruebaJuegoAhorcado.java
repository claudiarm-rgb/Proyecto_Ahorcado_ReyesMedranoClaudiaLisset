import java.util.Scanner;

public class PruebaJuegoAhorcado {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("============== Redlas del juego =============");
		System.out.println("1. Solo se podrá intentar adivinar 10 veces");
		System.out.println("2. Solo se puede ingresar una letra a la vez (A-Z)");
		System.out.println("3. Pierdes la oportunidad si la letra no esta en la palabra");
		System.out.println("4. El juego terminara cuando se adivine la palabra completa");
		System.out.println("5. Si se acaban las oportunidades sin adivinar la palabra pierdes");
		String opcion;
		System.out.println();
		
		do {
			System.out.println("////////////////// MENU DE OPERACIONES ///////////////////");
			System.out.println("1) Verificar archivo");
			System.out.println("2) Llenar Archivo con Palabras");
			System.out.println("3) Borrar Archivo");
			System.out.println("4) Jugar");
			System.out.println("5) Salir");
			System.out.println("Elige una opcion: ");
			opcion=sc.nextLine();
			
			switch(opcion) {
			case "1":
				
			break;
			case "2":
				
			break;
			case "3":
				
			break;
			case "4":
				
			break;
			case "5":
				
			break;
			default: 
				
				System.out.println("Esa opcion no existe"+"\n");
			
			}
			
		}while(opcion!="5");
		
	}

}
