package edu.epam.firsttask.reader;

import java.nio.file.Path;
import java.util.List;

public interface InputReader {
    List<String> readStringsFromFile(Path filePath);
}
