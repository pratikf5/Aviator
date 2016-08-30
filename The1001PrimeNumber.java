
public class The1001PrimeNumber {

	    public static boolean isPrime(long n) {
	        if ((n >= 2 && n % 2 == 0) || (n >= 3 && n % 3 == 0) || (n >= 5 && n % 5 == 0) || n == 0 || n == 1) {
	            return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int count = 0;
	        int primeNumber = 0;
	        while (primeNumber <= 10001) {
	            if (isPrime(count) == true) {
	                primeNumber++;
	                if (primeNumber == 10001) {
	                    System.out.println(count + " is a prime number" + "(" + primeNumber + ")");
	                }
	            }
	            count++;
	        }
	    }
	}


