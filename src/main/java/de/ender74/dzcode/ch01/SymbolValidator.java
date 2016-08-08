package de.ender74.dzcode.ch01;

/**
 * Created by HHüter on 08.08.2016.
 */
public class SymbolValidator {
    public static final int SYMBOL_LENGTH = 2;

    public boolean validate(String elementName, String symbol) {
        if (elementName == null || symbol == null)
            return false;
        elementName = elementName.trim().toLowerCase();
        symbol = symbol.trim().toLowerCase();
        if (symbol.length() != SYMBOL_LENGTH || elementName.length() < SYMBOL_LENGTH)
            return false;
        int run = 0;
        for (int i = 0; i < symbol.length(); i++) {
            char currentChar = symbol.charAt(i);
            int idx = elementName.indexOf(currentChar, run);
            if (idx < 0)
                return false;
            run = idx + 1;
        }
        return true;
    }
}
