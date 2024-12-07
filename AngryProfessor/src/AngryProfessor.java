import java.util.Scanner;

public class AngryProfessor {
    public static String isClassCancelled(int k, int[] arrivalTimes){
        int onTime = 0;
        for (int time : arrivalTimes){
            if (time <= 0){
                onTime++;
            }
        }
        if (onTime >= k) {
            return "NO";
        }else{
            return "YES";
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for (int i = 0; i<t; i++){
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] arrivalTimes = new int[n];
                for (int j = 0; j < n; j++){
                    arrivalTimes[j] = scanner.nextInt();
                }
                System.out.println(isClassCancelled(k, arrivalTimes));
            }
            scanner.close();
        }
    }


}
