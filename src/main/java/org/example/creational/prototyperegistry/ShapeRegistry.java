package org.example.creational.prototyperegistry;

import java.util.HashMap;
import java.util.Map;

//create a registry to save different prototypes/objects
//so that we can retrieve and clone them and return them when needed instead of creating from scratch
public class ShapeRegistry {
    Map<String, Shape> map = new HashMap<>();

    //register/add a prototype/object
    public void registerPrototype(String key, Shape prototype){
        map.put(key,prototype);
    }

    //clone a prototype/object from a key value
    public Shape clonePrototype(String key){
        Shape prototype = map.get(key);

        if(prototype != null){
            return prototype.clone();
        }
        return null;
    }

}
