public class Calculator {

    public int Add(String numbers) {
        if( numbers.length() == 0)
            return 0;
        else {
            String[] str1 = numbers.split(",");
            String[] str2 = numbers.split("\n");
            int sum = 0;

            if( str1.length > str2.length ){
                for(String s : str1 ){
                    sum += Integer.parseInt( s );
                }
            } else {
                for(String s : str2 ){
                    sum += Integer.parseInt( s );
                }
            }

            return sum;
        }
    }
}
