package Database;

public class UserList {
    public static User head = null;
    public static User tail = null;

    public static User addNewUser(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone)
    {
        User newUser = new User(signUpUsername,signUpPassword,signUpFname,signUpLname,signUpPhone);
        if(head==null){
            head=newUser;
        }
        else
        {
            tail.next=newUser;
        }
        tail = newUser;
        return newUser;
    }
}
