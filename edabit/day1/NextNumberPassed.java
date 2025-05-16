public class NextNumberPassed {
    public static void main(String [] args){
        int number = -1;
        System.out.println("the number is: " + number + " the next number is: " + nextNumberPassed(number));
    }

    public static int nextNumberPassed(int number){
        if (number < 0){
            return number-1;
        }
        return number+1;
    }
}
