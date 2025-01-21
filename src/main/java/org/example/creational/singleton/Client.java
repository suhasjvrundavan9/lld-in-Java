package org.example.creational.singleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {

        //only one object can be created
        Database db = Database.getInstance();

        //next time if we try to create another object again it will give us this object only
        Database db2 = Database.getInstance();

    }
}
