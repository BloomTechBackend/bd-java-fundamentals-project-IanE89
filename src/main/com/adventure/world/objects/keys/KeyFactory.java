package main.com.adventure.world.objects.keys;

/**
 * This is a javadoc comment.
 * This is required, for some reason.
 */
public class KeyFactory {

    int level;
    String name;

    /**
     * Creates a key based on the given params.
     *
     * @param level - the key's level
     * @param name  - the key's name
     * @return a key
     */
    public static Key buildKey(int level, String name) {

        Key newKey = new Key(level, name);
        return newKey;
    }
}
