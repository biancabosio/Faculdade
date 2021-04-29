import java.util.Scanner;

public class s04ativ22 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int cont,resp,q1,q2;
		double Perc,n;
		Perc  =  0.0;
		q1 = 0;
		q2 = 0;
		cont = 1;
		System.out.print( "Digite o numero de pessoas:");
		n = teclado1.nextDouble();
		while (cont<=n){
			System.out.print( "Digite o periodo que voce mais utiliza o elevador:\n");
			resp = teclado1.nextInt();
			if (resp==1){
				q1 = q1 + 1;
			}
			else {
				q2 = q2 + 1;
			}
			cont  =  cont + 1;
			System.out.print( "\nOpcao 1: "+ q1);
			System.out.print( "\nOpcao 2: "+ q2);
		}
		if (q1>q2){
			Perc  =  q1*100/n;
			System.out.print( "\nPeriodo 1 mais usado");
			System.out.print( "\nPercentual: "+ Perc);
		}
		else {
			if (q1<q2){
				Perc  =  q2*100/n;
				System.out.print( "\nPeriodo 2 mais usado");
				System.out.print( "\nPercentual: "+ Perc);
			}
			else {
				System.out.print( "\nPeriodos usados igualmente");
				System.out.print( "\nPercentual: 50.0");
			}
		}
	}
}