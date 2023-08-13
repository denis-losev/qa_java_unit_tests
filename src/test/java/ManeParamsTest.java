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
                { "Самка", false},
                { "Exception", false}
        };
    }

    @Test
    public void maneTest() {
        try {

            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(mane, lion.doesHaveMane());
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}
