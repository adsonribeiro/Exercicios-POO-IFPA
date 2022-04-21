package ex6;
public class VP {
    public void ePrimo(int n1){
        int primos = 0;
        for (int i = 2; i < n1;i++){
            if (n1 % i == 0){
                primos++;
            }
        }
        if (primos == 0){
            System.out.println("é primo");
        } else{
            System.out.println("não é primo");
        }
    }
}
