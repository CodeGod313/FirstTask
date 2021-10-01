package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.functional.Comparable;
import edu.epam.firsttask.service.ReplacementService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;


public class ReplacementServiceStream implements ReplacementService {
    static Logger logger = LogManager.getLogger(ReplacementServiceStream.class);
    @Override
    public void replaceTo(CustomArray customArray, Comparable comparable, Double number) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not replace, array is empty");
        Double[] doubles = Arrays.stream(customArray.getDoubleArray())
                .map(x->{
                    if(comparable.compareDouble(x)){
                        return number;
                    }
                    return x;
                }).toArray(Double[]::new);
        customArray.setDoubleArray(doubles);
    }
}
