import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
    }

    private static class Solution {
        public static Object[] stringToArray(String s) {
            return s.split("\\W+");
        }
    }
}

// \\W+ будет соответствовать всем неалфавитным символам, встречающимся один или несколько раз. Поэтому нет необходимости заменять