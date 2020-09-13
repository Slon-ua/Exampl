package com.socks.api.tests;

import com.socks.api.conditions.Conditions;
import com.socks.api.services.CartApiService;
import io.qameta.allure.Issue;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.text.IsEmptyString.isEmptyString;

@Slf4j
public class CartApiAPITest extends BaseAPITest {

    private final CartApiService cartApiService = new CartApiService();
/*
    @Test
    @Tag("DEV")
    @Jira("Jira-3437")
    @Issue("Jira-3437")
    void testCanGetUserCart() {
  //      System.out.println("________________________________________________");

        String pojo = cartApiService.getUserOrdersInCart()
                .shouldHave(Conditions.statusCode(200))
                .shouldHave(Conditions.bodyField("[0].unitPrice", not(isEmptyString())))
                .shouldHave(Conditions.bodyField("[0].quantity",equalTo((1))))
                .getValueLikeString("[0]");

        log.info("All JSON ===1===> "+pojo);

//                .then()
//                .assertThat()
//                .statusCode(200);
    }
    */
}
