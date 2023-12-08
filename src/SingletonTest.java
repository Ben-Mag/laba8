import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertNotSame(instance1, instance2);
    }

    @Test
    public void getAllUsers_NO_NULL() {
        Singleton singleton = Singleton.getInstance();
        assertNotNull(singleton);
    }
    @BeforeClass
    public void setup(){
        Singleton singleton1 = Singleton.getInstance();
    }
}


