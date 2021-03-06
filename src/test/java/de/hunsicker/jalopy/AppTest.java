package de.hunsicker.jalopy;

import de.hunsicker.jalopy.storage.Loggers;

import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
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

    public void testNoClassDefFoundErrorDeclarationType() throws Exception
    {
        URL url = getClass().getResource("jalopy.xml");

        assertNotNull(url);

        Jalopy.setConvention(url);
    }

    public void testLogFormatting() throws Exception
    {
        Object[] args = {
            "FileName", new Integer(23), new Integer(38),
            "JavadocLexer: panic"
        };

        String string = Loggers.fmt("PARSER_ERROR", args);

        assertEquals("FileName:23:38: JavadocLexer: panic", string);
    }

}
