public class Calculator {

    public int Add(String numbers) {
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

            for(String s : str1 ){
                String entry = s.trim();
                if( entry.length() > 0 )
                    sum += Integer.parseInt( s.trim() );
            }
            return sum;
        }
    }
}
