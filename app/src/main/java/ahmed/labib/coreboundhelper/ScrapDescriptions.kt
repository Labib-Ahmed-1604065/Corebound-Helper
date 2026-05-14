package ahmed.labib.coreboundhelper

data class Description (
    val id: Int,
    //val map: String,
    val name: String,
    //val difficultyValue: Int,
    //val difficultyName: String,
    //val boostValue: Int,
    val description: String,
    val attributeHealth: Int,
    val attributeDamage: Int,
)

val descriptions_DifficultyScrap_MapTheLostScrapyard = listOf(
    Description(
        id = 1,
        name = "Box",
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        name = "Springling",
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        name = "Roller",
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        name = "Scarplash",
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        name = "Dreadnought",
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        name = "Spectrum",
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)
val descriptions_DifficultyTarnished_MapTheLostScrapyard = listOf(
    Description(
        id = 1,
        name = "Box",
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        name = "Springling",
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        name = "Roller",
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        name = "Scarplash",
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        name = "Dreadnought",
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        name = "Spectrum",
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)
val descriptions_DifficultyPure_MapTheLostScrapyard = listOf(
    Description(
        id = 1,
        name = "Box",
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        name = "Springling",
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        name = "Roller",
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        name = "Scarplash",
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        name = "Dreadnought",
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        name = "Spectrum",
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)
val descriptions_DifficultyToxic_MapTheLostScrapyard = listOf(
    Description(
        id = 1,
        name = "Box",
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        name = "Springling",
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        name = "Roller",
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        name = "Scarplash",
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        name = "Dreadnought",
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        name = "Spectrum",
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)
val descriptions_DifficultyFrozen_MapTheLostScrapyard = listOf(
    Description(
        id = 1,
        name = "Box",
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        name = "Springling",
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        name = "Roller",
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        name = "Scarplash",
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        name = "Dreadnought",
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        name = "Spectrum",
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)
val descriptions_DifficultyGeared_MapTheLostScrapyard = listOf(
    Description(
        id = 1,
        name = "Box",
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        name = "Springling",
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        name = "Roller",
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        name = "Scarplash",
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        name = "Dreadnought",
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        name = "Spectrum",
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)

val descriptions_DifficultyTarnished_MapCrystalQuarry = listOf(
    Description(
        id = 7,
        name = "Bubblemound",
        description= """Although incapable of moving or attacking, they have the same awareness as any other machine. Their original purpose is unclear.
            |
            |As long as you don't touch their bubbles, they can't harm you.
        """.trimMargin(),
        attributeHealth= 384,
        attributeDamage= 14,
    ),
    Description(
        id = 8,
        name = "Drill",
        description= """They were once used in large swarms to rapidly dig tunnels between mining sites. Now, they use their digging ability to attack.
            |
            |Time your jumps carefully to ensure they don't hit you.
        """.trimMargin(),
        attributeHealth= 480,
        attributeDamage= 41,
    ),
    Description(
        id = 9,
        name = "Wiremaw",
        description= """Long ago, their powerful jaws were used to crush large ores into small pieces.
            |
            |Don't let a Wiremaw hook on to you, as it will reel you right into its jaws.
        """.trimMargin(),
        attributeHealth= 720,
        attributeDamage= 190,//bite+hook damage. they need to be separate
    ),
    Description(
        id = 10,
        name = "Voltstriker",
        description= """By harnessing the power of the Quarry's crystals, they are able to attack by shooting arcs of lightning.
            |
            |The lightning has a low range, so it's best to attack them from a distance.
        """.trimMargin(),
        attributeHealth= 1100,
        attributeDamage= 242,
    ),
    Description(
        id = 11,
        name = "Lurkstrider",
        description= """Originally built to carry materials over long distances, they were later armed with makeshift weapons to defend the Quarry from the spreading infection.
            |
            |Stay in the gaps between the projectiles it shoots.
        """.trimMargin(),
        attributeHealth= 2880,
        attributeDamage= 69,
    ),
    Description(
        id = 12,
        name = "Voltheart",
        description= """Once the infection reached Beacon City, Volthearts were hastily designed to defend the Quarry. Since they were quickly replaced by Voltsrikers, not man were produced.
            |
            |Keep your distance and they will be unable to harm you.
        """.trimMargin(),
        attributeHealth= 336,
        attributeDamage= 97,
    ),
)
val descriptions_DifficultyPure_MapCrystalQuarry = listOf(
    Description(
        id = 7,
        name = "Bubblemound",
        description= """Although incapable of moving or attacking, they have the same awareness as any other machine. Their original purpose is unclear.
            |
            |As long as you don't touch their bubbles, they can't harm you.
        """.trimMargin(),
        attributeHealth= 384,
        attributeDamage= 14,
    ),
    Description(
        id = 8,
        name = "Drill",
        description= """They were once used in large swarms to rapidly dig tunnels between mining sites. Now, they use their digging ability to attack.
            |
            |Time your jumps carefully to ensure they don't hit you.
        """.trimMargin(),
        attributeHealth= 480,
        attributeDamage= 41,
    ),
    Description(
        id = 9,
        name = "Wiremaw",
        description= """Long ago, their powerful jaws were used to crush large ores into small pieces.
            |
            |Don't let a Wiremaw hook on to you, as it will reel you right into its jaws.
        """.trimMargin(),
        attributeHealth= 720,
        attributeDamage= 190,//bite+hook damage. they need to be separate
    ),
    Description(
        id = 10,
        name = "Voltstriker",
        description= """By harnessing the power of the Quarry's crystals, they are able to attack by shooting arcs of lightning.
            |
            |The lightning has a low range, so it's best to attack them from a distance.
        """.trimMargin(),
        attributeHealth= 1100,
        attributeDamage= 242,
    ),
    Description(
        id = 11,
        name = "Lurkstrider",
        description= """Originally built to carry materials over long distances, they were later armed with makeshift weapons to defend the Quarry from the spreading infection.
            |
            |Stay in the gaps between the projectiles it shoots.
        """.trimMargin(),
        attributeHealth= 2880,
        attributeDamage= 69,
    ),
    Description(
        id = 12,
        name = "Voltheart",
        description= """Once the infection reached Beacon City, Volthearts were hastily designed to defend the Quarry. Since they were quickly replaced by Voltsrikers, not man were produced.
            |
            |Keep your distance and they will be unable to harm you.
        """.trimMargin(),
        attributeHealth= 336,
        attributeDamage= 97,
    ),
)
val descriptions_DifficultyToxic_MapCrystalQuarry = listOf(
    Description(
        id = 7,
        name = "Bubblemound",
        description= """Although incapable of moving or attacking, they have the same awareness as any other machine. Their original purpose is unclear.
            |
            |As long as you don't touch their bubbles, they can't harm you.
        """.trimMargin(),
        attributeHealth= 384,
        attributeDamage= 14,
    ),
    Description(
        id = 8,
        name = "Drill",
        description= """They were once used in large swarms to rapidly dig tunnels between mining sites. Now, they use their digging ability to attack.
            |
            |Time your jumps carefully to ensure they don't hit you.
        """.trimMargin(),
        attributeHealth= 480,
        attributeDamage= 41,
    ),
    Description(
        id = 9,
        name = "Wiremaw",
        description= """Long ago, their powerful jaws were used to crush large ores into small pieces.
            |
            |Don't let a Wiremaw hook on to you, as it will reel you right into its jaws.
        """.trimMargin(),
        attributeHealth= 720,
        attributeDamage= 190,//bite+hook damage. they need to be separate
    ),
    Description(
        id = 10,
        name = "Voltstriker",
        description= """By harnessing the power of the Quarry's crystals, they are able to attack by shooting arcs of lightning.
            |
            |The lightning has a low range, so it's best to attack them from a distance.
        """.trimMargin(),
        attributeHealth= 1100,
        attributeDamage= 242,
    ),
    Description(
        id = 11,
        name = "Lurkstrider",
        description= """Originally built to carry materials over long distances, they were later armed with makeshift weapons to defend the Quarry from the spreading infection.
            |
            |Stay in the gaps between the projectiles it shoots.
        """.trimMargin(),
        attributeHealth= 2880,
        attributeDamage= 69,
    ),
    Description(
        id = 12,
        name = "Voltheart",
        description= """Once the infection reached Beacon City, Volthearts were hastily designed to defend the Quarry. Since they were quickly replaced by Voltsrikers, not man were produced.
            |
            |Keep your distance and they will be unable to harm you.
        """.trimMargin(),
        attributeHealth= 336,
        attributeDamage= 97,
    ),
)
val descriptions_DifficultyFrozen_MapCrystalQuarry = listOf(
    Description(
        id = 7,
        name = "Bubblemound",
        description= """Although incapable of moving or attacking, they have the same awareness as any other machine. Their original purpose is unclear.
            |
            |As long as you don't touch their bubbles, they can't harm you.
        """.trimMargin(),
        attributeHealth= 384,
        attributeDamage= 14,
    ),
    Description(
        id = 8,
        name = "Drill",
        description= """They were once used in large swarms to rapidly dig tunnels between mining sites. Now, they use their digging ability to attack.
            |
            |Time your jumps carefully to ensure they don't hit you.
        """.trimMargin(),
        attributeHealth= 480,
        attributeDamage= 41,
    ),
    Description(
        id = 9,
        name = "Wiremaw",
        description= """Long ago, their powerful jaws were used to crush large ores into small pieces.
            |
            |Don't let a Wiremaw hook on to you, as it will reel you right into its jaws.
        """.trimMargin(),
        attributeHealth= 720,
        attributeDamage= 190,//bite+hook damage. they need to be separate
    ),
    Description(
        id = 10,
        name = "Voltstriker",
        description= """By harnessing the power of the Quarry's crystals, they are able to attack by shooting arcs of lightning.
            |
            |The lightning has a low range, so it's best to attack them from a distance.
        """.trimMargin(),
        attributeHealth= 1100,
        attributeDamage= 242,
    ),
    Description(
        id = 11,
        name = "Lurkstrider",
        description= """Originally built to carry materials over long distances, they were later armed with makeshift weapons to defend the Quarry from the spreading infection.
            |
            |Stay in the gaps between the projectiles it shoots.
        """.trimMargin(),
        attributeHealth= 2880,
        attributeDamage= 69,
    ),
    Description(
        id = 12,
        name = "Voltheart",
        description= """Once the infection reached Beacon City, Volthearts were hastily designed to defend the Quarry. Since they were quickly replaced by Voltsrikers, not man were produced.
            |
            |Keep your distance and they will be unable to harm you.
        """.trimMargin(),
        attributeHealth= 336,
        attributeDamage= 97,
    ),
)
val descriptions_DifficultyGeared_MapCrystalQuarry = listOf(
    Description(
        id = 7,
        name = "Bubblemound",
        description= """Although incapable of moving or attacking, they have the same awareness as any other machine. Their original purpose is unclear.
            |
            |As long as you don't touch their bubbles, they can't harm you.
        """.trimMargin(),
        attributeHealth= 384,
        attributeDamage= 14,
    ),
    Description(
        id = 8,
        name = "Drill",
        description= """They were once used in large swarms to rapidly dig tunnels between mining sites. Now, they use their digging ability to attack.
            |
            |Time your jumps carefully to ensure they don't hit you.
        """.trimMargin(),
        attributeHealth= 480,
        attributeDamage= 41,
    ),
    Description(
        id = 9,
        name = "Wiremaw",
        description= """Long ago, their powerful jaws were used to crush large ores into small pieces.
            |
            |Don't let a Wiremaw hook on to you, as it will reel you right into its jaws.
        """.trimMargin(),
        attributeHealth= 720,
        attributeDamage= 190,//bite+hook damage. they need to be separate
    ),
    Description(
        id = 10,
        name = "Voltstriker",
        description= """By harnessing the power of the Quarry's crystals, they are able to attack by shooting arcs of lightning.
            |
            |The lightning has a low range, so it's best to attack them from a distance.
        """.trimMargin(),
        attributeHealth= 1100,
        attributeDamage= 242,
    ),
    Description(
        id = 11,
        name = "Lurkstrider",
        description= """Originally built to carry materials over long distances, they were later armed with makeshift weapons to defend the Quarry from the spreading infection.
            |
            |Stay in the gaps between the projectiles it shoots.
        """.trimMargin(),
        attributeHealth= 2880,
        attributeDamage= 69,
    ),
    Description(
        id = 12,
        name = "Voltheart",
        description= """Once the infection reached Beacon City, Volthearts were hastily designed to defend the Quarry. Since they were quickly replaced by Voltsrikers, not man were produced.
            |
            |Keep your distance and they will be unable to harm you.
        """.trimMargin(),
        attributeHealth= 336,
        attributeDamage= 97,
    ),
)

val descriptions_DifficultyPure_MapBeaconCity = listOf(
    Description(
        id = 13,
        name = "Flareling",
        description= """They attack by shooting powerful beams of energy. However, they have no control over their aim.
            |
            |Individually, they don't pose much of a risk. Alongside other machines, however, their attack is much more dangerous.
        """.trimMargin(),
        attributeHealth= 1340,
        attributeDamage= 234,
    ),
    Description(
        id = 14,
        name = "Rasp",
        description= """Originally designed to shred trash, their saws now make dangerous weapons. Rasps, alongside other machines, keep the City clean.
            |
            |Try to keep your distance from them so they don't get in your way.
        """.trimMargin(),
        attributeHealth= 2570,
        attributeDamage= 140,
    ),
    Description(
        id = 15,
        name = "Droneweaver",
        description= """By drawing power from their cores, they can weave small disposable drones.
            |
            |Unable to think on their own, these drones will not pursue you after they've started moving.
        """.trimMargin(),
        attributeHealth= 3360,
        attributeDamage= 140,
    ),
    Description(
        id = 16,
        name = "Purveyor",
        description= """Before the infection, they were one of the most common inhabitants of the City. They were built to easily interact with their environment.
            |
            |Their grasp is weak, so repeated movements might help you to break free.
        """.trimMargin(),
        attributeHealth= 5150,
        attributeDamage= 23,
    ),
    Description(
        id = 17,
        name = "Orbital",
        description= """Built to perform simulations and generate new ideas, they designed almost all of the City's innovations and machines. Each one stores unique knowledge.
            |
            |Now infected, they won't do anything except mindlessly pursue you.
        """.trimMargin(),
        attributeHealth= 14000,
        attributeDamage= 152,
    ),
)
val descriptions_DifficultyToxic_MapBeaconCity = listOf(
    Description(
        id = 13,
        name = "Flareling",
        description= """They attack by shooting powerful beams of energy. However, they have no control over their aim.
            |
            |Individually, they don't pose much of a risk. Alongside other machines, however, their attack is much more dangerous.
        """.trimMargin(),
        attributeHealth= 1340,
        attributeDamage= 234,
    ),
    Description(
        id = 14,
        name = "Rasp",
        description= """Originally designed to shred trash, their saws now make dangerous weapons. Rasps, alongside other machines, keep the City clean.
            |
            |Try to keep your distance from them so they don't get in your way.
        """.trimMargin(),
        attributeHealth= 2570,
        attributeDamage= 140,
    ),
    Description(
        id = 15,
        name = "Droneweaver",
        description= """By drawing power from their cores, they can weave small disposable drones.
            |
            |Unable to think on their own, these drones will not pursue you after they've started moving.
        """.trimMargin(),
        attributeHealth= 3360,
        attributeDamage= 140,
    ),
    Description(
        id = 16,
        name = "Purveyor",
        description= """Before the infection, they were one of the most common inhabitants of the City. They were built to easily interact with their environment.
            |
            |Their grasp is weak, so repeated movements might help you to break free.
        """.trimMargin(),
        attributeHealth= 5150,
        attributeDamage= 23,
    ),
    Description(
        id = 17,
        name = "Orbital",
        description= """Built to perform simulations and generate new ideas, they designed almost all of the City's innovations and machines. Each one stores unique knowledge.
            |
            |Now infected, they won't do anything except mindlessly pursue you.
        """.trimMargin(),
        attributeHealth= 14000,
        attributeDamage= 152,
    ),
)
val descriptions_DifficultyFrozen_MapBeaconCity = listOf(
    Description(
        id = 13,
        name = "Flareling",
        description= """They attack by shooting powerful beams of energy. However, they have no control over their aim.
            |
            |Individually, they don't pose much of a risk. Alongside other machines, however, their attack is much more dangerous.
        """.trimMargin(),
        attributeHealth= 1340,
        attributeDamage= 234,
    ),
    Description(
        id = 14,
        name = "Rasp",
        description= """Originally designed to shred trash, their saws now make dangerous weapons. Rasps, alongside other machines, keep the City clean.
            |
            |Try to keep your distance from them so they don't get in your way.
        """.trimMargin(),
        attributeHealth= 2570,
        attributeDamage= 140,
    ),
    Description(
        id = 15,
        name = "Droneweaver",
        description= """By drawing power from their cores, they can weave small disposable drones.
            |
            |Unable to think on their own, these drones will not pursue you after they've started moving.
        """.trimMargin(),
        attributeHealth= 3360,
        attributeDamage= 140,
    ),
    Description(
        id = 16,
        name = "Purveyor",
        description= """Before the infection, they were one of the most common inhabitants of the City. They were built to easily interact with their environment.
            |
            |Their grasp is weak, so repeated movements might help you to break free.
        """.trimMargin(),
        attributeHealth= 5150,
        attributeDamage= 23,
    ),
    Description(
        id = 17,
        name = "Orbital",
        description= """Built to perform simulations and generate new ideas, they designed almost all of the City's innovations and machines. Each one stores unique knowledge.
            |
            |Now infected, they won't do anything except mindlessly pursue you.
        """.trimMargin(),
        attributeHealth= 14000,
        attributeDamage= 152,
    ),
)
val descriptions_DifficultyGeared_MapBeaconCity = listOf(
    Description(
        id = 13,
        name = "Flareling",
        description= """They attack by shooting powerful beams of energy. However, they have no control over their aim.
            |
            |Individually, they don't pose much of a risk. Alongside other machines, however, their attack is much more dangerous.
        """.trimMargin(),
        attributeHealth= 1340,
        attributeDamage= 234,
    ),
    Description(
        id = 14,
        name = "Rasp",
        description= """Originally designed to shred trash, their saws now make dangerous weapons. Rasps, alongside other machines, keep the City clean.
            |
            |Try to keep your distance from them so they don't get in your way.
        """.trimMargin(),
        attributeHealth= 2570,
        attributeDamage= 140,
    ),
    Description(
        id = 15,
        name = "Droneweaver",
        description= """By drawing power from their cores, they can weave small disposable drones.
            |
            |Unable to think on their own, these drones will not pursue you after they've started moving.
        """.trimMargin(),
        attributeHealth= 3360,
        attributeDamage= 140,
    ),
    Description(
        id = 16,
        name = "Purveyor",
        description= """Before the infection, they were one of the most common inhabitants of the City. They were built to easily interact with their environment.
            |
            |Their grasp is weak, so repeated movements might help you to break free.
        """.trimMargin(),
        attributeHealth= 5150,
        attributeDamage= 23,
    ),
    Description(
        id = 17,
        name = "Orbital",
        description= """Built to perform simulations and generate new ideas, they designed almost all of the City's innovations and machines. Each one stores unique knowledge.
            |
            |Now infected, they won't do anything except mindlessly pursue you.
        """.trimMargin(),
        attributeHealth= 14000,
        attributeDamage= 152,
    ),
)

val descriptions_DifficultyToxic_MapDesolateDrains = listOf(
    Description(
        id = 18,
        name = "Dreadling",
        description= """Dreadlings use a refined version of Dreadnought movement technology, allowing for greater speed and control.
            |
            |Lacking weapons, the rely solely on physical attacks.
        """.trimMargin(),
        attributeHealth= 12800,
        attributeDamage= 626,
    ),
    Description(
        id = 19,
        name = "Sentry",
        description= """Their pipes connect to a greater power source, which they use to fire beams of energy.
            |
            |They are attached to the pipes and unable to move. Use this to your advantage.
        """.trimMargin(),
        attributeHealth= 7160,
        attributeDamage= 1290,
    ),
    Description(
        id = 20,
        name = "Thornhead",
        description= """Their sharp pointed talons allow them to walk on ceilings without falling down.
            |
            |They are only able to harm you when you're directly below them. Pay attention to the ceilings.
        """.trimMargin(),
        attributeHealth= 16800,
        attributeDamage= 1370,
    ),
    Description(
        id = 21,
        name = "Obstron",
        description= """By shooting barrages of bombs, they can destroy several enemies at once. In the past, they were used to clean out sections of the Drains.
            |
            |Their bombs have limited range. Staying higher up when they explode may help you.
        """.trimMargin(),
        attributeHealth= 22500,
        attributeDamage= 1370,
    ),
    Description(
        id = 22,
        name = "Forgeheart",
        description= """Each Forgeheart routes power throughout a large section of the Drains. Destroying one disrupts the network of pipes in its area.
            |
            |Pay attention to the pipes so you know when they are about to spew fire.
        """.trimMargin(),
        attributeHealth= 86500,
        attributeDamage= 2580,//this is damage per second. need to change.
    ),
)
val descriptions_DifficultyFrozen_MapDesolateDrains = listOf(
    Description(
        id = 18,
        name = "Dreadling",
        description= """Dreadlings use a refined version of Dreadnought movement technology, allowing for greater speed and control.
            |
            |Lacking weapons, the rely solely on physical attacks.
        """.trimMargin(),
        attributeHealth= 12800,
        attributeDamage= 626,
    ),
    Description(
        id = 19,
        name = "Sentry",
        description= """Their pipes connect to a greater power source, which they use to fire beams of energy.
            |
            |They are attached to the pipes and unable to move. Use this to your advantage.
        """.trimMargin(),
        attributeHealth= 7160,
        attributeDamage= 1290,
    ),
    Description(
        id = 20,
        name = "Thornhead",
        description= """Their sharp pointed talons allow them to walk on ceilings without falling down.
            |
            |They are only able to harm you when you're directly below them. Pay attention to the ceilings.
        """.trimMargin(),
        attributeHealth= 16800,
        attributeDamage= 1370,
    ),
    Description(
        id = 21,
        name = "Obstron",
        description= """By shooting barrages of bombs, they can destroy several enemies at once. In the past, they were used to clean out sections of the Drains.
            |
            |Their bombs have limited range. Staying higher up when they explode may help you.
        """.trimMargin(),
        attributeHealth= 22500,
        attributeDamage= 1370,
    ),
    Description(
        id = 22,
        name = "Forgeheart",
        description= """Each Forgeheart routes power throughout a large section of the Drains. Destroying one disrupts the network of pipes in its area.
            |
            |Pay attention to the pipes so you know when they are about to spew fire.
        """.trimMargin(),
        attributeHealth= 86500,
        attributeDamage= 2580,//this is damage per second. need to change.
    ),
)
val descriptions_DifficultyGeared_MapDesolateDrains = listOf(
    Description(
        id = 18,
        name = "Dreadling",
        description= """Dreadlings use a refined version of Dreadnought movement technology, allowing for greater speed and control.
            |
            |Lacking weapons, the rely solely on physical attacks.
        """.trimMargin(),
        attributeHealth= 12800,
        attributeDamage= 626,
    ),
    Description(
        id = 19,
        name = "Sentry",
        description= """Their pipes connect to a greater power source, which they use to fire beams of energy.
            |
            |They are attached to the pipes and unable to move. Use this to your advantage.
        """.trimMargin(),
        attributeHealth= 7160,
        attributeDamage= 1290,
    ),
    Description(
        id = 20,
        name = "Thornhead",
        description= """Their sharp pointed talons allow them to walk on ceilings without falling down.
            |
            |They are only able to harm you when you're directly below them. Pay attention to the ceilings.
        """.trimMargin(),
        attributeHealth= 16800,
        attributeDamage= 1370,
    ),
    Description(
        id = 21,
        name = "Obstron",
        description= """By shooting barrages of bombs, they can destroy several enemies at once. In the past, they were used to clean out sections of the Drains.
            |
            |Their bombs have limited range. Staying higher up when they explode may help you.
        """.trimMargin(),
        attributeHealth= 22500,
        attributeDamage= 1370,
    ),
    Description(
        id = 22,
        name = "Forgeheart",
        description= """Each Forgeheart routes power throughout a large section of the Drains. Destroying one disrupts the network of pipes in its area.
            |
            |Pay attention to the pipes so you know when they are about to spew fire.
        """.trimMargin(),
        attributeHealth= 86500,
        attributeDamage= 2580,//this is damage per second. need to change.
    ),
)

val descriptions_DifficultyFrozen_MapIcyHollow = listOf(
    Description(
        id = 23,
        name = "Thumper",
        description= """By hitting the ground with their pistons, they send out lethal waves of spikes.
            |
            |Thumpers can't move, but the spikes the send out might not always be in the same place.
        """.trimMargin(),
        attributeHealth= 62200,
        attributeDamage= 5180,
    ),
    Description(
        id = 24,
        name = "Springking",
        description= """They use their springs to propel themselves over long distances, having considerable control over where they land.
            |
            |When they land in the ground, they might get stuck. This is a good opportunity to attack them.
        """.trimMargin(),
        attributeHealth= 48300,
        attributeDamage= 2590,
    ),
    Description(
        id = 25,
        name = "Tetherhawk",
        description= """They send powerful currents of electricity through their wires to block of areas.
            |
            |Try not to get stuck between these wires. It takes a few seconds before electricity starts coming through them.
        """.trimMargin(),
        attributeHealth= 117000,
        attributeDamage= 5050,//this is also damage per second
    ),
    Description(
        id = 26,
        name = "Tunneler",
        description= """Their large drills allow them to glide through the ground with ease.
            |
            |Pay attention to falling snow and rubble. That usually means a Tunneler is digging in the ground above you.
        """.trimMargin(),
        attributeHealth= 76000,
        attributeDamage= 7120,
    ),
    Description(
        id = 27,
        name = "Annihilator",
        description= """A massive tank that has wheels designed to traverse varied terrain while firing powerful beams of energy at a high range.
            |
            |Their attacks are harder to avoid when the ground is flatter. Use the terrain to your advantage.
        """.trimMargin(),
        attributeHealth= 253000,
        attributeDamage= 9720,
    ),
)
val descriptions_DifficultyGeared_MapIcyHollow = listOf(
    Description(
        id = 23,
        name = "Thumper",
        description= """By hitting the ground with their pistons, they send out lethal waves of spikes.
            |
            |Thumpers can't move, but the spikes the send out might not always be in the same place.
        """.trimMargin(),
        attributeHealth= 62200,
        attributeDamage= 5180,
    ),
    Description(
        id = 24,
        name = "Springking",
        description= """They use their springs to propel themselves over long distances, having considerable control over where they land.
            |
            |When they land in the ground, they might get stuck. This is a good opportunity to attack them.
        """.trimMargin(),
        attributeHealth= 48300,
        attributeDamage= 2590,
    ),
    Description(
        id = 25,
        name = "Tetherhawk",
        description= """They send powerful currents of electricity through their wires to block of areas.
            |
            |Try not to get stuck between these wires. It takes a few seconds before electricity starts coming through them.
        """.trimMargin(),
        attributeHealth= 117000,
        attributeDamage= 5050,//this is also damage per second
    ),
    Description(
        id = 26,
        name = "Tunneler",
        description= """Their large drills allow them to glide through the ground with ease.
            |
            |Pay attention to falling snow and rubble. That usually means a Tunneler is digging in the ground above you.
        """.trimMargin(),
        attributeHealth= 76000,
        attributeDamage= 7120,
    ),
    Description(
        id = 27,
        name = "Annihilator",
        description= """A massive tank that has wheels designed to traverse varied terrain while firing powerful beams of energy at a high range.
            |
            |Their attacks are harder to avoid when the ground is flatter. Use the terrain to your advantage.
        """.trimMargin(),
        attributeHealth= 253000,
        attributeDamage= 9720,
    ),
)

val descriptions_DifficultyGeared_MapKineticWorkshop = listOf(
    Description(
        id = 28,
        name = "Reaver",
        description= """Before the infection spiraled out of control, Reavers rarely had drills. However, because they could defend themselves, those with drills are the only ones that remain.
            |
            |When they charge downwards, their propellers create a powerful updraft that can lift you in the air.
        """.trimMargin(),
        attributeHealth= 194000,
        attributeDamage= 6800,
    ),
    Description(
        id = 29,
        name = "Shatterclaw",
        description= """Only designed to build and move things around, Shatterclaws will damage themselves when slamming into the ground.
            |
            |They will try to predict your movements. Try to switch directions often to confuse them.
        """.trimMargin(),
        attributeHealth= 215000,
        attributeDamage= 3820,//need to add attributeSelfDamage= 2330
    ),
    Description(
        id = 30,
        name = "Cyclovane",
        description= """By staying airborne at all times, Cyclovanes could avoid the danger of many of the Workshop's experiments.
            |
            |Just like other similarly-attacking machines, they can't turn while aiming. If cornered, use this opportunity to escape.
        """.trimMargin(),
        attributeHealth= 358000,
        attributeDamage= 17000,
    ),
    Description(
        id = 31,
        name = "Barrelspire",
        description= """In an attempt to prevent the spreading infection, Barrelspires are excessively fortified. Unlike most machines, they were built primarily for battle.
            |
            |They are most dangerous alongside other enemies. Try to find opportunities to attack them alone.
        """.trimMargin(),
        attributeHealth= 512000,
        attributeDamage= 5100,
    ),
    Description(
        id = 32,
        name = "Stridelord",
        description= """Built to destroy any loose infected machines, the powerful Stridelords' large size and slow movement made them among the Workshop's first to succumb to the infection.
            |
            |Destroying a leg will disrupt the Stridelord's internal gyroscope, sending it crashing down.
        """.trimMargin(),
        attributeHealth= 921000,//leg health 716000
        attributeDamage= 44600,//bullet 19100+ stomp 25500, separate them
    ),
)
