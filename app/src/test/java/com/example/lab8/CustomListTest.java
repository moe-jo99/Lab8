package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * increase the list by adding a new city
     * get the size of the list
     * delete the city
     * compare sizes with actual - 1
     */
    @Test
    public void removeCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        int listSize = list.getCount();
        list.removeCity(city);
        assertEquals(list.getCount(),listSize - 1);
    }

    /**
     * makes a new city list
     * makes a new city
     * adds the city to list
     * checks if the list contains city
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        assertEquals(1, list.getCount()); // should return 1 expected
        City city2 = new City("Bangkok", "Thailand");
        list.add(city2);
        assertEquals(2, list.getCount()); // should return 2 expected
        list.removeCity(city2);
        assertEquals(1, list.getCount()); // should return 1 expected
    }

}