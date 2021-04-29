import java.util.Scanner;
public class s04ativ23{
static Scanner teclado = new Scanner (System.in);
public static void main (String[] args) {
        
        double IRm, IRa , S, A, P;
        
        //System.out.println ("Digite o salario:");
        S = teclado.nextDouble();
        
        if (S < 1499.15){ 
            A = 0;
            P = 0;
            }
        else{
            if (S <= 2246.75) {
                A = 0.075;
                P = 112.43;
            }
            else{
                if (S <= 2995.70){
                    A = 0.15;
                    P = 280.94;
                }
                else {
                    if (S <= 3743.19){
                        A = 0.225;
                        P = 505.62;
                    }
                    else {
                        A = 0.275; 
                        P = 790.58;
                    }
                }
            }
        }
        
        IRm = (S * A) - P;
        
              System.out.println ("IR Mensal = " + IRm);
        
        IRa = (IRm * 12);
        
             System.out.println ("IR Anual = " + IRa);
    }
}