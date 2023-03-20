package DuplicateValues;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValues {
    public static void main(String[] args) {
    }
    public static Set<Character> findDuplicateChars(String str) {
        Set<Character> characterSet = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (int current = 0; current < str.length(); current++) {
            char character = str.charAt(current);
            if (characterSet.contains(character)) {
                duplicateChars.add(character);
            } else {
                characterSet.add(character);
            }
        }
        return duplicateChars;
    }
}