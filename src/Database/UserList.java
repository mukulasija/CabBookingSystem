package Database;

public class UserList {
    public static user head = null;
    public static user tail = null;

    public static user addNewUser(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone)
    {
        user newUser = new user(signUpUsername,signUpPassword,signUpFname,signUpLname,signUpPhone);
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
