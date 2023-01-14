// time complexity = O(N*log(logN))
public class sieve {
    public static void main(String[] args) {
    int n=40;
    boolean[] prime = new boolean[n+1];
    Sieve(n, prime);
    }
    //false in array means no. is prime
static void Sieve(int n, boolean[] primes){
for (int i = 2; i * i <= n; i++) {
    if(!primes[i]){
        for (int j = i*2 ; j <=n; j+=i) {
            primes[j]=true;
        }
    }
    
}
for (int i = 2; i <= n; i++) {
    if (!primes[i]){
        System.out.print(i+ " ");
    }
}
}}
