package Entities;

import java.util.HashMap;
import java.util.Map;
import Core.Utils;

/**
 * Created by kramirez on 4/6/16.
 */
public final class IterationIndex {
    private static String iterationIndex;

    private IterationIndex() {
    }

    public static String get() {
        iterationIndex = System.getenv("iterationIndex");
        String lowerBrowser = (iterationIndex == null ? Utils.getProperty("api.iterationIndex") : iterationIndex).toLowerCase();
        return lowerBrowser;
    }

    public static String get(String iterationIndex) {
        return iterationIndex;
    }

    public static void set(String iterationIndex) {
        IterationIndex.iterationIndex = iterationIndex;
    }
}
