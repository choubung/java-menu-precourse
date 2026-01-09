package menu.utils;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]*$");

    // 빈 문자열 체크
    public static void validateHasText(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }
    }

    public static void validateCoachSize(int number) {
        if (number < 2 || number > 5) {
            throw new IllegalArgumentException("코치는 최소 2명 이상, 5명 이하 입력해야 합니다.");
        }
    }

    public static void validateNameLen(int number) {
        if (number < 2 || number > 4) {
            throw new IllegalArgumentException("이름의 길이는 최소 2글자 최대 4글자여야 합니다.");
        }
    }

    public static void validateMenuSize(int number) {
        if (number > 2) {
            throw new IllegalArgumentException("못 먹는 메뉴는 최대 2개까지 입력 가능합니다.");
        }
    }
}