public class reto1_sum{
    public static void main(String[] args){
        try{
            int value_one = -3;
            int value_two = 6;
            int value_three = 5;
            int value_four = 5;
            int sum_one = sumTwoNumber(value_one, value_two);
            int sum_two = sumTwoNumber(value_three, value_four);
            System.out.println("Sum of " + value_one + " + " + value_two + " = " + sum_one);
            System.out.println("Sum of " + value_three + " + " + value_four + " = " + sum_two);
        } catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int sumTwoNumber(int number_one, int number_two) throws Exception{
        if (number_one < 0 || number_two < 0) { 
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        return number_one + number_two;
    }
}