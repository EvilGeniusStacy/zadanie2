package stayceey.zad2;
import java.util.Scanner;
public class Zad2 {
    
    public static void main(String[] args) {
        Scanner pierwszy =new Scanner(System.in);
        Scanner drugi = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą.");
        int a = pierwszy.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą.");
        int b = drugi.nextInt();
        int c = a+b;
        System.out.println("Suma twoich liczb to "+c);
    }
}
