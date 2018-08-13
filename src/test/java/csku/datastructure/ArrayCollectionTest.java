package csku.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by 708 on 8/10/2018.
 */
class ArrayCollectionTest {
    @Test
    void add() {
        ArrayCollection arrayCollection = new ArrayCollection(1);
        arrayCollection.add(arrayCollection);
        assertEquals(1, arrayCollection.size());
    }

    @Test
    void remove() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void testSizeZero() {
        ArrayCollection arrayCollection = new ArrayCollection();
        assertEquals(0, arrayCollection.size());
    }

}