package Database;

import Threads.FindCabThread;

import java.util.List;
import java.util.Scanner;

public class userslist {
    public static userslist head = null;/// head= mukulasija-->next=yash
    public static userslist tail = null;///tail= yash
    public userslist next = null;
    public userslist uid = null;
    private String userName;
    protected String password;
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

    public void bookNewCab(){

        Scanner sc = new Scanner(System.in);
        System.out.print("From: ");
        String fromCity = sc.next();
        System.out.print("To: ");
        String toCity = sc.next();
        FindCabThread fc = new FindCabThread(fromCity);
        fc.start();
        List<cabList> results = fc.results;
        System.out.println("\nAvailable cabs:\n");
        for(cabList result:results)
        {
            System.out.println(" 1. From: "+result.from+"  To: "+toCity+"  Type: "+result.type);
        }
//        System.out.println("2. From: "+fromCity+"  To: "+toCity+"  Type: Prime  Price: 10000INR");
        int option = sc.nextInt();
    }
}
