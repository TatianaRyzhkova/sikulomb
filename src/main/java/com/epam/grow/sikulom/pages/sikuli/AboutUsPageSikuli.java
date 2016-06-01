package com.epam.grow.sikulom.pages.sikuli;

import org.sikuli.script.Screen;

public class AboutUsPageSikuli extends SikuliAbstractPage {
    private static final String ABOUT_TITLE = PATH + "about_us_title.png";

    public AboutUsPageSikuli(Screen screen) {
        super(screen);
    }

    public boolean isTitlePresent(){
        double score = screen.exists(ABOUT_TITLE).getScore();
        return score >= 0.7;
    }
}
