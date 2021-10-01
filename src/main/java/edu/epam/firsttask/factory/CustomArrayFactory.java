package edu.epam.firsttask.factory;

import edu.epam.firsttask.entity.CustomArray;

import java.util.List;

public interface CustomArrayFactory {
    CustomArray getCustomArrayFromStrings(List<String> strings);
}
