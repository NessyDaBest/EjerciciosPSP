import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Dame un numero: ");
            String numero = new Scanner(System.in).nextLine();
            Process p = new ProcessBuilder("factor",numero).start();
            BufferedReader br = p.inputReader();
            List<String> numerosFactorizados = new ArrayList<>();
            String numero1;
            while((numero1 = br.readLine()) != null){
                numerosFactorizados.add(numero1);
            }
            for(String numerito: numerosFactorizados){
                System.out.println("los numeros son: "+numerito);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
