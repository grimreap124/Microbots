package net.runelite.client.plugins.microbot.giantsfoundry.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SmithableBars {
    BRONZE("Bronze", "1 Copper ore and 1 Tin ore", 1, 6.2),
    IRON("Iron", "1 Iron ore", 15, 12.5),
    STEEL("Steel", "1 Iron ore and 2 Coal", 30, 17.5),
    MITHRIL("Mithril", "1 Mithril ore and 4 Coal", 50, 30),
    ADAMANT("Adamantite", "1 Adamantite ore and 6 Coal", 70, 37.5),
    RUNE("Runite", "1 Runite ore and 8 Coal", 85, 50);

    private final String name;
    private final String oresNeeded;
    private final int levelNeeded;
    private final double experienceAcquired;


}
