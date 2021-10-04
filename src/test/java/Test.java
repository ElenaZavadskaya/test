import org.testng.Assert;

public class Test {

    @org.testng.annotations.Test
    public void test(){
        String actual = "str";
        String expected = "str";
        Assert.assertEquals(actual, expected, "Messages are not equal");
    }

    @org.testng.annotations.Test
    public void test2(){
        boolean actual = true;
        boolean expected = false;
        Assert.assertEquals(actual, expected, "Values are not equal");
    }
}
