import java.util.Scanner;
public class ExercicioFor3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int scan = sc.nextInt();
        for (int i = 1; i <= scan; i++) {
            System.out.println(i);
        }

    }
}
