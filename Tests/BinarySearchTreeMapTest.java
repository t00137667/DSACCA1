import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeMapTest {

    BinarySearchTreeMap<String,String> newMap;
    BinarySearchTreeMap<String,String> emptyMap;

    @BeforeEach
    void setup(){
        emptyMap = new BinarySearchTreeMap();

        newMap = new BinarySearchTreeMap();
        newMap.put("Rob", "Tomatoe");
        newMap.put("Bob", "Potatoe");
        newMap.put("Cob", "Corn");
        newMap.put("Slob", "Sloppy Joe");
    }

    @Test
    void keySet() {

        Set<String> expected = new TreeSet<>();
        expected.add("Bob");
        expected.add("Cob");
        expected.add("Rob");
        expected.add("Slob");
        //System.out.println(expected);

        Set<String> actual = newMap.keySet();
        //System.out.println(actual);

        assertEquals(expected,actual);
    }

    @Test
    void emptyKeySet(){
        Set<String> expected = new TreeSet<>();
        Set<String> actual = emptyMap.keySet();

        assertEquals(expected,actual);
    }

    @Test
    void height() {
        int actual = newMap.height();
        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    void emptyHeight(){
        int actual = emptyMap.height();
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    void get() {
        String actual = newMap.get("Rob");
        String expected = "Tomatoe";
        assertEquals(expected,actual);
    }
}