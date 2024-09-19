import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }

        sc.close();
    }
}