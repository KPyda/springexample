package com.javacodegeeks.snippets.enterprise.app;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Praktykant on 09.09.14.
 */
//@ContextConfiguration(locations = {"classpath:/META-INF/spring/pharmacy-core-context-test.xml"})
@TransactionConfiguration(defaultRollback = true)
public class InventoryItemRepositoryHibernateTestIT extends AbstractTransactionalTestNGSpringContextTests {

    @BeforeClass
    public void beforeClass() throws Exception {
        this.springTestContextPrepareTestInstance();
    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @Test
    @Rollback(true)
    public void findLotsForInitialInventoryListCompile() {
//        itemRepository.findLotsForInitialInventoryList(1, 1);
    }



}
