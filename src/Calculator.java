import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int Add(String numbers) throws Exception {
        if( numbers.length() == 0)
            return 0;
        else {
            numbers = numbers.replaceAll("\n", " ");
            numbers = numbers.replaceAll(",", " ");
            numbers = numbers.replaceAll("//", " ");
            numbers = numbers.replaceAll(";", " ");

            System.out.println( numbers );

            String[] str1 = numbers.split(" ");

            int sum = 0;

            List<Integer> values = new ArrayList<Integer>();
            for(String s : str1 ){
                String entry = s.trim();
                if( entry.length() > 0 ) {
                    int value = Integer.parseInt(s.trim());
                    if( value < 0 ){
                        values.add( value );
                    } else {
                        sum += Integer.parseInt(s.trim());
                    }
                }
            }

            if( values.size() > 0 ){
                String res = "negatives not allowed ( ";
                for(Integer i : values ){
                    res += i + " ";
                }
                res += ")";
                throw new Exception(res);
            }

            return sum;
        }
    }
}
