public class Main {
    public static void main(String[] args) {
        int satır = 10;
        for (int i = 1; i <= satır; i++){
            for (int j = i; j < satır; j++) {
                System.out.print(" ");


            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}