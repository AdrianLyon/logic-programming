public class ConvertMinutesToSeconds {
    public static void main(String[] args){
        try{
            int minutes = -30;
            System.out.println("The minutes to seconds is: " + convertMinutesToSeconds(minutes));
        }catch(Exception exception){
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public static int convertMinutesToSeconds(int minutes) throws Exception{
        if (minutes < 0){
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        return minutes * 60;
    }
}
