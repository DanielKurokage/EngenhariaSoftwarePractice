package Java.Atividades;

import java.util.Scanner;

//Software que calcula a media do aluno e diz se ele está aprovado, recuperação ou reprovado. Feito por:
//Daniel Carvalho
public class Media {
    
    public static void main(String[] args){
    
    //aqui eu inicio imput do usuario com scanner
    Scanner scanner = new Scanner(System.in);

    //variavies
    double num1, num2, num3; //variaveis de entradas do usuario
    double media; //variaveis de calculos

    System.out.println("============================================== Media de aluno =====================================");
    System.out.println("Digite a primeira nota do aluno");
    num1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota do aluno");
    num2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota do aluno");
    num3 = scanner.nextDouble();

    //Algoritimo do Calculo
    media = (num1 + num2 + num3) / 3;

    if(media >= 7){
        System.out.println("Aluno aprovado");
    }if(media < 7 && media >= 5){
        System.out.println("Aluno de recuperação");
    }if(media < 5){
        System.out.println("Aluno reprovado");
    }





    scanner.close();
    }
}
