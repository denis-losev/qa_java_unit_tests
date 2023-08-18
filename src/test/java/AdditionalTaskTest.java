import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AdditionalTaskTest {
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}
