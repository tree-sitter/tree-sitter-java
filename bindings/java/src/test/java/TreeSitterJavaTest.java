import io.github.treesitter.jtreesitter.Language;
import io.github.treesitter.jtreesitter.java.TreeSitterJava;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TreeSitterJavaTest {
    @Test
    public void testCanLoadLanguage() {
        assertDoesNotThrow(() -> new Language(TreeSitterJava.language()));
    }
}
