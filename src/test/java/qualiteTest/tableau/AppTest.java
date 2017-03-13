package qualiteTest.tableau;

<<<<<<< HEAD
     *
     * @param testNamffffe name ofd the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCalculMoy()
	{
		//App tableau = new App();
		int[] tab = {5,8, 20};
		assertEquals(11.0, App.calculMoy(tab));
		
		int[] tab1 = {5,8, 4};
		assertEquals(6.0, App.calculMoy(tab1));
		
		int[] tab2 = {5,8, 3};
		assertEquals(0, App.calculMoy(tab2));
	}
    
    public void testAfficheMin()
	{
		//App tableau = new App();
		int[] tab3 = {5,8,1};
		assertEquals(2.0, App.afficheMin(tab3));
	}
	
	public void testAfficheMax()
	{
		//App tableau = new App();
		int[] tab4 = {5,8,1};
		assertEquals(1.0, App.afficheMax(tab4));
	}
    
	/*public void testCalculMoyenTabNull() throws IllegalArgumentException{
		//App tableau = new App();
		int[] tab = null;
		App.calculMoy(tab);
	}*/

}
=======
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * fedya
 */
public class AppTest 
    extends TestCase
{
    /**

     *
     * @param testNamffffe name ofd the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCalculMoy()
	{
		//App tableau = new App();
		int[] tab = {5,8, 20};
		assertEquals(11.0, App.calculMoy(tab));
		
		int[] tab1 = {5,8, 4};
		assertEquals(6.0, App.calculMoy(tab1));
		
		int[] tab2 = {5,8, 3};
		assertEquals(5.0, App.calculMoy(tab2));
	}
    
    public void testAfficheMin()
	{
		//App tableau = new App();
		int[] tab3 = {5,8,1};
		assertEquals(2.0, App.afficheMin(tab3));
		
		int[] tab5 = {5,8, 20};
		assertEquals(5, App.afficheMin(tab5));
	}
	
	public void testAfficheMax()
	{
		//App tableau = new App();
		int[] tab4 = {5,8,1};
		assertEquals(1.0, App.afficheMax(tab4));
	}
    
	/*public void testCalculMoyenTabNull() throws IllegalArgumentException{
		//App tableau = new App();
		int[] tab = null;
		App.calculMoy(tab);
	}*/

}
>>>>>>> branch 'master' of https://github.com/afefCH/tableau.git
