
import act3ex3.Act3Ex3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitTestMatricula {
    
    public JUnitTestMatricula() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public final void calculMatricula() throws Errores {
        assertEquals(150, Act3Ex3.calculMatricula(5));
    }
    
    public final void calculMatriculaMaxim() throws Errores {
        assertEquals(380, Act3Ex3.calculMatricula(15));
    }
    
    public final void calculMatricula0() throws Errores {
        assertEquals("Tiene que ser mayor que 0", Act3Ex3.calculMatricula(0));
    }
}