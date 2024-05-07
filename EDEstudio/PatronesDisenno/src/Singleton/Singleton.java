package Singleton;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        try(Connection conexion = DriverManager.getConnection("url","user","password")){

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
