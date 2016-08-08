package de.ender74.dzcode.ch01;

/**
 * Created by HHüter on 08.08.2016.
 */
public class SymbolCreatorFirstAlph {
    public String getSymbol(String elementName) {
        if (elementName == null)
            return "";
        elementName = elementName.trim().toLowerCase();
        if  (elementName.length() < SymbolValidator.SYMBOL_LENGTH)
            return "";

        StringBuilder sb = new StringBuilder();
        int run = 0;
        for (int i = 0; i < SymbolValidator.SYMBOL_LENGTH; i++) {
            int idx = indexOfLowestChar(elementName, run,
                    elementName.length() - SymbolValidator.SYMBOL_LENGTH + i);
            assert idx >= 0;
            char currentChar = elementName.charAt(idx);
            sb.append(currentChar);
            run = idx + 1;
        }
        assert sb.length() == SymbolValidator.SYMBOL_LENGTH;
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        return sb.toString();
    }

    private int indexOfLowestChar(String string, int startIdx, int endIdx) {
        assert startIdx < endIdx;

        int lowestIdx = -1;
        char lowestChar = Character.MAX_VALUE;

        for (int i = startIdx; i <= endIdx; i++) {
            char currentChar = string.charAt(i);
            if (currentChar < lowestChar) {
                lowestIdx = i;
                lowestChar = currentChar;
            }
        }

        return lowestIdx;
    }
}
