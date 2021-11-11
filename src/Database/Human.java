package Database;

import java.util.Scanner;

public abstract class Human {
    protected String fname;
    protected String lname;
    protected String phone;
    protected  String userName;
    abstract boolean Authenticate(String pass);
    public String getUsername() {
        return this.userName;
    }
    public String getFname(){return fname;}

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }
    public void ChangeFnameWithPass()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new First Name: ");
        String newFname = sc.next();
        System.out.print("Enter Your password: ");
        String checkPass = sc.next();
        if (Authenticate(checkPass))
        {
            fname = newFname;
        }
        else
        {
            System.out.println("Wrong Password...");
        }
    }
    public void ChangeLnameWithPass()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Last Name: ");
        String newLname = sc.next();
        System.out.print("Enter Your password: ");
        String checkPass = sc.next();
        if (Authenticate(checkPass))
        {
            lname = newLname;
        }
        else
        {
            System.out.println("Wrong Password...");
        }
    }
    public void ChangePhoneWithPass()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Phone Number: ");
        String newPhone = sc.next();
        System.out.print("Enter Your password: ");
        String checkPass = sc.next();
        if (Authenticate(checkPass))
        {
            phone = newPhone;
        }
        else
        {
            System.out.println("Wrong Password...");
        }
    }
    public void ChangeUsernameWithPass()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Username: ");
        String newUsername = sc.next();
        System.out.print("Enter Your password: ");
        String checkPass = sc.next();
        if (Authenticate(checkPass))
        {
            userName = newUsername;
        }
        else
        {
            System.out.println("Wrong Password...");
        }
    }
}
