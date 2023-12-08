import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class FactoryTest{
    enum Direction {
        back, legs, head
    }

    @ParameterizedTest
    @EnumSource(Direction.class)
    void testWithEnumSource(Direction d) {
        Factory factory = new Factory();
        Massage massage = factory.getCurrentMassage(String.valueOf(d));
        assertEquals("Make massage of legs", massage.getMassage());
        assertNotNull(d);
    }

    enum Data {back, legs, head, NULL};
    private final Factory factory = new Factory();

    @ParameterizedTest
    @EnumSource(Data.class)
    void testSource(Data d) {
        if (d == Data.NULL) {
            assertThrows(NullPointerException.class, () -> {
                factory.getCurrentMassage(null);
            });
        } else {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
                factory.getCurrentMassage(d.name());
            });

            assertEquals("Invalid input", exception.getMessage());
        }
    }
    @Test
    void testData(){
        Factory factory = new Factory();
        Massage massage = factory.getCurrentMassage("back");
        assertEquals("Make massage of back", massage.getMassage());
    }
}
