package failure;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestThisWillFailAbunch {
    @Test
    public void aFailingTest() {
         assertTrue("I expected this to pass!", true);
    }

    @Ignore
    @Test
    public void aFailingTest2() {
         assertTrue("I expected this to pass!", false);
    }

    @Ignore
    @Test
    public void aFailingTest3() {
            System.out.println("stdout msg");
        
        System.err.println("stderrt msg");
    
         assertTrue("I expected this to pass!", false);
    }

    //@Ignore
    @Test
    public void aFailingTest4() {
         System.out.println("stdout msg");
        
        System.err.println("stderrt msg");
         assertTrue("I expected this to pass!", true);
    }

    @Ignore
    @Test
    public void aNewFailingTest31() {
        System.out.println("stdout msg");
        
        System.err.println("stderrt msg");
         assertTrue("I expected this to pass!", false);
    }

    @Test
    public void aNotherNewFailingTest4() {
         assertTrue("I expected this to pass!", false);
    }

    @Test
    public void aFailingTest5() {
         assertTrue("I expected this to pass!", false);
    }

    @Test
    public void aFailingTest6() {
        System.out.println("stdout msg");
        
        System.err.println("stderrt msg");

         assertTrue("I expected this to pass!", false);
    }

    @Test
    public void aPassingTest3() {
         assertTrue("Success!", true);
    }

    @Test
    public void aPassingTest4() {
         assertTrue("Success!", true);
    }
}
