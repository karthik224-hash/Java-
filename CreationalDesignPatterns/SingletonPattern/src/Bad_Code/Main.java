package Bad_Code;

public class Main {
    public static void main(String[] args) {
        UserService user = new UserService();
        user.login("Karthik");
        Application app = new Application();
        app.run();
    }
}