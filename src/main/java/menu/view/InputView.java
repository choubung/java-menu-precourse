package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.utils.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<String> readCoaches() {
        System.out.println("점심 메뉴 추천을 시작합니다.\n" +
                "\n" +
                "코치의 이름을 입력해 주세요. (, 로 구분)");
        String input = Console.readLine();
        Validator.validateHasText(input);

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public List<String> readMenus(String name) {
        System.out.println("" + name + "(이)가 못 먹는 메뉴를 입력해 주세요.");
        String input = Console.readLine();

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}