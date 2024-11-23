import java.util.Scanner;

public class Main {
    public static int birthdayCakeCandles(int[] candles){
     int max = 0;
     int sayac = 0;
     for (int height : candles){
         if (height > max) {
             max = height;
             sayac = 1;
         } else if (height == max) {
             sayac++;

         }
     }
     return sayac;
     }
     public static void main(String[] args){
         Scanner scanner= new Scanner(System.in);
         int n= scanner.nextInt();
         int[] candles = new int[n];
         for (int i = 0; i < n; i++){
             candles[i] = scanner.nextInt();
         }
         int result = birthdayCakeCandles(candles);
         System.out.println(result);

         scanner.close();
    }
}