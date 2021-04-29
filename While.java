import java.util.Scanner;
public class s03ativ15 {
static Scanner teclado = new Scanner (System.in);
public static void main (String[] args){
    int N, D3, ND3, NU, cont, num;
    //System.out.println("Digite a quantidade de numeros da sequencia:");
    N= teclado.nextInt();
    cont = 1;
    NU = 0;
    D3 = 0;
    ND3 = 0;
    
    while (cont<=N){
        //System.out.println("Digite um numero da sequencia:");
        num = teclado.nextInt();
        if (num==0){
            NU = NU + 1;
        }
        else {
            if (num%3 == 0){
                D3 = D3 + 1;
            }
            else {
                ND3 = ND3 + 1;
            }
         }
        cont = cont + 1;
    }
      System.out.print("\nNulos = " + NU);
      System.out.print("\nDivisiveis por 3 = " + D3);
      System.out.print("\nNao divisiveis por 3 = " + ND3);
}
}