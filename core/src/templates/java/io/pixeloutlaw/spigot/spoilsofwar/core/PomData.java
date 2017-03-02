package io.pixeloutlaw.spigot.spoilsofwar.core;

/**
 * Class that contains data from the POM.
 * @author Richard Harrah
 */
public final class PomData {

    public static final String NAME = "@NAME@";
    public static final String ARTIFACT = "@ARTIFACT@";
    public static final String VERSION = "@VERSION@";

    private static final PomData INSTANCE = new PomData();

    private PomData() {
        // do nothing, make it a singleton
        // but really, who would want to instantiate this
    }

    /**
     * Fetches and returns the instance of this class.
     *
     * This is really only useful for templating via Mustache/Handlebars/etc.
     *
     * @return instance of this class
     */
    public static PomData getInstance() {
        return INSTANCE;
    }

}
