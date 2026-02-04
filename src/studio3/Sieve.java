import java.util.Scanner;
public class Sieve {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
    System.out.println("Choose a number");
    int n = in.nextInt();
    boolean[] isPrime = new boolean[n + 1];
    for (int i = 2; i <= n; i++) {
   isPrime[i] = true;
}   
for (int i = 2; i <= n; i++) {
    for (int j = 2; j <= n; j++) {
        if (i*j <= n){
        isPrime[i*j] = false;
        }
    }
}
for (int i = 2; i <= n; i++) {
if (isPrime[i] == true) {
    System.out.println(i);
}
}
}
}
