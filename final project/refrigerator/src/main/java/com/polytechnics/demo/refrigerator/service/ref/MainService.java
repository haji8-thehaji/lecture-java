package com.polytechnics.demo.refrigerator.service.ref;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.Recipe;
import com.polytechnics.demo.refrigerator.repository.RecipeRepository;

@Service
public class MainService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Optional<Recipe> getRandomRecipe() {
        long count = recipeRepository.count(); // 전체 레시피 개수 확인
        if (count == 0) {
            return Optional.empty(); // 레시피가 없는 경우 빈 Optional 반환
        }
        int randomId = new Random().nextInt((int) count) + 1; // 무작위 ID 생성
        return recipeRepository.findById(randomId); // 해당 ID의 레시피 반환
    }

    public List<String> getSteps(String stepsString) {
    return Arrays.stream(stepsString.split("/"))
                 .map(step -> step.replaceAll("^\\d+\\.\\s*", "")) // 앞의 숫자와 마침표 제거
                 .collect(Collectors.toList());
}

//     public User getUserByName(String userName) {
//         return mainRepository.findByUserName(userName);
//     }
}
