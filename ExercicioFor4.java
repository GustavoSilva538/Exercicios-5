import java.util.Scanner;
public class ExercicioFor4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double somaAlturas = 0;
        int contador = 0;

        for (int i = 1; i < 3; i++) {

            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            System.out.println("Digite a altura da pessoa " + i + ": ");
            double altura = sc.nextDouble();

            if (idade > 50){
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("Média das alturas (Idade maior que 50): " + media);
        }else {
            System.out.println("não há pessoas com mais de 50 anos");
        }
            ;

    }
}
