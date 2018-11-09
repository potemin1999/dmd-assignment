package awesteam.dmd.utils;

public class DatabaseManager {

    private static DatabaseManager instance;

    public static DatabaseManager getInstance() {
        if (instance==null){
            instance = new DatabaseManager();
        }
        return instance;
    }

    private DatabaseManager(){

    }


}
