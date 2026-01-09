package menu.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidatorTest {
    @DisplayName("빈 문자열 입력 예외 처리")
    @Test
    void 빈_문자열_입력시_예외가_발생한다() {
        assertThatThrownBy(() -> {
            Validator.validateHasText(" ");
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("코치 입력 명수 예외 처리")
    @ParameterizedTest(name = "입력값 \"{0}\" 일 때 예외 발생")
    @ValueSource(ints = {0, 1, 6})
    void 코치의_수가_범위_밖일_경우_예외가_발생한다(int input) {
        assertThatThrownBy(() -> {
            Validator.validateCoachSize(input);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("코치 명수 정상 입력 시 예외가 발생하지 않는다")
    @ParameterizedTest(name = "입력값 \"{0}\" 통과")
    @ValueSource(ints = {2, 3, 4, 5})
    void 코치_수_정상_입력_테스트(int input) {
        assertThatCode(() -> {
            Validator.validateCoachSize(input);
        })
                .doesNotThrowAnyException();
    }

    @DisplayName("코치 이름 길이 예외 처리")
    @ParameterizedTest(name = "입력값 \"{0}\" 일 때 예외 발생")
    @ValueSource(ints = {0, 1, 5})
    void 코치_이름_길이가_범위_밖일_경우_예외가_발생한다(int input) {
        assertThatThrownBy(() -> {
            Validator.validateNameLen(input);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("코치 이름 길이 정상 입력 시 예외가 발생하지 않는다")
    @ParameterizedTest(name = "입력값 \"{0}\" 통과")
    @ValueSource(ints = {2, 3, 4})
    void 코치_이름_길이_정상_입력_테스트(int input) {
        assertThatCode(() -> {
            Validator.validateNameLen(input);
        })
                .doesNotThrowAnyException();
    }

    @DisplayName("메뉴 개수 예외 처리")
    @ParameterizedTest(name = "입력값 \"{0}\" 일 때 예외 발생")
    @ValueSource(ints = {3, 4, 5})
    void 메뉴_개수가_범위_밖일_경우_예외가_발생한다(int input) {
        assertThatThrownBy(() -> {
            Validator.validateMenuSize(input);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("메뉴 개수 정상 입력 시 예외가 발생하지 않는다")
    @ParameterizedTest(name = "입력값 \"{0}\" 통과")
    @ValueSource(ints = {0, 1, 2})
    void 메뉴_개수_정상_입력_테스트(int input) {
        assertThatCode(() -> {
            Validator.validateMenuSize(input);
        })
                .doesNotThrowAnyException();
    }
}
