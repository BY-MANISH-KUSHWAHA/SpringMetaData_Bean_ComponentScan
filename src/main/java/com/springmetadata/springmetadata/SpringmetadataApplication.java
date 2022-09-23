package com.springmetadata.springmetadata;

import com.springmetadata.springmetadata.configuartion.SpringMovieRecommendation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class SpringmetadataApplication {

	public static void main(String[] args) {

		// Changing from Application Context to Configuration
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		System.out.println("\nBean Definition Names");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		SpringMovieRecommendation recommender = appContext.getBean("movieRecommendation", SpringMovieRecommendation.class);

		List<String> movies = recommender.recommandMovie("");

		System.out.println(movies);
	}

}
