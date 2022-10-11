public class Main {
    public static void main(String[] args) {
        System.out.println("Would you like to Create an account (1) or Sign in (2)?");
        int userDecision = ReadInput.readInput();
        ChoosePath.choosePath(userDecision);
    }
}