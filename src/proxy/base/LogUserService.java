package proxy.base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUserService implements IUserService{

    private IUserService userService;
    private Logger logger;

    public LogUserService(IUserService userService) {
        this.userService = userService;
        logger = LoggerFactory.getLogger(LogUserService.class);
    }

    @Override
    public boolean addUser(String username) {
        logger.info("Before user was saved" + username);
        boolean result = userService.addUser(username);
        String message = result? "username was saved" + username: "Failed";
        logger.info(message);
        return result;
    }
}
