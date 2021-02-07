package ru.idcore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int threshold;
    private int out;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> resultList;
        out = 0;
        resultList = source.stream()
                .filter(x -> {
                            if (x > threshold) {

                                logger.log("Элемент " + x + " проходит");
                            } else {
                                out++;
                                logger.log("Элемент " + x + " не проходит");
                            }
                            return x > threshold;
                        }
                )
                .collect(Collectors.toList());
        logger.log("Прошло фильтр " + (source.size() - out) + " элемента из " + source.size());
        return resultList;
    }
}
