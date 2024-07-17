public class VoterIDCheck{
    public static void main(String[] args) {
        VoterIDException.verifyAge(15);
    }

}

class VoterIDException extends Exception {
    public  VoterIDException(int age){
        System.out.println("Your age is "+ age);
    }
    public static void verifyAge(int age){
        if(age<18){
            try
            {
                throw new VoterIDException(age);
            }
            catch(VoterIDException vie){
                System.out.println("Please check your age");
            }
            // catch(Exception e){
            //     System.out.println("Please check your age");
            // }
        }
    }
}
