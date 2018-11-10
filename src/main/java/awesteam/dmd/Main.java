package awesteam.dmd;

import awesteam.dmd.utils.DatabaseManager;
import awesteam.dmd.utils.LogManager;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class Main {

    public static void main(String[] args){
        LogManager.getInstance();
        DatabaseManager.getInstance();
        log.log(Level.FINE,"Ok, system can run");
    }

}
