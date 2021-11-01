

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.Before;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CustomListTest {


    static CustomList list;

    @Before
    public void setup()
    {
        list = new CustomList(null, new ArrayList<City>());
    }
    private City mockCity()
    {
        City city = new City("Calgary", "Alberta");
        return city;
    }

    @Test
    public void addCityTest()
    {
        City c = new City("Edmonton", "AB"); //error was there because constructor wasn't public
        int size = list.getCount();
        list.addCity(c);
        assertEquals(1, list.getCount());
    }

    @Test
    public void testHasCity()
    {

        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        boolean testBool = list.hasCity(city);

        assertEquals(testBool, true);
    }
    @Test
    public void testGetCities()
    {

        City city = new City("Calgary", "Alberta");
        list.add(city);

        assertEquals(city, mockCity());
    }



    @Test
    public void testDelete()
    {
        City city1 = new City("Calgary", "Alberta");
        City city2 = new City("Edmonton", "Alberta");
        list.addCity(city1);
        list.add(city2);
        list.delete(city1);
        assertEquals(1, list.getCities().size());


    }


}
