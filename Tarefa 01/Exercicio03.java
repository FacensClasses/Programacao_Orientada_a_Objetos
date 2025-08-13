package Aula01;

public class Main{
    public static final double PI = 3.14159;
}

public class Exercicio03{
    public static void main(String[] args){
        System.out.println("Exercício 03:");
        int raio=5;
        double respow;
        double resposta;
        respow=Math.pow(raio, 2);
        resposta=respow*Main.PI;
        System.out.println("A área de uma circunferência com raio 5cm é: "+resposta+".\n");
    }
}