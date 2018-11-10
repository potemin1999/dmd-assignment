package awesteam.dmd.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogManager {

    private static LogManager instance;

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public LogManager() {
        String configuration = "handlers = java.util.logging.FileHandler, java.util.logging.ConsoleHandler\n" +
                ".level = ALL\n" +
                "\n" +
                "java.util.logging.ConsoleHandler.level = ALL\n"+
                "java.util.logging.ConsoleHandler.formatter = awesteam.dmd.utils.LogManager$ConsoleFormatter";
        InputStream inputStream = new ByteArrayInputStream(configuration.getBytes());
        try {
            java.util.logging.LogManager.getLogManager().readConfiguration(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static class ConsoleFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            StringBuilder sb = new StringBuilder();
            sb.append(record.getLevel().intValue()>800 ? (Color.RED.toString()) :
                    (record.getLevel().intValue()>500 ? Color.YELLOW.toString() : Color.GREEN.toString()));
            sb.append(String.format("%1$-8s",record.getLevel()));
            sb.append(Color.WHITE);
            sb.append(" : ");
            sb.append(record.getMessage());
            sb.append(Color.RESET).append("\n");
            if (record.getThrown()!=null){
                record.getThrown().printStackTrace();
            }
            return sb.toString();
        }

    }

    public enum Color{
        RESET,
        WHITE,
        GREEN,
        YELLOW,
        RED;

        @Override
        public String toString() {
            switch (this){
                case RESET: return "\033[0m";
                case WHITE: return "\033[0;37m";
                case GREEN: return "\033[0;32m";
                case YELLOW: return "\033[0;33m";
                case RED: return "\033[0;31m";
                default: return "\033[0m";
            }
        }
    }

}
