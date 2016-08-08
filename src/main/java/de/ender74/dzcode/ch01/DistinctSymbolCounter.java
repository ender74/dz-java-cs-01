package de.ender74.dzcode.ch01;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by HHüter on 08.08.2016.
 */
public class DistinctSymbolCounter {
    public int countDistinctSymbols(String elementName) {
        assert SymbolValidator.SYMBOL_LENGTH == 2;

        if (elementName == null)
            return 0;
        elementName = elementName.trim().toLowerCase();
        if (elementName.length() < SymbolValidator.SYMBOL_LENGTH)
            return 0;

        Set<String> symbols = new HashSet<>();

        for (int i = 0; i < elementName.length() - 1; i++) {
            final char c1 = elementName.charAt(i);
            for (int j = i + 1; j < elementName.length(); j++) {
                final char c2 = elementName.charAt(j);
                symbols.add(String.valueOf(new char[] {Character.toUpperCase(c1), c2}));
            }
        }

        return symbols.size();
    }

}
