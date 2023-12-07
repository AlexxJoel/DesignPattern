package proxy.base;

public class Client {

    IUserService iUserService;

    public Client(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    public void saveUser(String data){

    }
}
