package com.springmetadata.springmetadata.configuartion;



import java.util.List;

public class SpringMovieRecommendation {

    private SpringMovieFilters filter;

// ---------------------- Property Dependency Injection ----------------------
    // Using appContext_Property
    public SpringMovieRecommendation(){}


    // Using appContext_Property
    public void setFilter(SpringMovieFilters filter) {
        this.filter = filter;
    }
//---------------------- Constructor Dependency Injection ----------------------

    // Using appContext_Constructor
    public SpringMovieRecommendation(SpringMovieFilters filter) {
        this.filter = filter;
    }


    public List<String> recommandMovie(String movie){
        // suppose based on rating all movies are sorted.
        return filter.getRecommandations();

    }


}
