package com.example.BEFoodrecommendationapplication.service.User;

import com.example.BEFoodrecommendationapplication.dto.AddUserRequest;
import com.example.BEFoodrecommendationapplication.dto.UserResponse;
import com.example.BEFoodrecommendationapplication.entity.User;
import com.example.BEFoodrecommendationapplication.exception.DuplicateDataException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdminService {
    Page<UserResponse> findAllUsers(Pageable pageable);

    UserResponse findUserById(Integer id);

    void addUserAccount(AddUserRequest userResponse) throws DuplicateDataException;
}
