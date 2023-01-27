package com.javatpoint.springboothelloworldexample.API;

import com.javatpoint.springboothelloworldexample.Model.RequestBodyFrom;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.net.http.HttpRequest;

public class GetTrends {

        public static String token = "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";


    public static Response Trends() {

        RestAssured.baseURI = "https://trends.google.com/trends/hottrends/visualize/internal/data";
        Response response = given()
                .header("Content-Type", "application/json")
                .get();
        return response;
    }

        public static Response getBlog(String about) {

            RestAssured.baseURI = "https://api.openai.com/v1/completions";
            Response response = given()
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + token)
                    .body(new RequestBodyFrom("text-davinci-002", "Write a blog about " + about, 1, 4090))
                    .post();
        return response;
    }



}
