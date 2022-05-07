import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testAbbr() {
        String result = Main.abbr("Hallo", 4);
        Assert.assertEquals(result, "H...");
    }
    @Test
    public void testAbbr1(){
        String result = StringUtils.abbreviate("Hello", 4);
        Assert.assertEquals(result, "H...");
    }
}