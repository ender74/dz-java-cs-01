package de.ender74.dzcode.ch01.test;

import de.ender74.dzcode.ch01.SymbolCreatorFirstAlph;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by HHüter on 08.08.2016.
 */
public class SymbolCreatorFirstAlphTest {
    private SymbolCreatorFirstAlph symbolCreator;

    @Before
    public void setUp() {
        this.symbolCreator = new SymbolCreatorFirstAlph();
    }

    @Test
    public void testGozerium() {
        final String result = symbolCreator.getSymbol("Gozerium");
        assertEquals("Ei", result);
    }

    @Test
    public void testSlimyrine() {
        final String result = symbolCreator.getSymbol("Slimyrine");
        assertEquals("Ie", result);
    }

    @Test
    public void testAardvark() {
        final String result = symbolCreator.getSymbol("Aardvark");
        assertEquals("Aa", result);
    }
}
