package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.ReplacementService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ReplacementServiceImplTest extends TestCase {

    ReplacementService replacementService;

    @Before
    public void setUp(){
        replacementService = new ReplacementServiceImpl();
    }

    @Test
    public void testReplaceTo() throws EmptyArrayException {
        CustomArray expected = new CustomArray(List.of(5.,6.,7.,8.,10.,10.));
        CustomArray actual = new CustomArray(List.of(5.,6.,7.,8.,9.,9.));
        replacementService.replaceTo(actual, x->x == 9, 10.);
        Assert.assertEquals(expected,actual);
    }
}