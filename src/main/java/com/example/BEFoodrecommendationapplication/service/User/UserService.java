package com.example.BEFoodrecommendationapplication.service.User;

import com.example.BEFoodrecommendationapplication.dto.UserDto;
import com.example.BEFoodrecommendationapplication.dto.UserInput;
import com.example.BEFoodrecommendationapplication.entity.FoodRecipe;
import com.example.BEFoodrecommendationapplication.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface UserService {
    User save(Integer id, UserInput userInput);

    UserDto getUser(Integer id);

    String uploadAvatar(MultipartFile multipartFile, Integer id) throws IOException;

    User findById(Integer id);

    void saveOrDeleteRecipeForUser(User user, FoodRecipe recipe, boolean save);

    List<Object> getSavedRecipesByUser(Integer userId);
}
