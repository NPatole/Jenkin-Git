package Core;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;


public class Utils {

    public static void fileAttach(String filepath) {
        StringSelection stringSelection = new StringSelection(filepath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, (ClipboardOwner)null);
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }

            robot.delay(250);
            robot.keyPress(10);
            robot.keyRelease(10);
            robot.keyPress(17);
            robot.keyPress(86);
            robot.keyRelease(86);
            robot.keyRelease(17);
            robot.keyPress(10);
            robot.delay(150);
            robot.keyRelease(10);
    }
}