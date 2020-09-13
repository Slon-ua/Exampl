package com.socks.ui.tests;

import com.socks.api.services.UserApiService;
import com.socks.ui.MainPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Issue;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
@Epic("Top Navigation")
public class TestTopNavigation extends BaseUITest {

    private UserApiService userApiService = new UserApiService();

    @Step
    @Story("Demo")
    @Test
    @Jira(" Jira-3437")
    @Issue("Jira-3438  ")
    void canSelectAllItemsInTopNav() {
        MainPage
            .open()
        ;
      //  Selenide.executeJavaScript();


    }
}
