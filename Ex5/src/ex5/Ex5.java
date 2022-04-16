package ex5;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Inverter obj = new Inverter();
        String palavra,contra= "";
        System.out.print("Digite a palavra: ");
        palavra = ler.nextLine();
        obj.tamanho(palavra);
        obj.Contrario(palavra, contra);
        
   }  
}
