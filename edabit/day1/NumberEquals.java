public class NumberEquals {
    public static void main(String[] args){
        int number_one = 5;
        int number_two = 6;
        numbersEquals(number_one, number_two);
    }

    public static void numbersEquals(int number_one, int number_two){
        if (number_one == number_two){
            System.out.println("the numbers are equals");
        }else{
            System.out.println("the numbers not equals");
        }
    }
}
