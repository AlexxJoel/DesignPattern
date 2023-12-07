package proxy.base;

import java.util.ArrayList;

public class UserService implements IUserService{

    private ArrayList<String> usersList;

    public UserService() {
        this.usersList = new ArrayList<>();
    }

    @Override
    public boolean addUser(String username) {
        if (!usersList.contains(username)){
            usersList.add(username);
            return true;
        }
        return false;
    }
}
