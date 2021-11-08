package Database;

import Hacks.hack;
import Threads.FindCabThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user extends Human{
//    public static user head = null;/// head= mukulasija-->next=yash
//    public static user tail = null;///tail= yash
    public user next = null;
    private user uid = null;
//    private String Fname;
//    private String Lname;
//    private String Phone;
//    private String userName;
    private final String password;
    public List<cab> bookedCabs = new ArrayList<cab>();
//    public void setUsername(String userName)
//    {
//        this.userName = userName;
//    }
//    public void setPassword(String password)
//    {
//        this.password = password;
//    }
//    public void ChangeFnameWithPass()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter new First Name: ");
//        String newFname = sc.next();
//        System.out.print("Enter Your password: ");
//        String checkPass = sc.next();
//        if (uid.Authenticate(checkPass))
//        {
//         Fname = newFname;
//        }
//        else
//        {
//            System.out.println("Wrong Password...");
//        }
//    }
//    public void ChangeLnameWithPass()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter new Last Name: ");
//        String newLname = sc.next();
//        System.out.print("Enter Your password: ");
//        String checkPass = sc.next();
//        if (uid.Authenticate(checkPass))
//        {
//            Lname = newLname;
//        }
//        else
//        {
//            System.out.println("Wrong Password...");
//        }
//    }
//    public void ChangePhoneWithPass()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter new Phone Number: ");
//        String newPhone = sc.next();
//        System.out.print("Enter Your password: ");
//        String checkPass = sc.next();
//        if (uid.Authenticate(checkPass))
//        {
//            Phone = newPhone;
//        }
//        else
//        {
//            System.out.println("Wrong Password...");
//        }
//    }
//    public void ChangeUsernameWithPass()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter new Username: ");
//        String newUsername = sc.next();
//        System.out.print("Enter Your password: ");
//        String checkPass = sc.next();
//        if (uid.Authenticate(checkPass))
//        {
//            userName = newUsername;
//        }
//        else
//        {
//            System.out.println("Wrong Password...");
//        }
//    }
//    public String getUsername() {
//        return this.userName;
//    }

//    public boolean Authenticate(String pass) {
//        if(pass.equals(password))
//        {
//
//            return true;
//        }
//
//        return false;
//    }
//    public String getFname(){return Fname;}
//
//    public String getLname() {
//        return Lname;
//    }
//
//    public String getPhone() {
//        return Phone;
//    }
//
//    public String getPassword()
//    {
//        return  password;
//    }
    public user(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone)
    {
        this.userName=signUpUsername;
        this.password=signUpPassword;
        this.Fname=hack.FormatString(signUpFname);
        this.Lname=hack.FormatString(signUpLname);
        this.Phone=signUpPhone;
        this.uid=this;
    }
//    public void bookNewCab() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many people: ");
//        int passengerCount = hack.TakeArithemeticInput();
//        System.out.print("From: ");
//        String fromCity = hack.FormatString(sc.next());
//        FindCabThread fc = new FindCabThread(fromCity,passengerCount);
//        fc.start();
//        System.out.print("To: ");
//        String toCity = hack.FormatString(sc.next());
////        try {
////            fc.join();
////        } catch (InterruptedException e) {
////        }
//        List<cab> results = fc.results;
//        if (results.size() == 0)
//        {
//            System.out.println("\nNo Cabs From Given Location..");
//            return;
//        }
//
//        System.out.println("\nAvailable cabs:\n");
//        int i=1;
//        for(cab result :results)
//        {
//            System.out.println(i+". From: "+result.from+"  To: "+toCity+"  Type: "+result.type+"  Price: "+result.pricePerKm+"(per km)  Capacity: "+result.capacity);
//            i++;
//        }
//        System.out.println(i+". Go back");
//        int option = hack.TakeArithemeticInput();
//        if(option==i)
//            return;
//        uid.bookedCabs.add(results.get(option-1));
//        results.get(option-1).bookedByUser=uid;
//    }

    public void unBookCab(int i) {
        bookedCabs.get(i).unbook();
//        bookedCabs.get(i).bookedByUser=null;
        bookedCabs.remove(i);
    }

    @Override
    public boolean Authenticate(String pass) {
        return pass.equals(password);
    }
}
