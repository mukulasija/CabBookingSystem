package Database;

import Threads.FindCabThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class userslist {
    public static userslist head = null;/// head= mukulasija-->next=yash
    public static userslist tail = null;///tail= yash
    public userslist next = null;
    public userslist uid = null;
    private String userName;
    protected String password;
    public List<cabList> bookedCabs = new ArrayList<cabList>();
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

    public void bookNewCab() {

        Scanner sc = new Scanner(System.in);
        System.out.print("From: ");
        String fromCity = sc.next();
        System.out.print("To: ");
        String toCity = sc.next();
        FindCabThread fc = new FindCabThread(fromCity);
        fc.start();
        try {
            fc.join();
        } catch (InterruptedException e) {

        }
        List<cabList> results = fc.results;
        if (results.size() == 0)
        {
            System.out.println("\nNo Cabs From Given Location..");
            return;
        }

        System.out.println("\nAvailable cabs:\n");
        int i=1;
        for(cabList result :results)
        {
            System.out.println(i+". From: "+result.from+"  To: "+toCity+"  Type: "+result.type);
            i++;
        }
//        System.out.println("2. From: "+fromCity+"  To: "+toCity+"  Type: Prime  Price: 10000INR");
        int option = sc.nextInt();
        uid.bookedCabs.add(results.get(option-1));
        results.get(option-1).bookedByUser=uid;
    }
}
