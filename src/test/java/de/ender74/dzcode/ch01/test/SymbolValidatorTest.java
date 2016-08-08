package de.ender74.dzcode.ch01.test;

import de.ender74.dzcode.ch01.SymbolValidator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by HHüter on 08.08.2016.
 */
public class SymbolValidatorTest {
    private SymbolValidator symbolValidator;

    @Before
    public void setUp() {
        symbolValidator = new SymbolValidator();
    }

    @Test
    public void testSpenglerium_Ee() {
        final boolean result = symbolValidator.validate("Spenglerium", "Ee");
        assertEquals(true, result);
    }

    @Test
    public void testZeddemorium_Zr() {
        final boolean result = symbolValidator.validate("Zeddemorium", "Zr");
        assertEquals(true, result);
    }

    @Test
    public void testVenkmine_Kn() {
        final boolean result = symbolValidator.validate("Venkmine", "Kn");
        assertEquals(true, result);
    }

    @Test
    public void testStantzon_Zt() {
        final boolean result = symbolValidator.validate("Stantzon", "Zt");
        assertEquals(false, result);
    }

    @Test
    public void testMelintzum_Nn() {
        final boolean result = symbolValidator.validate("Melintzum", "Nn");
        assertEquals(false, result);
    }

    @Test
    public void testTullium_Ty() {
        final boolean result = symbolValidator.validate("Tullium", "Ty");
        assertEquals(false, result);
    }

    @Test
    public void testBoron_B() {
        final boolean result = symbolValidator.validate("Boron", "B");
        assertEquals(false, result);
    }

    @Test
    public void testMercury_Hg() {
        final boolean result = symbolValidator.validate("Mercury", "Hg");
        assertEquals(false, result);
    }

    @Test
    public void testMercury_Cy() {
        final boolean result = symbolValidator.validate("Mercury", "Cy");
        assertEquals(true, result);
    }

    @Test
    public void testSilver_Vr() {
        final boolean result = symbolValidator.validate("Silver", "Vr");
        assertEquals(true, result);
    }

    @Test
    public void testSilver_Rv() {
        final boolean result = symbolValidator.validate("Silver", "Rv");
        assertEquals(false, result);
    }

    @Test
    public void testMagnesium_Ma() {
        final boolean result = symbolValidator.validate("Magnesium", "Ma");
        assertEquals(true, result);
    }

    @Test
    public void testMagnesium_Am() {
        final boolean result = symbolValidator.validate("Magnesium", "Am");
        assertEquals(true, result);
    }

    @Test
    public void testXenon_Nn() {
        final boolean result = symbolValidator.validate("Xenon", "Nn");
        assertEquals(true, result);
    }

    @Test
    public void testXenon_Xx() {
        final boolean result = symbolValidator.validate("Xenon", "Xx");
        assertEquals(false, result);
    }

    @Test
    public void testXenon_Oo() {
        final boolean result = symbolValidator.validate("Xenon", "Oo");
        assertEquals(false, result);
    }
}
