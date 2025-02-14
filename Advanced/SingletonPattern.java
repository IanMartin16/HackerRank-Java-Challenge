import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str = "Hello I am a singleton! Let me say hello world to you"; 
    
    private static Singleton singleton;
    
    private Singleton(){
        
    }
    
    public static Singleton getSingleInstance(){
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }
}