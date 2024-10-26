package stayceey.zad2;
import java.util.Scanner;
public class Zad2 {
    
    public static void main(String[] args) {
        Scanner pierwszy =new Scanner(System.in);
        System.out.println("Napisz zdanie które ma być zapisane capslockiem.");
        String tekst = pierwszy.nextLine();
        String caps =tekst.toUpperCase();
        System.out.println(caps);
    }
}
