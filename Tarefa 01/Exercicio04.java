package Aula01;

public class Exercicio04{
    public static void main(String[] args){
        System.out.println("Exercício 04:");
        String nome="Hugo";
        String fez="gastou 50 reais";
        String z="ontem";
        String result;
        result=nome.concat(" ").concat(fez).concat(" ").concat(z).concat(".\n");
        System.out.println(""+result);
    }
}