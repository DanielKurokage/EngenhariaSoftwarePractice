package Java.Atividades;
import java.util.Scanner;

//esse software vai somar todos os nu que o usuario digitar dentro de um loop até que ele digite 0. Feito por
//Daniel Carvalho
public class SomaInfinita {
    
    public static void main(String[] args){
        //aqui estou utilizado o Scanner
        Scanner scanner = new Scanner(System.in);

    //variaveis 
    int num; // entradas do usuario
    int soma = 0,  loop = 1;
    //
    System.out.println("================================ Soma infinita ===================================");
    System.out.println("digite numero para soma ou digite 0 para parar");
    while(loop == 1){

        num = scanner.nextInt();
        if(num > 0){
        soma += num;
        System.out.println("Soma: " + soma);
        }else{
            loop++;
        }
        
    }

    System.out.println("A soma parou em :" + soma);

    scanner.close();
    }
}
