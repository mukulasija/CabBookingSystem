package Database;

import Hacks.hack;
import Threads.FindCabThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user {
//    public static user head = null;/// head= mukulasija-->next=yash
//    public static user tail = null;///tail= yash
    public user next = null;
    public user uid = null;
    private String Fname;
    private String Lname;
    private String Phone;
    private String userName;
    protected String password;
    public List<cab> bookedCabs = new ArrayList<cab>();
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
    public String getPassword()
    {
        return  password;
    }
    public user(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone)
    {
        this.userName=signUpUsername;
        this.password=signUpPassword;
        this.Fname=signUpFname; //TO-DO = hack.format string on every string in the programe
        this.Lname=signUpLname;
        this.Phone=signUpPhone;
        this.uid=this;
    }
    public void bookNewCab() {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many people: ");
        int passengerCount = sc.nextInt();
        System.out.print("From: ");
        String fromCity = sc.next();
        FindCabThread fc = new FindCabThread(fromCity,passengerCount);
        fc.start();
        System.out.print("To: ");
        String toCity = sc.next();
//        try {
//            fc.join();
//        } catch (InterruptedException e) {
//        }
        List<cab> results = fc.results;
        if (results.size() == 0)
        {
            System.out.println("\nNo Cabs From Given Location..");
            return;
        }

        System.out.println("\nAvailable cabs:\n");
        int i=1;
        for(cab result :results)
        {
            System.out.println(i+". From: "+result.from+"  To: "+toCity+"  Type: "+result.type+"  Price: "+result.pricePerKm+"(per km)  Capacity: "+result.capacity);
            i++;
        }
        System.out.println(i+". Go back");
        int option = sc.nextInt();
        if(option==i)
            return;
        uid.bookedCabs.add(results.get(option-1));
        results.get(option-1).bookedByUser=uid;
    }
}
