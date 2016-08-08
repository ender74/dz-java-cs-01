package de.ender74.dzcode.ch01.test;

import de.ender74.dzcode.ch01.DistinctSymbolCounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by HHüter on 08.08.2016.
 */
public class DistinctSymbolCounterTest {
    private DistinctSymbolCounter symbolCounter;

    @Before
    public void setUp() {
        this.symbolCounter = new DistinctSymbolCounter();
    }

    @Test
    public void testZuulon() {
        final int result = symbolCounter.countDistinctSymbols("Zuulon");
        assertEquals(11, result);
    }

    @Test
    public void testAaaaaaa() {
        final int result = symbolCounter.countDistinctSymbols("Aaaaaaa");
        assertEquals(1, result);    // Aa
    }

    @Test
    public void testAbba() {
        final int result = symbolCounter.countDistinctSymbols("Abba");
        assertEquals(4, result);  // Aa, Bb, Ab, Ba
    }
}
