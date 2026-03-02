package Java.Atividades;

import java.util.Scanner; //Importar o scanener 

// Software comparador de dois numeros feito por:
// Daniel Carvalho

public class Comparador {

    public static void main(String[] args){

    //Configurações

    Scanner scanner = new Scanner(System.in);

    //

    //Variaveis

    int num1, num2;
    
    //

    System.out.println("=============================Comparador de numeros================================");
    System.out.println("Digite o primeiro numero");
    num1 = scanner.nextInt();
    System.out.println("Digite o segundo numero");
    num2 = scanner.nextInt();
    
    //Algoritimo de comparação usando a condição IF Else

    if(num1 > num2){ 
        System.out.println("O numéro: " + num1 + " é maior que " + num2);
    }else{
        System.out.println(" O numero: "+ num2 + " é maior que " + num1);
    }


    scanner.close(); // fechando o scanner

    }
}
