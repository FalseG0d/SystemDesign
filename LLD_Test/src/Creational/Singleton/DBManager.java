package Creational.Singleton;

public class DBManager {
    private static DBManager instance = null;
    private DBManager() {
        System.out.println("DB Instance Created");
    }

    public static DBManager getInstance() {
        if(instance == null) instance = new DBManager();

        return instance;
    }
}
