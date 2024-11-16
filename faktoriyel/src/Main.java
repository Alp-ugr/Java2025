import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi > 0){
            faktoriyel *= sayi;
            sayi --;
        }
        System.out.println("Sayının Faktoriyeli: "+ faktoriyel);
        }
    }
