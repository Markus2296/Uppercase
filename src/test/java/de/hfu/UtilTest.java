package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void TestistErstesHalbjahr(){
        int monat = 6;
        int monat1 = 7;
        assertTrue("Ist nicht erstes Halbjahr", Util.istErstesHalbjahr(monat));
        assertFalse("Ist zweites Halbjahr", Util.istErstesHalbjahr(monat1));


    }
}
