package mco364;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {

    public static List<String> findMatches(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> foundMatches = new ArrayList<>();

        while (matcher.find()) {
            foundMatches.add(matcher.group());
        }
        return foundMatches;
    }
}
