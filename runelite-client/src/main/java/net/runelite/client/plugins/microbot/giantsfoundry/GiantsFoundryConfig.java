package net.runelite.client.plugins.microbot.giantsfoundry;

import net.runelite.client.config.*;
import net.runelite.client.plugins.microbot.giantsfoundry.enums.SmithableBars;

@ConfigGroup(GiantsFoundryConfig.GROUP)
@ConfigInformation(
        "• Start at the giants foundry minigame. <br />" +
        "• Please select the bars in your UI <br />" +
        "• Make sure you are wearing ice gloves & no weapon/shield equipped <br />"
)
public interface GiantsFoundryConfig extends Config {

    String GROUP = "GiantsFoundry";


    @ConfigSection(
            name = "First Item",
            description = "Configure what should be used for the first item",
            position = 0
    )
    String firstItemSection = "First Item";

    @ConfigItem(
            keyName = "metalType",
            name = "Metal type",
            description = "Type of metal to use for the first item",
            section = firstItemSection,
            position = 0
    )
    default SmithableBars FirstBar()
    {
        return SmithableBars.STEEL;
    }

    @ConfigItem(
            keyName = "firstBar",
            name = "Bar",
            description = "Use bars as metal (Counts as 1 bar)",
            section = firstItemSection,
            position = 1
    )
    default boolean firstBars()
    {
        return false;
    }


    @ConfigItem(
            keyName = "firstScimitar",
            name = "Smelt scimitar",
            description = "Use scimitars as metal (Counts as 1 bar)",
            position = 2,
            section = firstItemSection
    )
    default boolean firstScimitar()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstLongsword",
            name = "Smelt longsword",
            description = "Use longswords as metal (Counts as 1 bar)",
            position = 3,
            section = firstItemSection
            )
    default boolean firstLongsword()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstFullHelm",
            name = "Smelt full helm",
            description = "Use full helms as meta (Counts as 1 bar)",
            position = 4,
            section = firstItemSection
            )
    default boolean firstFullHelm()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstSqShield",
            name = "Smelt sq shield",
            description = "Use sq shields as metal (Counts as 1 bar)",
            position = 5,
            section = firstItemSection
            )
    default boolean firstSqShield()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstClaws",
            name = "Smelt claws",
            description = "Use claws as metal (Counts as 1 bar)",
            position = 6,
            section = firstItemSection
            )
    default boolean firstClaws()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstWarhammer",
            name = "Smelt warhammer",
            description = "Use warhammers as metal (Counts as 2 bar)",
            position = 7,
            section = firstItemSection
            )
    default boolean firstWarhammer()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstBattleaxe",
            name = "Smelt battleaxe",
            description = "Use battleaxes as metal (Counts as 2 bar)",
            position = 8,
            section = firstItemSection
            )
    default boolean firstBattleaxe()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstChainbody",
            name = "Smelt chainbody",
            description = "Use chainbodys as metal (Counts as 2 bar)",
            position = 9,
            section = firstItemSection
            )
    default boolean firstChainbody()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstKiteshield",
            name = "Smelt kiteshield",
            description = "Use kiteshields as metal (Counts as 2 bar)",
            position = 10,
            section = firstItemSection
            )
    default boolean firstKiteshield()
    {
        return false;
    }

    @ConfigItem(
            keyName = "first2hSword",
            name = "Smelt 2h sword",
            description = "Use 2h swords as metal (Counts as 2 bar)",
            position = 11,
            section = firstItemSection
            )
    default boolean first2hSword()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstPlatelegs",
            name = "Smelt platelegs",
            description = "Use platelegss as metal (Counts as 2 bar)",
            position = 12,
            section = firstItemSection
            )
    default boolean firstPlatelegs()
    {
        return false;
    }

    @ConfigItem(
            keyName = "firstPlateskirt",
            name = "Smelt plateskirt",
            description = "Use plateskirts as metal (Counts as 2 bar)",
            position = 13,
            section = firstItemSection
            )
    default boolean firstPlateskirt()
    {
        return false;
    }

