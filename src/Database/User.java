package Database;

import Hacks.Hack;
import Threads.FindCabThread;
import Threads.FindCityThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends Human{
    public User next = null;
    private User uid = null;
    private final String password;
    public List<Cab> bookedCabs = new ArrayList<Cab>();
    public User(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone)
    {
        this.userName=signUpUsername;
        this.password=signUpPassword;
        this.Fname= Hack.FormatString(signUpFname);
        this.Lname= Hack.FormatString(signUpLname);
        this.Phone=signUpPhone;
        this.uid=this;
    }

    public void unBookCab(int i) {
        bookedCabs.get(i).unbook();
        bookedCabs.remove(i);
    }

    @Override
    public boolean Authenticate(String pass) {
        return pass.equals(password);
    }



    public void bookCab()
    {
        Scanner sc = new Scanner(System.in);
        Hack.bigLine(30);
        System.out.println("\nEnter Your Requirements");
        Hack.bigLine(30);
        System.out.print("\n\nEnter No. Of Passengers: ");
        int passengerCount = Hack.TakeArithemeticInput();
        System.out.print("Enter Initial Destination: ");
        String fromCity = Hack.FormatString(sc.next());
        FindCityThread fromThread = new FindCityThread(fromCity);
        fromThread.start();
        FindCabThread fc = new FindCabThread(fromCity,passengerCount);
        fc.start();
        System.out.print("Enter Final Destination: ");
        String toCity = Hack.FormatString(sc.next());
        FindCityThread toThread = new FindCityThread(toCity);
        toThread.start();
        System.out.print("Duration Of Trip(in Days): ");
        int days = Hack.TakeArithemeticInput();
        int frindex = fromThread.index;
        int toindex = toThread.index;
        int dist = Math.abs(frindex-toindex);
        List<Cab> results = fc.results;
        if (results.size() == 0)
        {
            System.out.println("\nNo Cabs From Given Location..");
            return;
        }
        Hack.bigLine();
        Hack.giveLine();
        Hack.giveSpaces(3);
        System.out.print("Available cabs:\n");
        Hack.bigLine();
        System.out.print("\n");
        int i=1;
        int price;
        for(Cab result :results)
        {
            price = result.pricePerKm*(dist%10)*(days*100);
            System.out.println(i+". From: "+result.from+" || To: "+toCity+" || Type: "+result.type+" || Price: "+price+" || Capacity: "+result.capacity);
            i++;
        }
        System.out.println(i+". Go back");
        int option = Hack.TakeArithemeticInput();
        if(option==i)
            return;
        uid.bookedCabs.add(results.get(option-1));
        price = results.get(option-1).pricePerKm*(dist%10)*(days*100);
        results.get(option-1).book(uid,days,price);
    }
}
