import java.util.Scanner;

public class s03ativ16 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int N, num, id, cont;
		//escreva ("Digite a quantidade de pessoas:");
		N= teclado1.nextInt();
		id  =  0;
		cont =  1;
		while (cont<=N){
		    //escreva ("Digite a idade da pessoa:");
			num = teclado1.nextInt();
			while (num<=0){
				System.out.print("Erro: Redigite idade!\n");
				num = teclado1.nextInt();
			}
			if (cont==1){
				id =  num;
			}
			else {
				if (num<=id){
				    id = num;
				}
			}
			cont  =  cont + 1;
		}
		System.out.print( "\nMenor idade="+ id);
	}
}