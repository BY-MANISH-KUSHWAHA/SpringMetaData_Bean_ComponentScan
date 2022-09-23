package com.springmetadata.springmetadata.componentScan;

import com.springmetadata.springmetadata.configuartion.SpringContentFiltering;
import com.springmetadata.springmetadata.configuartion.SpringMovieFilters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckComponentScan implements SpringMovieFilters {
    public List<String> getRecommandations() {
        List<String> arr = new ArrayList<>();
        for (String movie:
                SpringContentFiltering.getSpecialRecommandations(" ")) {
            arr.add(movie);
        }
        arr = arr.stream().filter(s -> s.length()<7).collect(Collectors.toList());
        return arr;
    }
}
