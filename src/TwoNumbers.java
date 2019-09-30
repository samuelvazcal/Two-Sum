import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entradaValidacion = 0;
		int entrada = 0;
		int [] array1;
		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de elementos para el array: ");
		entrada = input.nextInt();
		array1 = new int[entrada];
		for(int i=0;i<array1.length;i++)
		{
			System.out.print("Ingresa el elemento numero: "+(i+1)+" ");
			array1[i]=input.nextInt();
		}
		for(int x:array1)
		{
			System.out.print(x+" ");
		}
		
		System.out.println("Ingresa el numero que deseas validar: ");
		entradaValidacion = input.nextInt();
		for(int i2=0;i2<array1.length;i2++)
		{
			for(int i3=i2+1;i3<array1.length;i3++)
			{
				if(array1[i2]+array1[i3]==entradaValidacion)
					System.out.println(i2+" "+i3);
			}
		}
	}

}
