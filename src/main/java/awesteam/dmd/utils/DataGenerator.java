package awesteam.dmd.utils;

public class DataGenerator {

    public static int generateRandomInteger(int min,int max){
        assert max >= min;
        return min + (int)(Math.random()*(max-min));
    }

    public static String generateRandomName(){
        return "Name"+generateRandomString(generateRandomInteger(2,6));
    }

    public static String generateRandomSurname(){
        return "Surname"+generateRandomString(generateRandomInteger(4,8));
    }

    public static String generateRandomAddress(){
        return "City "+generateRandomString(generateRandomInteger(4,10))
                + ", "+generateRandomString(generateRandomInteger(6,15))+" street"
                + ", "+generateRandomInteger(0,400)+"-"
                        +generateRandomInteger(0,200)+".";
    }

    public static String generateRandomString(int length){
        assert length>=0;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(generateRandomChar());
        }
        return sb.toString();
    }

    public static char generateRandomChar(){
        if (Math.random()>0.5) {
            return (char) ('a' + (int) (('z' - 'a') * Math.random()));
        }else{
            return (char) ('A' + (int) (('Z' - 'A') * Math.random()));
        }
    }

}
