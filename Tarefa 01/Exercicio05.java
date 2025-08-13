package Aula01;
import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Exercício 05:");
        int anoNasci;
        int ano;
        int idadeAtual;
        int idade2016;
        System.out.println("Digite o ano de nascimento de João: ");
        anoNasci=scan.nextInt();
        System.out.println("Digite o ano atual: ");
        ano=scan.nextInt();
        idadeAtual=ano-anoNasci;
        idade2016=2016-anoNasci;
        System.out.println("\nJoão tem " + idadeAtual + " anos.");
        System.out.println("Em 2016, João terá/tinha " + idade2016 + " anos.");
    }
}