package net.runelite.client.plugins.microbot.giantsfoundry.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SmithableItems {
    BAR("bar", 1),
    BATTLEAXE("battleaxe",2),
    CHAINBODY("chainbody",2),
    CLAWS("claws",1),
    FULL_HELM("full helm",1),
    KITESHIELD("kiteshield",2),
    LONGSWORD("longsword",1),
//    PLATEBODY("platebody",4),
    PLATELEGS("platelegs",2),
    PLATESKIRT("plateskirt",2),
    SCIMITAR("scimitar",1),
    SQ_SHIELD("sq shield",1),
    TWO_H_SWORD("2h sword",2),
    WARHAMMER("warhammer",2);

    private final String name;
    private final int numberOfBars;


}
