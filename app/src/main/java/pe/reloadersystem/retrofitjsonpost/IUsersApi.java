package pe.reloadersystem.retrofitjsonpost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IUsersApi {

    @POST("users")
    Call<User> createUser(@Body User user);
}
