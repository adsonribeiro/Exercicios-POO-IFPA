package ex7;
import java.util.Scanner;
public class Correcao {
    public void gabarito(int pontucao,String gabarito[]){
            int pontuacao = 0;
            Scanner ler = new Scanner(System.in);
            String questao[] = new String[6];
            System.out.println("Prova do Aluno");
            for (int i = 1; i < questao.length; i++) {
            System.out.print(i+"ª Questão: ");
            questao[i] = ler.nextLine();
            if (questao[i].equals(gabarito[i]))
                pontuacao++;
        }

        System.out.println("Pontuação do aluno foi: " + pontuacao);
    }
}