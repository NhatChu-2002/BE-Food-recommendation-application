package com.example.BEFoodrecommendationapplication.service.User;

import com.example.BEFoodrecommendationapplication.dto.AuthenticationRequest;
import com.example.BEFoodrecommendationapplication.dto.AuthenticationResponse;
import com.example.BEFoodrecommendationapplication.dto.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);

    String forgotPassword(String email);

    AuthenticationResponse setPassword(String email, String newPassword);

    String verifyAccount(String email, String otp);

    String regenerateOtp(String email);

    AuthenticationResponse setPassword(Integer userId, String oldPassword, String newPassword, String confirmPassword);
}
