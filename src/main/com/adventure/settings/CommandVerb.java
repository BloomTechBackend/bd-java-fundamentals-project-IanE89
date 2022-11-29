package main.com.adventure.settings;

/**
 * Sprint 2 Module 3
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE, MOVE, USE, DIG, EXAMINE, LOOK, INVALID, HELP, FIGHT, INVENTORY;

    /**
     * Takes verbString to determine and return the associated CommandVerb.
     *
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */

    public static CommandVerb getVerb(String verbString) {
        CommandVerb cv = CommandVerb.TAKE;

        if (!verbString.equalsIgnoreCase("TAKE") &&
                !verbString.equalsIgnoreCase("MOVE") &&
                !verbString.equalsIgnoreCase("USE") &&
                !verbString.equalsIgnoreCase("DIG") &&
                !verbString.equalsIgnoreCase("EXAMINE") &&
                !verbString.equalsIgnoreCase("LOOK") &&
                !verbString.equalsIgnoreCase("INVALID")) {
            if (!verbString.equalsIgnoreCase("HELP") &&
                    !verbString.equalsIgnoreCase("FIGHT") &&
                    !verbString.equalsIgnoreCase("INVENTORY")) {

                return CommandVerb.INVALID;

            } else {

                if (verbString.equalsIgnoreCase("MOVE")) {
                    cv = CommandVerb.MOVE;
                }
                if (verbString.equalsIgnoreCase("USE")) {
                    cv = CommandVerb.USE;
                }
                if (verbString.equalsIgnoreCase("DIG")) {
                    cv = CommandVerb.DIG;
                }
                if (verbString.equalsIgnoreCase("EXAMINE")) {
                    cv = CommandVerb.EXAMINE;
                }
                if (verbString.equalsIgnoreCase("LOOK")) {
                    cv = CommandVerb.LOOK;
                }
                if (verbString.equalsIgnoreCase("INVALID")) {
                    cv = CommandVerb.INVALID;
                }
                if (verbString.equalsIgnoreCase("HELP")) {
                    cv = CommandVerb.HELP;
                }
                if (verbString.equalsIgnoreCase("FIGHT")) {
                    cv = CommandVerb.FIGHT;
                }
                if (verbString.equalsIgnoreCase("INVENTORY")) {
                    cv = CommandVerb.INVENTORY;
                }

                return cv;

            }
        } else {

            if (verbString.equalsIgnoreCase("MOVE")) {
                cv = CommandVerb.MOVE;
            }
            if (verbString.equalsIgnoreCase("USE")) {
                cv = CommandVerb.USE;
            }
            if (verbString.equalsIgnoreCase("DIG")) {
                cv = CommandVerb.DIG;
            }
            if (verbString.equalsIgnoreCase("EXAMINE")) {
                cv = CommandVerb.EXAMINE;
            }
            if (verbString.equalsIgnoreCase("LOOK")) {
                cv = CommandVerb.LOOK;
            }
            if (verbString.equalsIgnoreCase("INVALID")) {
                cv = CommandVerb.INVALID;
            }
            if (verbString.equalsIgnoreCase("HELP")) {
                cv = CommandVerb.HELP;
            }
            if (verbString.equalsIgnoreCase("FIGHT")) {
                cv = CommandVerb.FIGHT;
            }
            if (verbString.equalsIgnoreCase("INVENTORY")) {
                cv = CommandVerb.INVENTORY;
            }

            return cv;

        }
    }
}
