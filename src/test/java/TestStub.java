import awesteam.dmd.utils.SecurityManager;
import org.junit.Test;

public class TestStub {

    @Test
    public void encodeDecodeTest(){
        String srcStr = "kek";
        String encStr = SecurityManager.encodeString(srcStr);
        System.out.println(srcStr+" -> "+encStr);
        String decStr = SecurityManager.decodeString(encStr);
        System.out.println(srcStr+"=="+decStr);
        assert srcStr.equals(decStr);
    }

    private void rawEncTest(String srcStr){
        System.out.println("raw src : "+srcStr);
        String encStr = SecurityManager.encodeString(srcStr);
        System.out.println("raw enc : "+encStr);
        String decStr = SecurityManager.decodeString(encStr);
        System.out.println("raw dec : "+decStr);
        assert srcStr.equals(decStr);
    }

    @Test
    public void rawEncTest() {
        final String[] toTest = new String[]{
                "test_string"
        };
        for (String str : toTest) {
            rawEncTest(str);
        }
    }

    @Test
    public void test0(){
        System.out.println("hello test!");
    }

}
