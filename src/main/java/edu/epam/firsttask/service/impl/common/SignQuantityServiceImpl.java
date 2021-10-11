package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SignQuantityService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SignQuantityServiceImpl implements SignQuantityService {
    static Logger logger = LogManager.getLogger(SignQuantityServiceImpl.class);

    @Override
    public Integer calculatePositivesQuantity(CustomArray customArray) throws InvalidArrayIndexException {
        int quantity = 0;
        for (int i = 0; i < customArray.size(); i++) {
            if (customArray.getByIndex(i) > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public Integer calculateNegativesQuantity(CustomArray customArray) throws InvalidArrayIndexException {
        int quantity = 0;
        for (int i = 0; i < customArray.size(); i++) {
            if (customArray.getByIndex(i) < 0) {
                quantity++;
            }
        }
        return quantity;
    }
}
