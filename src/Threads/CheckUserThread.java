package Threads;

import Database.userslist;

public class CheckUserThread extends Thread{
    String username;
    public boolean result=false;
    public CheckUserThread(String username)
    {
        this.username = username;
    }

    public void run()
    {
        userslist temp = userslist.head;
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
