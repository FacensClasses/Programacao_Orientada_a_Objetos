package Aula01;
import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Exercício 06:");
        float salariomin;
        double quilowatts;
        double valor;
        double pagamento;
        double desconto;
        double valorDesconto;
        System.out.println("Digite o seu salário: ");
        salariomin=scan.nextFloat();
        System.out.println("Digite a quantidade de quilowatts consumida: ");
        quilowatts=scan.nextDouble();
        valor=salariomin/500;
        System.out.println("O valor de cada quilowatts em reais é: "+valor+"R$.");
        pagamento=valor*quilowatts;
        System.out.println("O valor a ser pago é de: "+pagamento+"R$.");
        desconto=pagamento*0.15;
        valorDesconto=pagamento-desconto;
        System.out.println("O valor a ser pago com 15% de desconto é de: "+valorDesconto+"R$.");
    }
}