import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ManeParamsTest {
    private final String sex;
    private final boolean mane;
    Feline feline = new Feline();
    public ManeParamsTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestValues() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}
        };
    }

    @Test
    public void maneTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(mane, lion.doesHaveMane());
    }
}
