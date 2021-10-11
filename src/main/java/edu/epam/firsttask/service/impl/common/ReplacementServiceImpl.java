package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.functional.CustomComparable;
import edu.epam.firsttask.service.ReplacementService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ReplacementServiceImpl implements ReplacementService {
    static Logger logger = LogManager.getLogger(ReplacementServiceImpl.class);

    @Override
    public void replaceTo(CustomArray customArray, CustomComparable customComparable, Double number) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not replace, array is empty");
        for (int i = 0; i < customArray.size(); i++) {
            if (customComparable.compareDouble(customArray.getByIndex(i))) {
                customArray.setByIndex(i, number);
            }
        }
    }
}