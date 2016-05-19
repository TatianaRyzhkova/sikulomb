package com.epam.grow.sikulom.pages.sikuli;

import org.sikuli.script.Screen;

abstract class SikuliAbstractPage {
    public static final String PATH = "src/main/resources/images/";

    Screen screen;

    SikuliAbstractPage(Screen screen) {
        this.screen = screen;
    }

}
