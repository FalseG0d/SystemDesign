package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        DBManager dbManager1 = DBManager.getInstance();
        DBManager dbManager2 = DBManager.getInstance();
        DBManager dbManager3 = DBManager.getInstance();
        DBManager dbManager4 = DBManager.getInstance();

        System.out.println(dbManager1);
        System.out.println(dbManager2);
        System.out.println(dbManager3);
        System.out.println(dbManager4);
    }
}
