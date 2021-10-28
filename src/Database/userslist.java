package Database;

import java.util.Scanner;

public class userslist {
    public static userslist head = null;
    public static userslist tail = null;
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

    public void bookNewCab() {
        Scanner sc = new Scanner(System.in);
        System.out.print("From: ");
        String fromCity = sc.next();
        System.out.print("To: ");
        String toCity = sc.next();
        System.out.println("\nAvailable cabs:\n 1. From: "+fromCity+"  To: "+toCity+"  Type: Mini  Price: 5000INR");
        System.out.println("2. From: "+fromCity+"  To: "+toCity+"  Type: Prime  Price: 10000INR");
        int option = sc.nextInt();
    }
}
