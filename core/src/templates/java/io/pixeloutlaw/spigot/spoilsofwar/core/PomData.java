/**
 * This file is part of ${project.name}, licensed under the MIT License.
 *
 * Copyright (C) ${project.inceptionYear} Pixel Outlaw <topplethenun@pixeloutlaw.io>
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
