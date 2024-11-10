
public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        int sayac = 100;
        int i =1;
        while (i <= sayac){
            toplam +=i;
            i++;
        }
        double ortalama = (double) toplam/sayac;
        System.out.println("1'den 100'e kadar olan sayıların ortalaması:" + ortalama );



    }
}