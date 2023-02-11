package com.example.scapping.data

import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.scapping.data.network.NetworkConnectionInterceptor
import com.example.scapping.data.responses.AuthResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.POST

interface MyApi {
    @POST("Login")
    suspend fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ) : Response<AuthResponse>

    @POST("signUp")
    suspend fun userSignUp(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ) : Response<AuthResponse>

    @POST("logout")
    suspend fun userLogout(
        @Field("email") email: String
    ) : Response<AuthResponse>

    @POST("quotes")
    suspend fun getQuotes() : Response<AuthResponse>

    companion object {
        operator fun invoke(networkConnectionInterceptor: NetworkConnectionInterceptor
        ) {
//todo
        }
    }

}