import java.util.Scanner;
public class s04ativ21 {
static Scanner teclado = new Scanner (System.in);
public static void main (String[] args) {
    
    double peso, altura, IMC;
    
    System.out.println("Digite o peso:");
    peso = teclado.nextDouble();
    System.out.println("Digite a altura:");
    altura = teclado.nextDouble();

    IMC = peso / (altura*altura);

        System.out.println("IMC = " + IMC);

    if (IMC <= 18) {
        System.out.println ("Abaixo do peso ideal");
    }
    else {
        if (IMC <= 24.9) {
            System.out.println ("No peso ideal");
        }
        else {
            if (IMC <= 29.9) {
                System.out.println("Acima do peso ideal");
            }
            else {
                if (IMC <= 34.9) {
                    System.out.println ("Obesidade grau I");
                }
                else {
                    if (IMC <= 39.9) {
                        System.out.println ("Obesidade grau II");
                    }
                    else {
                        System.out.println ("Obesidade grau III");
                    }
                }

            }
        }
    }
}
}
