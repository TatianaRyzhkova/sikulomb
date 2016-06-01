package com.epam.grow.sikulom.steps.sikuli;

import com.epam.grow.sikulom.pages.sikuli.HomePageSikuli;
import org.sikuli.script.Screen;

public class HomePageSikuliSteps {
    private HomePageSikuli homePageSikuli;

    public HomePageSikuliSteps() {
        this.homePageSikuli = new HomePageSikuli(new Screen());
    }

    public void openAbout() {
        homePageSikuli.clickAbout();
    }
}
