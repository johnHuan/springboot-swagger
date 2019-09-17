package cn.edu.whu.swagger.path;

import com.google.common.base.Predicates;
import org.springframework.util.AntPathMatcher;

import java.util.function.Predicate;

public class PathSelectors {
    private PathSelectors() {
        throw new UnsupportedOperationException();
    }

    public static Predicate<String> any() {
        return (Predicate<String>) Predicates.alwaysTrue();
    }

    public static Predicate<String> none() {
        return (Predicate<String>) Predicates.alwaysFalse();
    }
    public static Predicate<String> regex(final String pathRegex) {
        return new Predicate<String>(){
            @Override
            public boolean test(String s) {
                return false;
            }

            public boolean apply(String input){
                return input.matches(pathRegex);
            }
        };
    }


    public static Predicate<String> ant(final String antPattern) {
        return new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }

            public boolean apply(String input) {
                AntPathMatcher matcher = new AntPathMatcher();
                return matcher.match(antPattern, input);
            }
        };

    }


}
