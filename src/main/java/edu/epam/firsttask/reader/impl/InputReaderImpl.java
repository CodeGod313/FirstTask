package edu.epam.firsttask.reader.impl;

import edu.epam.firsttask.reader.InputReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class InputReaderImpl implements InputReader {
    static Logger logger = LogManager.getLogger(InputReaderImpl.class);

    @Override
    public List<String> readStringsFromFile(Path filePath) {
        try (Stream<String> lines = Files.lines(filePath)) {
            return lines.toList();
        } catch (final IOException ex) {
            logger.error("Error While Reading File" + filePath, ex);
            throw new RuntimeException(ex);
        }
    }
}
