public class ChoosePath {
    public static void choosePath(int userDecision) {
        switch (userDecision) {
            case 1:
                System.out.println("You have chosen to Create an Account!");
                break;
            case 2:
                System.out.println("You have chosen to Sign in");
                break;
            default:
                System.out.println("You have chosen wrong...");
                break;
        }
    }
}