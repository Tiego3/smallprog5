package za.ac.cput.smallprog5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTruthProg extends TestCase{
    @Test
    public void testTruth() throws Exception{
        TruthProg tp = new TruthProg();
        assertTrue(9 > tp.mainTruthProg());
    }
}