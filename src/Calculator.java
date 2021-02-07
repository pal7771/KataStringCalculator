public class Calculator {

    public int Add(String numbers) {
        if( numbers.length() == 0)
            return 0;
        else {
            numbers = numbers.replace('\n', ' ');
            numbers = numbers.replace(',', ' ');

            System.out.println( numbers );

            String[] str1 = numbers.split(" ");

            int sum = 0;

            for(String s : str1 ){
                sum += Integer.parseInt( s );
            }
            return sum;
        }
    }
}
