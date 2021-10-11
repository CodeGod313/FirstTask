package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.service.ReplacementService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.function.DoublePredicate;


public class ReplacementServiceStream implements ReplacementService {
    static Logger logger = LogManager.getLogger(ReplacementServiceStream.class);

    @Override
    public void replaceTo(CustomArray customArray, DoublePredicate doublePredicate, Double number) {

        Double[] doubles = Arrays.stream(customArray.getDoubleArray())
                .map(x -> {
                    if (doublePredicate.test(x)) {
                        return number;
                    }
                    return x;
                })
                .toArray(Double[]::new);
        customArray.setDoubleArray(doubles);
    }
}
