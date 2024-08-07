package com.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class LibraryManagementApplication 
    extends TestCase
{
    
    public LibraryManagementApplication( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( LibraryManagementApplication.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
