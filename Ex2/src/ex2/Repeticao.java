package ex2;
public class Repeticao {
public void crescente (int n1, int n2){
       while (n1>n2){
           System.out.print(n2++ + " ");
       }
       while (n2>n1){
           System.out.print(n1++ + " ");
       }
   }
   public void decrescente(int n1,int n2){
       while(n1<n2){
           System.out.print(n2-- + " ");
       }
       while(n2<n1){
           System.out.print(n1-- + " ");
       }
   }
}
