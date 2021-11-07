package Threads;

import Database.UserList;
import Database.user;

public class LoginThread extends Thread{
    private final String username;
    private String pass =null;
    private user uid = null;
    public user getUid()
    {
        return  uid;
    }
    public String getPass()
    {
        return pass;
    }

    public LoginThread(String username)
    {
        this.username = username;
    }
    public void run()
    {
        user temp = UserList.head;
        while(temp!=null)
        {
            if(temp.getUsername().equals(this.username))
            {
                pass=temp.getPassword();
                uid = temp;
                return;
            }
            temp = temp.next;
        }
    }
}
