package Aula01;
import java.util.Scanner;

public class Main{
    public static final double PI = 3.14159;
}

public class Exercicio07 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Exercício 07:");
        double altura;
        double raio;
        double resultado;
        System.out.println("Digite a altura da lata(cm): ");
        altura=scan.nextFloat();
        System.out.println("Digite o raio(cm): ");
        raio=scan.nextFloat();
        resultado=Main.PI*Math.pow(raio,2)*altura;
        System.out.println("O volume da lata é de: "+resultado+".\n");
    }
}