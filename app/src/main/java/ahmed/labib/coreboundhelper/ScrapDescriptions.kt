package ahmed.labib.coreboundhelper

data class Description (
    val id: Int,
    val map: String,
    val name: String,
    val difficultyValue: Int,
    val difficultyName: String,
    val boostValue: Int,
    val description: String,
    val attributeHealth: Int,
    val attributeDamage: Int,
)

val descriptionsLostScrapyard = listOf(
    Description(
        id = 1,
        map = "The Lost Scrapyard",
        name = "Box",
        difficultyValue = 1,
        difficultyName = "Scrap",
        boostValue = 1,
        description = """Discarded as a piece of Scrap, they were never given a weapon. They can only move and attack by rolling around.
            |
            |To avoid their attacks, simply jump over them or find higher ground.
        """.trimMargin(),
        attributeHealth = 80,
        attributeDamage = 15,
    ),
    Description(
        id = 2,
        map = "The Lost Scrapyard",
        name = "Springling",
        difficultyValue = 1,
        difficultyName = "Scrap",
        boostValue = 1,
        description = """They were scraped as their movement method was slow and inefficient.
            |
            |Their only weapon is a small gun, but it can't aim at an angle. Use this limitation to your advantage to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 60,
        attributeDamage = 10,
    ),
    Description(
        id = 3,
        map = "The Lost Scrapyard",
        name = "Roller",
        difficultyValue = 1,
        difficultyName = "Scrap",
        boostValue = 1,
        description = """Unlike most machines in the Scrapyard, Rollers can move at considerable speeds over varied terrain.
            |
            |They shoot slow projectiles at close range, making staying at a distance the best way to avoid their attacks.
        """.trimMargin(),
        attributeHealth = 150,
        attributeDamage = 18,
    ),
    Description(
        id = 4,
        map = "The Lost Scrapyard",
        name = "Scarplash",
        difficultyValue = 1,
        difficultyName = "Scrap",
        boostValue = 1,
        description = """Tethered to the Scrapyard's roof, they cannot move horizontally but can ascend and descend the rope using an internal motor.
            |
            |Once they start charging an attack, they are unable to change their trajectory. Use this opportunity to dodge.
        """.trimMargin(),
        attributeHealth = 200,
        attributeDamage = 65,
    ),
    Description(
        id = 5,
        map = "The Lost Scrapyard",
        name = "Dreadnought",
        difficultyValue = 1,
        difficultyName = "Scrap",
        boostValue = 1,
        description = """While their unique movement method allows them to stay in the air while conserving energy, Dreadnoughts were scrapped as better technology replaced them.
            |
            |They struggle to react to fast targets. Keep moving, and their guns will not be able to catch up to you.
        """.trimMargin(),
        attributeHealth = 700,
        attributeDamage = 8,
    ),
    Description(
        id = 6,
        map = "The Lost Scrapyard",
        name = "Spectrum",
        difficultyValue = 1,
        difficultyName = "Scrap",
        boostValue = 1,
        description = """Built to test tinting the color of light produced by machine cores, Spectrums were eventually scrapped when the technology proved useless.
            |
            |With no way to move or defend themselves, very few of them survived the infection.
        """.trimMargin(),
        attributeHealth = 165,
        attributeDamage = 0,
    ),
)
