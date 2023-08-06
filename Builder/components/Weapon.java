package Builder.components;

public enum Weapon {
    MISSILE_ARMAMENT("Missile armament", "Powerful long-range guided missiles."),
    CANNON_ARMAMENT("Cannon armament", "Rapid-firing cannons for close combat."),
    BOMB_ARMAMENT("Bomb armament", "Drops high-explosive bombs on targets."),
    SPECIAL_ARMAMENT("Special armament", "Customized special weapons for specific missions.");

    private final String displayName;
    private final String description;

    Weapon(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
}
