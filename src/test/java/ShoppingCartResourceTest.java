import be.kuleuven.ses.di.ShoppingCartResource;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

public class ShoppingCartResourceTest {

    @Test
    public void getCart_fetchesFromDb() {
        var cart = new ShoppingCartResource();
        var result = cart.getCart();

        // TODO this is not enough; we have to check whether DBHandle was actually called!
        assertThat(result, is(notNullValue()));
    }
}
