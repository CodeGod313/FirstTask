package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.ReplacementService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ReplacementServiceImplTest {

    ReplacementService replacementService;

    @BeforeAll
    public void setUp() {
        replacementService = new ReplacementServiceImpl();
    }

    @Test
    public void testReplaceTo() throws InvalidArrayIndexException {
        CustomArray expected = new CustomArray(List.of(5., 6., 7., 8., 10., 10.));
        CustomArray actual = new CustomArray(List.of(5., 6., 7., 8., 9., 9.));
        replacementService.replaceTo(actual, x -> x == 9, 10.);
        Assertions.assertEquals(expected, actual);
    }
}