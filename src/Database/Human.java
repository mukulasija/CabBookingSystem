package Database;

import java.util.Scanner;

public abstract class Human {
    protected String Fname;
    protected String Lname;
    protected String Phone;
    protected  String userName;
    abstract boolean Authenticate(String pass);
    public String getUsername() {
        return this.userName;
    }
    public String getFname(){return Fname;}

    public String getLname() {
        return Lname;
    }

    public String getPhone() {
        return Phone;
    }

//    public String getPassword()
//    {
//        return  password;
//    }
    public void ChangeFnameWithPass()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new First Name: ");
        String newFname = sc.next();
        System.out.print("Enter Your password: ");
        String checkPass = sc.next();
        if (Authenticate(checkPass))
        {
            Fname = newFname;
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
            Lname = newLname;
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
            Phone = newPhone;
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
