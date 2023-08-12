package seminar_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccessManagerTest {

    @Test
    void getAutorizationToken() {
        AccessManager accessManager = new AccessManager(new User(), new Token("0"));
        Assertions.assertEquals("1234567890", accessManager.getAutorizationToken(new User()).getLine());

    }

    @Test
    void checkToken() {
        AccessManager accessManager = new AccessManager(new User(), new Token("0"));
        boolean checkToken = accessManager.checkToken(accessManager.getAutorizationToken(new User()));
        Assertions.assertTrue(checkToken);

    }

}