package com.epam.grow.sikulom.steps.sikuli;

import com.epam.grow.sikulom.pages.sikuli.DemoDraggableSikuliPage;
import org.sikuli.script.Screen;

public class DemoDraggableSikuliSteps {
    private DemoDraggableSikuliPage draggableSikuliPage;

    public DemoDraggableSikuliSteps() {
        this.draggableSikuliPage = new DemoDraggableSikuliPage(new Screen());
    }


    public void openDroppable() {
        draggableSikuliPage.clickDroppable();
    }

    public void dragToDropZone() {
        draggableSikuliPage.dragToDropZone();
    }
}
