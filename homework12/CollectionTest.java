import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {
    private static StringCollection stringCollection;

    @BeforeEach
    public void configuration() {
        stringCollection = new StringCollection();

        stringCollection.add("a");
        stringCollection.add("b");
        stringCollection.add("c");
    }

    @Test
    public void testAdd() {
        assertTrue(stringCollection.add("d"));

        StringCollection expectedValues = new StringCollection();

        expectedValues.add("a");
        expectedValues.add("b");
        expectedValues.add("c");
        expectedValues.add("d");

        assertEquals(expectedValues, stringCollection);
    }

    @Test
    public void testRemove() {
        assertTrue(stringCollection.remove("c"));

        StringCollection expectedValues = new StringCollection();

        expectedValues.add("a");
        expectedValues.add("b");


        assertEquals(expectedValues, stringCollection);
    }

    @Test
    public void testGetByIndex() {

        assertEquals("b", stringCollection.getByIndex(1));
    }

    @Test
    public void testContains() {
        assertTrue(stringCollection.contains("b"));
        assertFalse(stringCollection.contains("d"));
    }

    @Test
    public void testEquals() {
        StringCollection expectedValues = new StringCollection();

        expectedValues.add("a");
        expectedValues.add("b");
        expectedValues.add("c");

        assertEquals(expectedValues, stringCollection);
        assertNotEquals(expectedValues, new Object());
    }

    @Test
    public void testClear() {
        stringCollection.clear();

        assertEquals(0, stringCollection.getSize());
        assertNotEquals(1, stringCollection.getSize());
    }

    @Test
    public void testIndexOf() {

        assertEquals(2, stringCollection.indexOf("c"));
        assertNotEquals(0, stringCollection.indexOf("b"));
    }

}
