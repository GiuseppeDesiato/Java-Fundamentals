package labs_examples.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {

    public static void main(String[] args) {

        List<String> citiesList = new ArrayList<>();

        citiesList.add("Waltham");
        citiesList.add("Boston");
        citiesList.add("Cambridge");
        citiesList.add("Winchester");
        citiesList.add("Wellesley");

        //the forEach method is defined in the iterable interface
        citiesList.forEach(city -> System.out.println(city));

    }
}
