package Bad_Code;

public class UserService {
    public void login(String username) {
        Logger logger = new Logger();
        logger.log("User " + username + " logged in. ");
    }
}
