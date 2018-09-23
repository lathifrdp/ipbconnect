package com.example.lathifrdp.demoapp.api;

import com.example.lathifrdp.demoapp.model.StudyProgram;
import com.example.lathifrdp.demoapp.response.CountResponse;
import com.example.lathifrdp.demoapp.response.LoginResponse;
import com.example.lathifrdp.demoapp.response.RegisterResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {


    @FormUrlEncoded
    @POST("users/login")
    Call<LoginResponse> loginRequest(
            @Field("email") String email,
            @Field("password") String password
            //@Body LoginResponse loginResponse
            );

    @GET("studyprograms/getlist")
    Call<List<StudyProgram>> getProdi();

    @FormUrlEncoded
    @POST("users")
    Call<RegisterResponse> registerRequest(
            @Field("fullName") String fullName,
            @Field("gender") String gender,
            @Field("dateOfBirth") String dateOfBirth,
            @Field("email") String email,
            @Field("password") String password,
            @Field("nim") String nim,
            @Field("userType") String userType,
            @Field("batch") String batch,
            @Field("studyProgramId") String studyProgramId
    );

    @GET("users/count/")
    Call<CountResponse> getCount(@Header("Authorization") String token);
}
