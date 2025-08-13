package Aula01;
import java.util.Scanner;

public class Exercicio09{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Exercício 09:");
        float peso;
        float pesoEmGramas;
        double aumento;
        System.out.print("Digite o seu peso (kg): ");
        peso=scan.nextFloat();
        pesoEmGramas=peso*1000;
        System.out.printf("O seu peso em gramas é de: %.2f g.\n",pesoEmGramas);
        aumento=pesoEmGramas*0.12;
        pesoEmGramas+=aumento;
        System.out.printf("Se engordar em 12%%, o seu novo peso em gramas será de: %.2fg.\n",pesoEmGramas);
    }
}
