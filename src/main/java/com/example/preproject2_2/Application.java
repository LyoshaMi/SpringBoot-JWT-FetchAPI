package com.example.preproject2_2;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//
//
//    TransportClient transportClient = new HttpTransportClient();
//    VkApiClient vk = new VkApiClient(transportClient);
//    UserAuthResponse authResponse = vk.oAuth()
//            .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
//            .execute();
//
//    UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
}
