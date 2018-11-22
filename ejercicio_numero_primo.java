import java.util.Scanner;

public class ejercicio_numero_primo {
private static Scanner sc;

	public static void main(String[] args) {
		//
		int N, Primo;
		
		
		System.out.println("Ingrese un número a evaluar");

		sc = new Scanner (System.in);

		N = sc.nextInt();

		Primo = NumeroPrimo (N);	
		
		if (Primo == (-1)) {
			
			System.out.println("El numero " + N + " no es primo");
		}
		else {
			System.out.println("El numero " + N + " es primo");
		}
		if(N > 0){
			String Respuesta = ("La secuencia de numeros primos entre 1 y " + N + " es");
		int [] Secuencia = new int [N];
			for (int j=0; j<N; j++){
			
				Secuencia [j] = NumeroPrimo (j+1);
			
				if (Secuencia [j] != -1){
			
				Respuesta = Respuesta + ", " + Secuencia [j];
				}
			}
			System.out.println(Respuesta);
		}

	}

public static int NumeroPrimo (int N){
	
			int aux = 0;
			int R;
			int contador = 0;
			
			if (N>1){
				for (int i=0; i<N; i++){
					aux++;
					R = N % aux;
					if (R==0){
						contador++;
					}
				}
				if (contador == 2){
					return (N);	
				}
				else {
					return (-1);
				}
			}
			else {
				return (-1);
			}
			}
}

