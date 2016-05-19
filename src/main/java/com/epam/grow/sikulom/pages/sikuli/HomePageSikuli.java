package com.epam.grow.sikulom.pages.sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class HomePageSikuli extends SikuliAbstractPage {

    private static final String ABOUT = "src/main/resources/images/about_us.png";

    public HomePageSikuli(Screen screen) {
        super(screen);
    }

    public void clickAbout() {
        try {
            screen.wait(ABOUT);
            screen.click(ABOUT);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }
}
