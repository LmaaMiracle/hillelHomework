package algoTests;

import jdk.jshell.ImportSnippet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import yarchuk.BinarySearch;
import yarchuk.BubbleSort;
import yarchuk.InsertionSort;
import yarchuk.InterpolationSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


public class AlgorithmsTests {

    private final double[] sortedArray = {-33.043, -4.0, 0.0, 2.0, 123.4};
    private final int[] sortedIntegerArray = {-33, -4, 4, 73, 123};

    //note: for arrays use assertArrayEquals, other methods are not working

    @Test
    public void testBubbleSort() {
        double[] expectedArray = {-33.043, -4.0, 0.0, 2.0, 123.4};
        double[] array = {2.0, 0.0, -4.0, 123.4, -33.043};
        assertArrayEquals(expectedArray, BubbleSort.bubbleSort(array));
    }

    @Test
    public void testInsertionSort() {
        double[] expectedArray = {-33.043, -4.0, 0.0, 2.0, 123.4};
        double[] array = {2.0, 0.0, -4.0, 123.4, -33.043};
        assertArrayEquals(expectedArray, InsertionSort.insertionSort(array));
    }

    @Test
    public void testInterpolationSearch() {
        int[] sortedIntegerArray = {-33, -4, 4, 73, 123};

        assertEquals(2, InterpolationSearch.interpolationSearch(sortedIntegerArray, 4));
        assertEquals(-1, InterpolationSearch.interpolationSearch(sortedIntegerArray, 0));
        assertNotEquals(3, InterpolationSearch.interpolationSearch(sortedIntegerArray, 0));
    }

    @Test
    public void testBinarySearch() {
        int[] sortedIntegerArray = {-33, -4, 4, 73, 123};

        assertEquals(2, InterpolationSearch.interpolationSearch(sortedIntegerArray, 4));
        assertEquals(-1, InterpolationSearch.interpolationSearch(sortedIntegerArray, 0));
        assertNotEquals(3, InterpolationSearch.interpolationSearch(sortedIntegerArray, 0));
    }

}
