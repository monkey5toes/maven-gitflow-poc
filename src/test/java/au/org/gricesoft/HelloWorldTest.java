package au.org.gricesoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void getHELLO() {
        //spastic
        Assertions.assertEquals("Hello World!", HelloWorld.getHELLO());
    }
}