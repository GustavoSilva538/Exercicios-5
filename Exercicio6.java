import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 nuúmeros inteiros e positivos");
        int i = 1;
        int result = 2147483647;

        while( i <= 10 ){
            int num = sc.nextInt();
            if (num < result){
                result = num;
            }
            i++;
        }

        System.out.println("O menor número é " + result);
    }
}