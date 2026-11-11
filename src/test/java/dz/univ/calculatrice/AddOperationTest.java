package dz.univ.calculatrice;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
class AddOperationTest {
 
    private final AddOperation operation = new AddOperation();
 
    @Test
    void shouldAddTwoPositiveNumbers() {
        assertEquals(7.0, operation.execute(3.0, 4.0));
    }
 
    @Test
    void shouldAddNegativeAndPositiveNumbers() {
        assertEquals(1.0, operation.execute(-2.0, 3.0));
    }
 
    @Test
    void shouldAddDecimalNumbers() {
        assertEquals(3.75, operation.execute(1.25, 2.5));
    }
}
