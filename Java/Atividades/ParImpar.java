package Java.Atividades;

import java.util.Scanner;

// Software que diz se um numero é par ou impar feito por :
// Daniel Carvalho

public class ParImpar {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); //Utiliza a biblioteca Scanner para entradas de dados no Terminal

    //Variaveis
    
    int num1;
    
    //Funcionamento 
    System.out.println("======================================================= Comparador de par ou impar =========================================================");
    System.out.println("Digite um numero para verificar se ele é impar ou par ");
    num1 = scanner.nextInt(); // aqui eu faço uma entrada de dados do usuario para a variavel num1

    //Aqui entra o algoritimo de comparação

    if(num1 % 2 == 0){ //essa linha recebe a condição
        System.out.println("O numero " + num1 + " é Par");
    }else{
        System.out.println("O numero " + num1 + " é impar ");
    }

    System.out.println("============================================================================================================================================");

    scanner.close(); // fecha o Scanner 

    }
}