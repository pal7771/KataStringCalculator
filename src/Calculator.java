public class Calculator {

    public int Add(String numbers) {
        if( numbers.length() == 0)
            return 0;
        else {
            String[] str = numbers.split(",");

            int sum = 0;
            for(String s : str ){
                sum += Integer.parseInt( s );
            }
            return sum;
        }
    }
}
