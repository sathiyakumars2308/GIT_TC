import org.junit.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {


    @Test
    public void sampleTest()
    {

        SampleEnum SE = SampleEnum.valueOf("FRIDAY");
        System.out.println("SE :"+SE);
        System.out.println("SE.name() :"+SE.name());

        System.out.println("SE.getDay() :"+SE.getDay());
        System.out.println("SE.getWeekDay() :"+SE.getWeekDay());

        System.out.println("SampleEnum.valueOf(\"FRIDAY\") :"+SampleEnum.valueOf("FRIDAY"));

        System.out.println("SampleEnum.values() :"+SampleEnum.values());


 System.out.println("SampleEnum.FRIDAY :"+SampleEnum.FRIDAY);

        System.out.println("SampleEnum.FRIDAY.name():"+SampleEnum.FRIDAY.name());
        System.out.println("(SampleEnum.FRIDAY.getWeekDay()) :"+(SampleEnum.FRIDAY.getWeekDay()));

        System.out.println("(SampleEnum.FRIDAY.getDay()) :"+(SampleEnum.FRIDAY.getDay()));


    }
}
