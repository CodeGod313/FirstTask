package edu.epam.firsttask.service.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.factory.impl.CustomArrayFactoryImpl;
import edu.epam.firsttask.functional.Comparable;
import edu.epam.firsttask.service.ReplacementService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ReplacementServiceImpl implements ReplacementService {
    static Logger logger = LogManager.getLogger(ReplacementServiceImpl.class);
    @Override
    public void replaceTo(CustomArray customArray, Comparable comparable, Double number) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not replace, array is empty");
        for(int i = 0; i<customArray.size(); i++){
            if(comparable.compareDouble(customArray.getByIndex(i))){
                customArray.setByIndex(i, number);
            }
        }
    }
}