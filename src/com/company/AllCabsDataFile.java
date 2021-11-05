package com.company;
import Database.cabList;
public class AllCabsDataFile {
    ManageCabs cabAdmin = new ManageCabs();
    AllCabsDataFile()
    {
        cabAdmin.addCab("Delhi","mini",1,"Mukesh",4);
        cabAdmin.addCab("Delhi","Prime",20,"Suresh",4);
        cabAdmin.addCab("Sirsa","mini",5,"Rajan",4);
        cabAdmin.addCab("Sirsa","Prime",10,"lll",4);
    }
}
