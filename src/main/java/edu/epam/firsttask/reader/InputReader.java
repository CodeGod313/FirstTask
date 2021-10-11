package edu.epam.firsttask.reader;

import edu.epam.firsttask.exception.WrongFilePathException;

import java.nio.file.Path;
import java.util.List;

public interface InputReader {
    List<String> readStringsFromFile(Path filePath) throws WrongFilePathException;
}
