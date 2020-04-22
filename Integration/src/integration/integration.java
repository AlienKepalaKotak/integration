
package integration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class integration {
    void sequentialSearch() {
        SequentialSearch ss = new SequentialSearch();
        assertEquals(-1,-1,ss.SequentialSearch(1));
        assertEquals(2,2,ss.SequentialSearch(-20));
    }
}
