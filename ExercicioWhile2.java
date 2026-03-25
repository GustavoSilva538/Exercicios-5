//Gustavo Silva Faustino
import java.util.Scanner;
public class ExercicioWhile2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int impar = 0;
        int par = 0;
        int i = 1;
        int num;

        while(i <= 10){
            System.out.println("Digite o primeiro número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o secundo número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;


            System.out.println("Digite o terceiro número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o quarto número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o quinto número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o sexto número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o setimo número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o oito número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o nove número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;

            System.out.println("Digite o dez número");
            num = sc.nextInt();
            if (num % 2 == 0){
                par++;
            }
            else { impar++; }
            i++;
        }

        System.out.println(impar);
        System.out.println(par);

    }
}
