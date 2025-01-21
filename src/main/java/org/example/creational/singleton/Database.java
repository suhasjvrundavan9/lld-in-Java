package org.example.creational.singleton;

import javax.xml.crypto.Data;

public class Database {

    private static Database instance = null;

    private Database(){}

    //double-checked locking approach
    public static Database getInstance(){
        if(instance == null){
            synchronized (Database.class){
                //second check is needed to validate only one thread creates a object in multi-threaded environment
                if(instance == null){
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