//    @ConfigItem(
//            keyName = "firstPlatebody",
//            name = "Smelt platebody",
//            description = "Use platebodys as metal (Counts as 4 bar)",
//            position = 14,
//            section = firstItemSection
//            )
//    default boolean firstPlatebody()
//    {
//        return false;
//    }

    @ConfigItem(
            keyName = "firstBarAmount",
            name = "First Bar Amount",
            description = "Choose the first type of bar",
            section = firstItemSection,
            position = 15
    )
    default int firstBarAmount()
    {
        return 14;
    }

    @ConfigSection(
            name = "Second Item",
            description = "Configure what should be used for the second item",
            position = 1
    )
    String secondItemSection = "Second Item";

    @ConfigItem(
            keyName = "metalType",
            name = "Metal type",
            description = "Type of metal to use for the first item",
            section = secondItemSection,
            position = 0
    )
    default SmithableBars SecondBar()
    {
        return SmithableBars.STEEL;
    }

    @ConfigItem(
            keyName = "secondBar",
            name = "Bar",
            description = "Use bars as metal (Counts as 1 bar)",
            section = secondItemSection,
            position = 1
    )
    default boolean secondBars()
    {
        return false;
    }


    @ConfigItem(
            keyName = "secondScimitar",
            name = "Smelt scimitar",
            description = "Use scimitars as metal (Counts as 1 bar)",
            position = 2,
            section = secondItemSection
    )
    default boolean secondScimitar()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondLongsword",
            name = "Smelt longsword",
            description = "Use longswords as metal (Counts as 1 bar)",
            position = 3,
            section = secondItemSection
    )
    default boolean secondLongsword()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondFullHelm",
            name = "Smelt full helm",
            description = "Use full helms as meta (Counts as 1 bar)",
            position = 4,
            section = secondItemSection
    )
    default boolean secondFullHelm()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondSqShield",
            name = "Smelt sq shield",
            description = "Use sq shields as metal (Counts as 1 bar)",
            position = 5,
            section = secondItemSection
    )
    default boolean secondSqShield()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondClaws",
            name = "Smelt claws",
            description = "Use claws as metal (Counts as 1 bar)",
            position = 6,
            section = secondItemSection
    )
    default boolean secondClaws()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondWarhammer",
            name = "Smelt warhammer",
            description = "Use warhammers as metal (Counts as 2 bar)",
            position = 7,
            section = secondItemSection
    )
    default boolean secondWarhammer()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondBattleaxe",
            name = "Smelt battleaxe",
            description = "Use battleaxes as metal (Counts as 2 bar)",
            position = 8,
            section = secondItemSection
    )
    default boolean secondBattleaxe()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondChainbody",
            name = "Smelt chainbody",
            description = "Use chainbodys as metal (Counts as 2 bar)",
            position = 9,
            section = secondItemSection
    )
    default boolean secondChainbody()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondKiteshield",
            name = "Smelt kiteshield",
            description = "Use kiteshields as metal (Counts as 2 bar)",
            position = 10,
            section = secondItemSection
    )
    default boolean secondKiteshield()
    {
        return false;
    }

    @ConfigItem(
            keyName = "second2hSword",
            name = "Smelt 2h sword",
            description = "Use 2h swords as metal (Counts as 2 bar)",
            position = 11,
            section = secondItemSection
    )
    default boolean second2hSword()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondPlatelegs",
            name = "Smelt platelegs",
            description = "Use platelegss as metal (Counts as 2 bar)",
            position = 12,
            section = secondItemSection
    )
    default boolean secondPlatelegs()
    {
        return false;
    }

    @ConfigItem(
            keyName = "secondPlateskirt",
            name = "Smelt plateskirt",
            description = "Use plateskirts as metal (Counts as 2 bar)",
            position = 13,
            section = secondItemSection
    )
    default boolean secondPlateskirt()
    {
        return false;
    }

//    @ConfigItem(
//            keyName = "secondPlatebody",
//            name = "Smelt platebody",
//            description = "Use platebodys as metal (Counts as 4 bar)",
//            position = 14,
//            section = secondItemSection
//    )
//    default boolean secondPlatebody()
//    {
//        return false;
//    }

    @ConfigItem(
            keyName = "secondBarAmount",
            name = "Second Bar Amount",
            description = "Choose the second type of bar",
            section = secondItemSection,
            position = 15
    )
    default int secondBarAmount()
    {
        return 14;
    }

    @ConfigItem(
            keyName = "testing",
            name = "Test the items",
            description = "aaayuooo delete me",
            position = 3
    )
    default boolean test()
    {
        return false;
    }
}
