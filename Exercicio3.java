import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Digite um numero limite");
        int limite = sc.nextInt();

        while(i <= limite){
            System.out.println(i);
            i = i * 2;
        }

        sc.close();
    }
}