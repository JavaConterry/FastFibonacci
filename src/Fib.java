import java.util.HashMap;
import java.util.Map;


public class Fib {

    Map< Integer, Integer> cache = new HashMap<Integer, Integer>();

    public Fib(){
        cache.put(1, 1);
        cache.put(2, 1);

    }


    public int fibOf(int numOfFibNumber){
        int result;
        try {
            if(cache.get(numOfFibNumber) == null){

                if(numOfFibNumber % 5 == 0)
                {
                    result = (int)fibOf5n(numOfFibNumber)% 1_000_000_000;
                }
                else if(numOfFibNumber % 3 == 0){
                    result = (int)fibOf3n(numOfFibNumber)% 1_000_000_000;
                }
                else if(numOfFibNumber % 2 == 0){
                    result = fibOf2n(numOfFibNumber)% 1_000_000_000;
                }
                else{
                    result = (fibOf(numOfFibNumber - 2) + fibOf(numOfFibNumber - 1))% 1_000_000_000;
                }

                cache.put(numOfFibNumber, result);
            }
            return cache.get(numOfFibNumber);
        }
        catch(Exception e){
            return  fibOf(numOfFibNumber-1);
        }
    }

    private double fibOf5n(int n){
        int a = fibOf(n/5);
        return 25*a*a*a*a*a + 25*Math.pow(-1, n)*a*a*a + 5*a;
    }

    private double fibOf3n(int n){
        int a = fibOf(n/3+1);
        int b = fibOf(n/3);
        int c = fibOf(n/3-1);

        return a*a*a + b*b*b - c*c*c;
    }

    private int fibOf2n(int n){
        int a = fibOf(n/2+1);
        int b = fibOf(n/2-1);

        return a*a - b*b;
    }



}

