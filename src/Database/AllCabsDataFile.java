package Database;

import Database.CabList;

public class AllCabsDataFile {
    public AllCabsDataFile()
    {
        //TODO: Delete this user, it is just for testing purpose
        UserList.addNewUser("mukulasija","mukul123","mukul","asija","9050816602");
        CabList.addNewCab("Delhi","mini",1,"Mukesh",4);
        CabList.addNewCab("Delhi","Prime",20,"Suresh",8);
        CabList.addNewCab("Sirsa","mini",5,"Rajan",2);
        CabList.addNewCab("Sirsa","Prime",10,"lll",6);
    }
}
