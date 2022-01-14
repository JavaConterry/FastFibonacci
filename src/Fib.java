import java.util.HashMap;
import java.util.Map;

public class Fib {

    Map< Integer, Integer> cache = new HashMap<Integer, Integer>();

    public Fib(){
        cache.put(1, 1);
        cache.put(2, 1);

    }

    public int fibOf(int numOfFibNumber){

        try {
            if(cache.get(numOfFibNumber) == null){
                cache.put(numOfFibNumber, (fibOf(numOfFibNumber - 2) + fibOf(numOfFibNumber - 1)) % 1_000_000_000);
            }
            return cache.get(numOfFibNumber);
        }
        catch(Exception e){
            return  fibOf(numOfFibNumber-1);
        }
    }

}

