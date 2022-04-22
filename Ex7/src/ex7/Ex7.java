package ex7;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Correcao obj = new Correcao();
        Scanner ler = new Scanner(System.in);
        String gabarito[] = new String[6];
        System.out.println("Digite o gabarito: ");
        for (int i = 1; i < gabarito.length; i++) {
            System.out.print("Resposta Correta da "+i+"ª questão: ");
            gabarito[i] = ler.nextLine();
        }
        System.out.println();
        obj.gabarito(0, gabarito);
    }    
}
