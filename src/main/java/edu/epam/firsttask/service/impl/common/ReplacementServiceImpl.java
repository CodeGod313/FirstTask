package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.functional.CustomComparable;
import edu.epam.firsttask.service.ReplacementService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ReplacementServiceImpl implements ReplacementService {
    static Logger logger = LogManager.getLogger(ReplacementServiceImpl.class);

    @Override
    public void replaceTo(CustomArray customArray, CustomComparable customComparable, Double number) throws InvalidArrayIndexException {
        for (int i = 0; i < customArray.size(); i++) {
            if (customComparable.compareDouble(customArray.getByIndex(i))) {
                customArray.setByIndex(i, number);
            }
        }
    }
}