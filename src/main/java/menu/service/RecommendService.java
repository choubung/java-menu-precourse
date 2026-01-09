package menu.service;

import menu.domain.Coach;
import menu.domain.MealPlanRepository;
import menu.utils.Picker;

import java.util.ArrayList;
import java.util.List;

public class RecommendService {
    private final MealPlanRepository repository;
    private final Picker picker;
    private List<Coach> coaches = new ArrayList<>();

    public RecommendService(MealPlanRepository repository, Picker picker) {
        this.repository = repository;
        this.picker = picker;
    }

    // TODO:코치 이름과 메뉴 받기
    public void enterCoachName(String name, List<String> menus){

    }

    // TODO:

    // TODO: 카테고리 정하기

    // TODO: 카테고리에 따라 코치들 메뉴 픽하기
}
