package menu.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ParserTest {
    @DisplayName("코치 이름 입력 파싱이 정상적으로 되는지 확인")
    @Test
    void 코치_이름_파싱_테스트() {
        String input = "토미,제임스,포코";
        List<String> result = Parser.coachNameParse(input);

        assertThat(result.get(0)).isEqualTo("토미");
        assertThat(result.get(1)).isEqualTo("제임스");
        assertThat(result.get(2)).isEqualTo("포코");
    }

    @DisplayName("유효하지 않은 코치 이름 입력시 예외가 발생하는지 확인")
    @Test
    void 유효하지_않은_코치_이름_파싱_테스트() {
        String input = "!, ,21";

        assertThatThrownBy(() -> Parser.coachNameParse(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("메뉴 이름 입력 파싱이 정상적으로 되는지 확인")
    @Test
    void 메뉴_이름_파싱_테스트() {
        String input = "우동,스시";
        List<String> result = Parser.menusParse(input);

        assertThat(result.get(0)).isEqualTo("우동");
        assertThat(result.get(1)).isEqualTo("스시");
    }
}
