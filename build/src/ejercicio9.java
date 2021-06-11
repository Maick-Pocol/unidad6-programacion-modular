package src;
import java.util.*;

public class ejercicio9{

	public static void main(String[] args){
		ejercicio9 ej = new ejercicio9();

		Scanner lector = new Scanner(System.in);

		int mat1[][]= new int[20][20];
		int mat2[][]= new int[20][20];
		int res[][]= new int[20][20];
		int limite,i,j;

		System.out.println("ingrese el tamaño de las matrices a sumar ");
		limite=lector.nextInt();

		System.out.println("ingrese elementos de la primera matriz ");
		for(i=0;i<limite;i++){
			for(j=0;j<limite;j++){
				System.out.print("columna "+(i+1)+" fila "+(j+1)+"= ");
				mat1[i][j]=lector.nextInt();
			}
		}

		System.out.println("ingrese elementos de la segunda matriz ");
		for(i=0;i<limite;i++){
			for(j=0;j<limite;j++){
				System.out.print("columna "+(i+1)+" fila "+(j+1)+"= ");
				mat2[i][j]=lector.nextInt();
			}
		}

		System.out.println("la suma de las dos matrices es ");
		for(i=0;i<limite;i++){
			for(j=0;j<limite;j++){
				res[i][j]=mat1[i][j]+mat2[i][j];
				
			}
		}

		for(i=0;i<limite;i++){
			for(j=0;j<limite;j++){
				System.out.println("columna "+(i+1)+" fila "+(j+1)+"= "+res[i][j]);
			}
		}

	}

}
