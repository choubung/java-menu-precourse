package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;

    public MainController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        // TODO: 1. 코치 이름 받기
        List<String> coaches = new ArrayList<>();

        // TODO: 2. 각 코치가 못 먹는 메뉴 입력 받기
        for (String coach : coaches) {

        }

        // TODO: 3. 메뉴 추천 결과 출력

        // 2. 값 입력 (return 있는 메서드 재시도)
        // String result = retryUntilValid(inputView::readSomething);
    }

    private void initialize() {
        // ...
    }

    // 1. 반환값이 있는 경우 (Supplier)
    private <T> T retryUntilValid(java.util.function.Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }

    // 2. 반환값이 없는 경우 (Runnable) - ★ 이거 필수 추가
    private void retryUntilValid(Runnable action) {
        while (true) {
            try {
                action.run();
                return;
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }
}