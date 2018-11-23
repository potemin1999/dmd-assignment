import awesteam.dmd.utils.DataGenerator;
import org.junit.Test;

public class GeneratorTest {

    @Test
    public void test1(){
        System.out.println(DataGenerator.generateRandomInteger(1337,12345));
        System.out.println(DataGenerator.generateRandomAddress());
        System.out.println(DataGenerator.generateRandomName());
        System.out.println(DataGenerator.generateRandomSurname());
        System.out.println(DataGenerator.generateRandomString(100));
        System.out.println(DataGenerator.generateRandomChar());
    }

}
