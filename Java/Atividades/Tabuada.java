package Java.Atividades;
import java.util.Scanner;

//Esse software mostra a tabuada completa do numero que o usuario digitar. Feito por:
//Daniel Carvalho
public class Tabuada {
    
    public static void main(String[] args){
        //utilizando o scanner para entradas de dados aqui:
        Scanner scanner = new Scanner(System.in);

    //variaveis
    
    int num; // entrada do usuario
    int resultado = 0; //resultado da tabuada
    //

    System.out.println("============================================ Tabuada ==============================================");
    System.out.println("Digite o numero que deseja saber a tabuada:");
    num = scanner.nextInt();

    //Estrutura de repetição, aqui eu vou usar o "for"

    for(int i = 0; i<=10; i++){
        
        resultado = num * i;

        System.out.println(num + " X " + i + " = " + resultado);

    }


    scanner.close();
    }
}
