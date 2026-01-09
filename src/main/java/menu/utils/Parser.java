package menu.utils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Parser {
    private static final Pattern NAME_PATTERN = Pattern.compile("[가-힣]*");

    public static List<String> coachNameParse(String input) {
        List<String> coaches = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        Validator.validateCoachSize(coaches.size());
        for (String coach : coaches) {
            Validator.validateNameLen(coach.length());
            Matcher matcher = NAME_PATTERN.matcher(coach);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("입력 형식이 올바르지 않습니다.");
            }
        }

        return coaches;
    }

    public static List<String> menusParse(String input) {
        List<String> menus = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        Validator.validateMenuSize(menus.size());

        return menus;
    }
}