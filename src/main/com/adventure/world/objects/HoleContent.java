package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

/**
 * This is a javadoc comment.
 * This is required, for some reason.
 */
public class HoleContent {

    private Key content;
    private boolean isCovered = true;

    /**
     * This is a javadoc comment.
     * This is required, for some reason.
     *
     * @param key - returns key.
     */
    public HoleContent(Key key) {

    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public Key getKey() {
        return content;
    }

    public Key getContent() {
        return content;
    }

    public void setContent(Key content) {
        this.content = content;
    }

    public void setCovered(boolean covered) {
        isCovered = covered;
    }

}
