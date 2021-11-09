package Threads;

import Database.UserList;
import Database.User;

public class CheckUserThread extends Thread{
    String username;
    public boolean result=false;
    public CheckUserThread(String username)
    {
        this.username = username;
    }

    public void run()
    {
        User temp = UserList.head;
        while(temp!=null)
        {
            if(temp.getUsername().equals(this.username))
            {
                result=true;
                return;
        }
            temp = temp.next;
        }

    }

    public void updateUsername(String signUpUsername) {
        this.username=signUpUsername;
    }
}
