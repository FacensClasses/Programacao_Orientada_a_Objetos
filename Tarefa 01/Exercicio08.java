package Aula01;
import java.util.Scanner;

public class Exercicio08{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Exerc�cio 08:");
        float valorHoraAula;
        int numeroAulas;
        float percentualINSS;
        double salarioBruto;
        double descontoINSS;
        double salarioLiquido;
        System.out.println("Digite o valor da hora-aula (R$): ");
        valorHoraAula=scan.nextFloat();
        System.out.println("Digite o n�mero de aulas dadas no m�s: ");
        numeroAulas=scan.nextInt();
        System.out.println("Digite o percentual de desconto do INSS(%): ");
        percentualINSS=scan.nextFloat();
        salarioBruto=valorHoraAula*numeroAulas;
        descontoINSS=salarioBruto*(percentualINSS/100);
        salarioLiquido=salarioBruto-descontoINSS;
        System.out.printf("\nSal�rio Bruto: R$ %.2f\n",salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f\n",descontoINSS);
        System.out.printf("Sal�rio L�quido: R$ %.2f\n",salarioLiquido); 
    }
}