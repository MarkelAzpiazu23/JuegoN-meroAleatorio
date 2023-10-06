import java.util.Scanner;

public class JuegoNúmeroAleatorio {

	public static void main(String[] args) {
		boolean RepetirElJuego = true;
		int num = -1;
		int valor;
		int i = 1;
		String respuesta;
		
		valor = (int) Math.floor(Math.random() *100) +1;
		
		Scanner scanner = new Scanner( System.in );
		
		while(RepetirElJuego == true) {
			
		System.out.println("Un número del 1 al 100");
		
		for (i = 1; num != valor; i++) {
		
			 num = scanner.nextInt();
		
		if(num>100)
		    System.out.println("No es valido");
		else
			if(num<=0)
		    System.out.println("No es valido");
		
		
		if(num < valor)
	        System.out.println("Te has quedo corto");
		else
			if(num > valor)
				System.out.println("Te has pasado");
			else
		
				if(num == valor)
	        System.out.println("Has acertado, la cantidad de intenos es " + i );
		}
		
		System.out.println("¿Quieres volver a jugar SI o NO?");
		
		 respuesta = scanner.next().toUpperCase();
		 
		 if (respuesta.equals ("SI")){
			 valor = (int) Math.floor(Math.random() *100) +1;
			 i = 0;
			 RepetirElJuego = true; 
		 }
		 if (respuesta.equals ("NO")){
			 RepetirElJuego = false; 
		 System.out.println("El juego ha terminado");
		 }
		
		
		}
		
		
		
	

}
}

	
	

