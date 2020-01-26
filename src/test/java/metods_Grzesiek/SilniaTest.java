package metods_Grzesiek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilniaTest {

    @Before
    public void setup(){
        System.out.println("Bifor");
    }

    @After
    public void clean(){
        System.out.println("after");
    }

    @Test
    public void silnia() {
        long silniaValue = Silnia.silnia(6);
        assertEquals(720, silniaValue);
    }

    @Test
    public void silnia3() {
        long silniaValue = Silnia.silnia(3);
        assertEquals(6, silniaValue);
    }
}