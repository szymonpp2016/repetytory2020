package testing;

public class TestingMain {


    private final String USER_1 = "simple_user";
    private final String USER_2 = "simple_user_1";

    public static void main(String[] args) {
        System.out.println("Do dzieła aaaaa");
        TestingMain testingMain = new TestingMain();
        System.out.println(testingMain.sUTShouldReturnCurrentUserReturnIsOk(testingMain.USER_1));
    }

    private String sUTShouldReturnCurrentUserReturnIsOk(String userName) {
        SimpleUser simpleUser = new SimpleUser(USER_1);
        return (simpleUser.getUserName()==USER_1 && simpleUser.getUserName()!=USER_2 ) ? "true" : "false";
    }
}

