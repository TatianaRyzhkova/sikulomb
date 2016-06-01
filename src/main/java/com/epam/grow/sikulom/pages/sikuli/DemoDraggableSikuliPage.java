package com.epam.grow.sikulom.pages.sikuli;

import lombok.extern.log4j.Log4j;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


@Log4j
public class DemoDraggableSikuliPage extends SikuliAbstractPage {

    private static final String DROPPABLE = IMAGES_PATH + "droppable.png";
    private static final String DRAG = IMAGES_PATH + "drag.png";
    private static final String DROP = IMAGES_PATH + "drop.png";

    public DemoDraggableSikuliPage(Screen screen) {
        super(screen);
    }

    public void clickDroppable() {
        try {
            screen.click(DROPPABLE);
        } catch (FindFailed findFailed) {
            log.error(findFailed.getMessage());
            findFailed.printStackTrace();
        }
    }

    public void dragToDropZone() {
        try {
            screen.dragDrop(DRAG, DROP);
        } catch (FindFailed findFailed) {
            log.error(findFailed.getMessage());
            findFailed.printStackTrace();
        }
    }
}
