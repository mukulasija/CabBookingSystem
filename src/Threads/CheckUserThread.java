package Threads;

import Database.user;

public class CheckUserThread extends Thread{
    String username;
    public boolean result=false;
    public CheckUserThread(String username)
    {
        this.username = username;
    }

    public void run()
    {
        user temp = user.head;
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

}
