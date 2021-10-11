package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SumService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SumServiceImpl implements SumService {
    static Logger logger = LogManager.getLogger(SumServiceImpl.class);

    @Override
    public Double calculateSum(CustomArray customArray) throws InvalidArrayIndexException {
        Double sum = 0.;
        for (int i = 0; i < customArray.size(); i++) {
            sum += customArray.getByIndex(i);
        }
        return sum;
    }
}
