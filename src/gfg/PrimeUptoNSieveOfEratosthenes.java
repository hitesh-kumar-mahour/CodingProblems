package gfg;

public class PrimeUptoNSieveOfEratosthenes {

    public static  boolean[] sieveOfEratosthenes(int n) { 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            if(prime[p] == true) 
            { 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          return prime;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(sieveOfEratosthenes(100));
	}
}
