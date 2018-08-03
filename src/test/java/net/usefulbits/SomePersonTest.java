package net.usefulbits;

import static org.junit.Assert.*;
import org.junit.Test;

public class SomePersonTest {

    @Test
    public void SecondFailingTest(){
        assertTrue(false);
    }

    

    @Test
    public void Test4() {
        System.out.println("##teamcity[blockOpened name='<CreateConnection>']");
        System.out.println("Some output");
        System.out.println("##teamcity[blockClosed name='<CreateConnection>']");
        System.out.println("##teamcity[blockClosed name='<RiskReasonsTests.DeleteRiskReason>']");
        System.out.println("##teamcity[blockOpened name='<UserRolesTests.BulkImportUsersFromFile>']");
        System.out.println("##teamcity[blockOpened name='<ImportUsersFromFile>']");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException ie){
            System.out.println("Something went wrong");
        }
        System.out.println("##teamcity[blockClosed name='some_block']");


        System.out.println("word");
        System.err.println("word");

        System.out.println("http://user:word@jetbrains.com");
        System.err.println("http://user:word@jetbrains.com");

        System.out.println("##teamcity[blockOpened name='some_block_2']");


        assertEquals(2, 3);

        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
        System.out.println("##teamcity[blockClosed name='some_block_3']");
    }
    // @Test
    // @Ignore("ignore test with short name")
    // public void shortTestName(){
    //     System.out.println("##teamcity[blockOpened name='some_block']");
        
    //     assertFalse (true);
    // }

    // @Test
    // @Ignore("ignore test with simple name")
    // public void shouldBeIgnored(){
    //     assertTrue(false);
    // }
}
