package com.example.mycomposeaplication.model

import com.example.mycomposeaplication.R

object HeroesData {
    val heroes = listOf(
        Hero(
            id = 1,
            imgResId = R.drawable.img_abanddon,
            name = "Abanddon",
            subtitle = "Shields his allies or himself from attacks",
            description = "Able to transform enemy attacks into self-healing, Abaddon can survive almost any assault. Shielding allies and launching his double-edged coil at a friend or foe, he is always ready to ride into the thick of battle.",
            type = "Strength",
            attackType = "Melee"
        ),
        Hero(
            id = 2,
            imgResId = R.drawable.img_achemist,
            name = "Alchemist",
            subtitle = "Earns extra gold from unit kills and bounty runes",
            description = "Synthesizing extra resources from each and every kill, Alchemist has no trouble gathering the tools needed to destroy his foes. Ambushing enemies with corrosive acid and a host of unstable chemicals, he battles to ensure his greedy escapades can remain uninterrupted.",
            type = "Strength",
            attackType = "Melee"
        ),

        Hero(
            id = 3,
            imgResId = R.drawable.img_anti_mage,
            name = "Anti-Mage",
            subtitle = "Slashes his foes with mana-draining attacks\n",
            description = "Should Anti-Mage have the opportunity to gather his full strength, few can stop his assaults. Draining mana from enemies with every strike or teleporting short distances to escape an ambush, cornering him is a challenge for any foe.",
            type = "Agility",
            attackType = "Melee"
        ),

        Hero(
            id = 4,
            imgResId = R.drawable.img_arc_warden,
            name = "Arc Warden",
            subtitle = "Creates a copy of himself to split push",
            description = "A splintered fragment of the same primordial power as the Ancients themselves, Zet the Arc Warden has pledged to see the clash between Radiant and Dire finally end. Assault lone enemies with fluxing energy, or distort space to generate a protective field around allies. Summon a Spark Wraith to patrol an area for enemies to infuse with harmful magic, then create a double of Zet, items and all, to overwhelm your foes.",
            type = "Universal",
            attackType = "Ranged"
        ),

        Hero(
            id = 5,
            imgResId = R.drawable.img_axe,
            name = "Axe",
            subtitle = "Taunts and forces enemies to attack him",
            description = "One after another, Axe cuts down his foes. Marching ahead of his team, he locks his enemies in battle then counters their blows with a deadly spin of his weapon. Slamming his culling blade through a weakened enemy, he is always charging onward.",
            type = "Strength",
            attackType = "Melee"
        ),


        Hero(
            id = 6,
            imgResId = R.drawable.img_bane,
            name = "Axe",
            subtitle = "Puts his enemies to sleep, incapacitating them\n",
            description = "Bane brings terror to his enemies with his arsenal of disabling abilities. Whether trapping a foe within a contagious nightmare, or gripping an enemy in place, he gives allies all the time they need to slay their enemy.",
            type = "Universal",
            attackType = "Ranged"
        ),

        Hero(
            id = 7,
            imgResId = R.drawable.img_batrider,
            name = "Batrider",
            subtitle = "Can lasso an enemy away from his team\n\n",
            description = "Once he takes to the skies, Batrider can strike from any direction. Snatching a foe with his lasso, he soars above the treetops, pulling his prey through a trail of flame as he drags them before his merciless allies.",
            type = "Universal",
            attackType = "Ranged"
        ),

        Hero(
            id = 8,
            imgResId = R.drawable.img_beastmaster,
            name = "Be",
            subtitle = "Summons beasts to aid his hunt",
            description = "Summoning a poison-spitting boar and a scouting hawk to aid his hunt, Beastmaster never stalks the battlefield unprepared. Chopping through the forest with his axes, his stunning roar opens the way for his allies to devastate enemies.",
            type = "Universal",
            attackType = "Melee"
        ),

        Hero(
            id = 9,
            imgResId = R.drawable.img_crystal_maiden,
            name = "Crystal Maiden",
            subtitle = "Unleashes a high damage blizzard upon her foes",
            description = "Able to keep her allies supplied with mana as she slows down enemies to ensure a kill, Crystal Maiden is a helpful addition to any team. And, when the opportunity arises, she can unleash her massive ultimate ability to devastate her foes.",
            type = "Intelligence",
            attackType = "Range"
        ),

        Hero(
            id = 10,
            imgResId = R.drawable.img_invoker,
            name = "Invoker",
            subtitle = "Weaves magic with an array of spell combos",
            description = "With an intricate arsenal of spells at his disposal, Invoker can adapt to any battle situation. Each configuration of his three spell components yields of one of ten spells, meaning he's never without a way to destroy or escape his enemies",
            type = "Intelligence",
            attackType = "Ranged"
        ),
    )
}