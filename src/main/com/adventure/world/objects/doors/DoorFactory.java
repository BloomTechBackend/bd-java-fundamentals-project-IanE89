package main.com.adventure.world.objects.doors;

/**
 * This is a javadoc comment.
 * This is required, for some reason.
 */
public class DoorFactory {

    /**
     * Creates a door based on the given params.
     *
     * @param isOpen - the door's open state
     * @param level  - the door's level
     * @return a door
     */
    public static Door buildDoor(boolean isOpen, int level) {

        Door newDoor = new Door(isOpen, level);
        return newDoor;
    }
}
