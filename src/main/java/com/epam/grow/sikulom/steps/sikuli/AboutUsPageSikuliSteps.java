package com.epam.grow.sikulom.steps.sikuli;

import com.epam.grow.sikulom.pages.sikuli.AboutUsPageSikuli;
import org.sikuli.script.Screen;

public class AboutUsPageSikuliSteps {
    private AboutUsPageSikuli aboutUsPageSikuli;

    public AboutUsPageSikuliSteps() {
        this.aboutUsPageSikuli = new AboutUsPageSikuli(new Screen());
    }

    public boolean isAboutUsTitlePresent() {
        return aboutUsPageSikuli.isTitlePresent();
    }
}
