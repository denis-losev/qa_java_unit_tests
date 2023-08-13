import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

public class FelineTest {
    Feline feline = new Feline();
    Random r = new Random();
    int randomInt = r.nextInt(100) + 1;

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultValueTest() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensInitialValueTest() {
        Assert.assertEquals(randomInt, feline.getKittens(randomInt));
    }
}
