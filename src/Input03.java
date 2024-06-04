import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        System.out.println("digite tres numeros para obter uma soma");
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        soma += scanner.nextInt();
        soma += scanner.nextInt();
        soma += scanner.nextInt();
        
        scanner.close();
        
        System.out.println("a soma dos tres numeros acima e : " + soma);    
    }
}
