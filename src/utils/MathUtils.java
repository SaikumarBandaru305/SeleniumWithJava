package utils;

public class MathUtils {
    public static int factorial(int num){
        int result = 1;
        for(int i=1;i<=num;i++){
            result = result * i;
        }
        return result;
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i<num;i++){

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}