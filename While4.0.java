import java.util.Scanner;

public class s04ativ20 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int a,r,n;
		System.out.print( "Digite o primeiro termo:");
		a = teclado1.nextInt();
		System.out.print( "Digite a razao:");
		r = teclado1.nextInt();
		System.out.print( "Digite a quantidade de termos:");
		n = teclado1.nextInt();
		while (n>0){
			if (n-1==0){
				System.out.print( a+ " ");
			}
			else {
				System.out.print( a+ " ; ");
			}
			a  =  a + r;
			n  =  n - 1;
		}
	}
}