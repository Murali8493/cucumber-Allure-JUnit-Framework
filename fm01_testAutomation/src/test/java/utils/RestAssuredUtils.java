package utils;

import io.cucumber.java.hu.Ha;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

public class RestAssuredUtils {
    public static RequestSpecBuilder builder = new RequestSpecBuilder();
    public static RequestSpecification request;

    public static void buildRequest(String url) {
        builder.setBaseUri(url);
        RestAssured.useRelaxedHTTPSValidation();
        builder.setContentType(ContentType.JSON);
        builder.setConfig(RestAssured.config.encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(true)));
    }

    public static void buildRequestWithoutBody(String url) {
        builder.setBaseUri(url);
        RestAssured.useRelaxedHTTPSValidation();
        builder.setConfig(RestAssured.config.encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)));
    }


    public static void addHeadersToRequest(HashMap<String, String> headers) {
        request = RestAssured.given().spec(builder.build());
        if (!(headers.isEmpty())) {
            request.headers(headers);
        }
    }

    public static Response submitGetAPI() {
        return request.get();
    }

    public static Response submitGetAPIWithQueryParams(HashMap params) {
        request.queryParams(params);
        return request.get();
    }

    public static Response submitPostAPIWithRequestBody(String requestBody) {
        request.body(requestBody);
        return request.post();
    }

    public static Response submitPostAPIWithFormParams(HashMap params) {
        request.formParams(params);
        return request.post();
    }

    public static Response submitPostAPIWithQueryParams(HashMap params) {
        request.queryParams(params);
        return request.post();
    }

    public static Response submitPutAPIWithRequestBody(String requestBody) {
        request.body(requestBody);
        return request.put();
    }

    public static Response submitDeleteAPI() {
        return request.delete();
    }
}
