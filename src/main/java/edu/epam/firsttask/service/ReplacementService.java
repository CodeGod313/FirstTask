package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;

import java.util.function.DoublePredicate;

public interface ReplacementService {
    void replaceTo(CustomArray customArray, DoublePredicate doublePredicate, Double number) throws InvalidArrayIndexException;
}
