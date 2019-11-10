import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertedIndexTest {

    @Test
    void search() {
        InvertedIndex index = new InvertedIndex();

        File f = new File("C:\\Test");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));

        index.buildIndex(files);

        List<File> resultFiles = new ArrayList<>();
        HashMap expected = new HashMap();

        List<File> actualFiles;
        File a = new File("C:\\Test\\A Short History of the World.txt");

        actualFiles = index.search("XERXES");

        // To String method to resolve output difference in Single and Multiple element lists.
        assertEquals("[C:\\Test\\A Short History of the World.txt]", actualFiles.toString());

        File b = new File ("C:\\Test\\The Wind People.txt");
        File c = new File ("C:\\Test\\Plant Lore, Legends and Lyrics.txt");

        resultFiles.add(a);
        resultFiles.add(c);
        resultFiles.add(b);

        actualFiles = index.search("the");

        assertEquals(resultFiles,actualFiles);
    }
}