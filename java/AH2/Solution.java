package AH2;

public class Solution {
    
    public static boolean isPrime(int number) {

        for (int i = 2; i<=number; i++) {
            if (number%i == 0)
            {
                return true;
            }            
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(Solution.isPrime(2));
        System.out.println(Solution.isPrime(0));
        System.out.println(Solution.isPrime(1));
        System.out.println(Solution.isPrime(31));
    }
}
