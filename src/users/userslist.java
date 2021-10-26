package users;

public class userslist {
    public static userslist head = null;
    public static userslist tail = null;
    public userslist next = null;
    public int uid = 0;
    private String userName;
    private String password;
    public void setUsername(String userName)
    {
        this.userName = userName;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUsername() {
        return this.userName;
    }

    public boolean Authenticate(String pass) {
        if(pass.equals(password))
        {
            System.out.println("login Successful..");
            return true;
        }
        System.out.println("Wrong Password...\n");
        return false;
    }
}
