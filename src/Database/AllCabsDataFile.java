package Database;

import Database.CabList;

public class AllCabsDataFile {
    public AllCabsDataFile()
    {
        //TODO: Delete this user, it is just for testing purpose
        UserList.addNewUser("mukulasija","mukul123","mukul","asija","9050816602");
        CabList.addNewCab("Delhi","mini",10,4);
        CabList.addNewCab("Delhi","Prime",20,8);
        CabList.addNewCab("Sirsa","mini",15,2);
        CabList.addNewCab("Sirsa","Prime",10,6);
        CabList.addNewCab("Jaipur","mini",10,5);
        CabList.addNewCab("Jaipur","prime",30,4);
    }
}
