import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {


    static CustomList list;

    @Before
    public void setup()
    {
        list = new CustomList(null, new ArrayList<City>());
    }


    @Test
    public void addCityTest()
    {
        City c = new City("Edmonton", "AB"); //error was there because constructor wasn't public
        int size = list.getCount();
        list.addCity(c);
        assertEquals(1, list.getCount());
    }
}
