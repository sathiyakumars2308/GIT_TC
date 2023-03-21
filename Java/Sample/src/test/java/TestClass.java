import org.junit.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {


    @Test
    public void sampleTest()
    {
 System.out.println(SampleEnum.valueOf("FRIDAY"));
        System.out.println(SampleEnum.values());

 System.out.println((SampleEnum.FRIDAY));
        System.out.println((SampleEnum.FRIDAY.getWeekDay()));

        System.out.println((SampleEnum.FRIDAY.getDay()));
    }
}
