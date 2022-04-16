package ex1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
         int n1,n2,n3 = 0;
        Calculo obj = new Calculo();
        Scanner ler = new Scanner(System.in);
        System.out.print("valor para n1: ");
        n1 = ler.nextInt();
        System.out.print("Valor para n2: ");
        n2 = ler.nextInt();
        System.out.print("Valor oara n3: ");
        n3 = ler.nextInt();
        obj.maior(n1, n2, n3);
        obj.menor(n1, n2, n3);

    }
}
