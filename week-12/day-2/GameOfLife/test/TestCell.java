import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Anna on 17/01/17.
 */
public class TestCell {

    @Test
    public void testCountAliveNeighbours() throws Exception {
        Generacio result = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,0,0}});
        Cell c1 = new Cell(1);
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(0));
        c1.addNeighbour(new Cell(0));
        assertEquals(5, c1.countAliveNeighbours());
    }

    @Test
    public void testCountAliveNeighboursAgain() throws Exception {
        Generacio result = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,0,0}});
        Cell c1 = new Cell(1);
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(1));
        c1.addNeighbour(new Cell(0));
        c1.addNeighbour(new Cell(0));
        c1.addNeighbour(new Cell(0));
        c1.addNeighbour(new Cell(0));
        c1.addNeighbour(new Cell(0));
        assertEquals(2, c1.countAliveNeighbours());
    }

    @Test
    public void testEquals() throws Exception {
        Cell c1 =new Cell(1);
        Cell c2 =new Cell(1);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testNotEquals() throws Exception {
        Cell c1 =new Cell(1);
        Cell c2 =new Cell(0);
        assertFalse(c1.equals(c2));
    }
}
