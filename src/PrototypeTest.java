import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {
    @Ignore
    @Test
    void testPrototypeCloning() {
        ComplicatedObject prototype = new ComplicatedObject();

        ComplicatedObject clonedPrototype = new ComplicatedObject();

        assertNotSame(prototype, clonedPrototype);
    }

}
