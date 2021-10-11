package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;

import java.util.OptionalDouble;

public interface ExtremumService {
    OptionalDouble calculateMin(CustomArray customArray) throws InvalidArrayIndexException;
    OptionalDouble calculateMax(CustomArray customArray) throws InvalidArrayIndexException;
}
