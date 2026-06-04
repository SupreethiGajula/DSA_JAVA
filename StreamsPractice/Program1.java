
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {
    public static void main(String [] args){
        List<Integer> li = Arrays.asList(1,2,6,8,3,9);

       List<Integer> result = li.stream()
                         .filter(x -> x % 2 == 0)
                         .skip(1)
                         .collect(Collectors.toList());

System.out.println(result);
    }
}
