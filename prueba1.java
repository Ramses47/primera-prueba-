import java.util.Scanner;

class prueba1
{
 public static void main(String[] args)
	{

	    Scanner Ram = new Scanner(System.in);

	    int numeroUno;
	    int numeroDos;
	    int resultado;

	    System.out.print("dame un numero");
	    numeroUno = Ram.nextInt();
	    System.out.print("dame otro numero");
	    numeroDos = Ram.nextInt();
	

	    resultado = numeroUno + numeroDos;

	
	    System.out.printf(" vivi el la cuenta y el resultado es %d * %d = %d", numeroUno,numeroDos,resultado);
    }
}