import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Anna on 17/01/17.
 */
public class TestGeneracio {

    @Test
    public void testFirst() throws Exception {
        Generacio result = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,0,0}});
        Generacio origin = new Generacio(new int[][]{{0,1,0},{0,1,1}, {0,0,0}});
        assertEquals(result, origin.createNextGeneration());
    }

    @Test
    public void testEquals() throws Exception {
        Generacio g1 = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,0,0}});
        Generacio g2 = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,0,0}});
        assertTrue(g1.equals(g2));
    }

    @Test
    public void testNotEquals() throws Exception {
        Generacio g1 = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,0,0}});
        Generacio g2 = new Generacio(new int[][]{{0,0,1}, {0,1,1}, {0,0,0}});
        assertFalse(g1.equals(g2));
    }

    @Test
    public void testListAliveNeighbours() throws Exception {
        Generacio g1 = new Generacio(new int[][]{{0,1,1}, {0,1,1}, {0,1,0}});
        int[][] expected = new int[][]{{2, 3, 3}, {3, 4, 4}, {2, 2, 3}};
        assertEquals(expected, g1.listAliveNeighbours());
    }

}
