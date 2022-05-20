package Isikukood;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naiserahvas_kui_isikukoodis_on_neli(){
        isikukoodEE ee = new isikukoodEE("41504991234");
        assertFalse(ee.isMale());
    }

    public void kontrolli_kas_on_synniaasta_on_1951_kui_isikukoodis_on_51(){
        isikukoodEE ee = new isikukoodEE("41504991234");

    }
}
