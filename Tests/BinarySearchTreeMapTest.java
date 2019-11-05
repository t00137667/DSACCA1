import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeMapTest {

    @Test
    void keySet() {
        BinarySearchTreeMap newMap = new BinarySearchTreeMap();

        newMap.put("Rob", "Tomatoe");
        newMap.put("Bob", "Potatoe");
        newMap.put("Cob", "Corn");
        newMap.put("Slob", "Sloppy Joe");

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
}