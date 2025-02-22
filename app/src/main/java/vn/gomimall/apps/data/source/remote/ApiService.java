package vn.gomimall.apps.data.source.remote;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import vn.gomimall.apps.data.model.api.ForgetPwdRequest;
import vn.gomimall.apps.data.model.api.ResetPwdRequest;
import vn.gomimall.apps.data.model.api.ResponseData;
import vn.gomimall.apps.data.model.api.SignInRequest;
import vn.gomimall.apps.data.model.api.SignUpRequest;
import vn.gomimall.apps.data.model.api.VerifyPhoneNumberRequest;
import vn.gomimall.apps.data.model.pojo.Account;
import vn.gomimall.apps.data.model.pojo.Location;

public interface ApiService {
    @Headers({"Accept:application/json", "Content-Type:application/json;charset=utf-8"})
    @POST("account/signup")
    Call<ResponseData<Account>> signUp(@Body SignUpRequest signUpRequest);

    @Headers({"Accept:application/json", "Content-Type:application/json;charset=utf-8"})
    @POST("account/login")
    Call<ResponseData<Account>> signIn(@Body SignInRequest request);

    @Headers({"Accept:application/json", "Content-Type:application/json;charset=utf-8"})
    @GET("location/getcountry")
    Call<ResponseData<List<Location>>> getLocationCountry();

    @Headers({"Accept:application/json", "Content-Type:application/json;charset=utf-8"})
    @POST("account/verify")
    Call<ResponseData<Account>> verifyPhoneNumber(@Body VerifyPhoneNumberRequest request);

    @Headers({"Accept:application/json", "Content-Type:application/json;charset=utf-8"})
    @POST("account/forgotpassword")
    Call<ResponseData<Account>> forgetPwd(@Body ForgetPwdRequest request);

    @Headers({"Accept:application/json", "Content-Type:application/json;charset=utf-8"})
    @POST("account/resetpassword")
    Call<ResponseData<Account>> resetPwd(@Body ResetPwdRequest request);
}
