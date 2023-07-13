package Players.hero.pool.Players.hero.pool.data;

import Players.hero.pool.Players.hero.pool.dto.Ability;
import Players.hero.pool.Players.hero.pool.dto.Hero;
import Players.hero.pool.Players.hero.pool.dto.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataImporter {
    List<Ability> abilities=new ArrayList<>();
    Ability rage = Ability.abilityBuilder()
            .name("RAGE")
            .description("Entering an insane rage" +
                    ", the hero becomes immune to effects and gains +80% magic resistance" +
                    ", and his movement speed increases. ")
            .manaCost(75)
            .coolDown(20)
            .build();
    Ability feast = Ability.abilityBuilder()
            .name("FEAST")
            .description("Adds additional damage and lifesteal to the hero's attacks" +
                    " based on the enemy's maximum health.")
            .manaCost(0)
            .coolDown(0)
            .damageType("PHYSICAL")
            .build();
    Ability ghoulFrenzy = Ability.abilityBuilder()
            .name("GHOUL FRENZY")
            .description("The hero's attacks significantly slow the enemy's movement for 1.5 seconds. " +
                    "Increases the wearer's attack speed.")
            .manaCost(0)
            .coolDown(0)
            .damageType("PHYSICAL")
            .build();
    Ability infest = Ability.abilityBuilder()
            .name("INFEST")
            .description("The hero climbs into the body of the selected creature," +
                    " becoming invisible to opponents and restoring a fraction of his maximum health every second. " +
                    "After that, it can break out of the carrier, dealing damage to surrounding enemies." +
                    " Being inside an enemy or neutral creep, the hero can fully control it. Does not affect enemy heroes. ")
            .manaCost(100)
            .coolDown(80)
            .damageType("MAGICAL")
            .build();
    Ability waveform = Ability.abilityBuilder()
            .name("WAVEFORM")
            .description("The hero turns into liquid and rushes forward" +
                    ", dealing damage to all enemies in his path. During the duration of the ability" +
                    ", the hero is invulnerable.")
            .manaCost(130)
            .coolDown(21)
            .damageType("MAGICAL")
            .build();
    Ability adaptiveStrikeA = Ability.abilityBuilder()
            .name("ADAPTIVE STRIKE (AGILITY)")
            .description("Launches a stream of water at an enemy creature, dealing damage based on the hero's dexterity." +
                    " The agility multiplier will be maximum if the hero's agility is 50% higher than his strength. " +
                    "Grants a permanent bonus to agility.")
            .manaCost(40)
            .coolDown(10)
            .damageType("MAGICAL")
            .build();
    Ability adaptiveStrikeF = Ability.abilityBuilder()
            .name("ADAPTIVE STRIKE (FORCE)")
            .description("Launches a stream of water at an enemy creature, dealing damage based on the hero's dexterity." +
                    " The agility multiplier will be maximum if the hero's agility is 50% higher than his strength. " +
                    "Grants a permanent bonus to agility. ")
            .manaCost(40)
            .coolDown(10)
            .damageType("MAGICAL")
            .build();
    Ability attributeShiftD = Ability.abilityBuilder()
            .name("ATTRIBUTE SHIFT (DEXTERITY)")
            .description("The hero changes his form, turning points of strength into points of agility. " +
                    "This process is reversible. With the level of the ability, the speed of transformation increases.")
            .manaCost(0)
            .coolDown(0)
            .build();
    Ability attributeShiftS = Ability.abilityBuilder()
            .name("ATTRIBUTE SHIFT (STRENGTH)")
            .description("The hero changes his form, turning points of agility into points of strength. " +
                    "This process is reversible. With the level of the ability, the speed of transformation increases.")
            .manaCost(0)
            .coolDown(0)
            .build();
    Ability morph = Ability.abilityBuilder()
            .name("MORPH")
            .description("The hero changes his form in the image and likeness of the selected enemy, gaining his main abilities." +
                    " During the action, the hero's form can be changed to the main one and vice versa.")
            .manaCost(50)
            .coolDown(140)
            .build();

    Ability bladeFury = Ability.abilityBuilder()
            .name("BLADE FURY")
            .description("The hero spins in a whirlwind of crushing blade strikes," +
                    " becoming immune to effects, gaining +80% magic resistance and dealing damage to nearby enemies.")
            .manaCost(120)
            .coolDown(42)
            .damageType("MAGICAL")
            .build();
    Ability healingWard = Ability.abilityBuilder()
            .name("HEALING WARD")
            .description("Summons a totem that heals all nearby allies and moves at a speed of 325.0. " +
                    "The amount of healing depends on the maximum health of the ally. Lasts 25.0 sec.")
            .manaCost(140)
            .coolDown(60)
            .build();
    Ability abladeDance = Ability.abilityBuilder()
            .name("ABLADE DANCE")
            .description("Gives the hero a chance to deal critical damage with an attack.")
            .manaCost(0)
            .coolDown(0)
            .build();
    Ability omnislash = Ability.abilityBuilder()
            .name("OMNISLASH")
            .description("The hero jumps to the target enemy, and then attacks him and nearby enemies with increased speed. " +
                    "For the duration of the ability, the hero becomes invulnerable. ")
            .manaCost(200)
            .coolDown(120)
            .damageType("PHYSICAL")
            .build();
    Ability timeWalk = Ability.abilityBuilder()
            .name("TIME WALK")
            .description("Dash to the target location and restore the health lost in the last 2.0 seconds.")
            .manaCost(40)
            .coolDown(24)
            .build();
    Ability timeDilation = Ability.abilityBuilder()
            .name("TIME DILATION")
            .description("Places a temporary field on nearby enemies, increasing their ability cooldowns by 8.0 seconds. " +
                    "Each ability hit slows the victim's movement and attack by 10.0% and deals damage every second." +
                    " The duration of this effect is not reduced by Chronosphere.")
            .manaCost(60)
            .coolDown(28)
            .damageType("MAGICAL")
            .build();
    Ability timeLock = Ability.abilityBuilder()
            .name("TIME LOCK")
            .description("The attack can stop time for an enemy creature, causing it to take another hit.")
            .manaCost(0)
            .coolDown(0)
            .damageType("MAGICAL")
            .build();
    Ability chronosphere = Ability.abilityBuilder()
            .name("CHRONOSPHERE")
            .description("Creates a sphere in which space and time freeze. It stops everything inside itself" +
                    ", and its owner and creatures under his control move in it with increased speed. Inside the sphere" +
                    ", the invisibility of enemies is revealed and the cooldowns of all items and abilities are stopped.")
            .manaCost(150)
            .coolDown(160)
            .build();
    Hero lifestealer = Hero.heroBuilder()
            .name("LIFESTEALER")
            .description("Forces Lifestealer to make instant attacks against the infected enemy in 1.25 second intervals" +
                    ", starting immediately upon cast, resulting in 5 attacks on the target. " +
                    "These instant attacks can trigger attack modifiers and interact normally with attack-based effects.")
            .health(610)
            .mana(255)
            .mainAttribute("STRENGTH")
            .heroAbilities(getLifestealerAbilities())
            .build();
    Hero morphling = Hero.heroBuilder()
            .name("LIFESTEALER")
            .description("Forces Lifestealer to make instant attacks against the infected enemy in 1.25 second intervals" +
                    ", starting immediately upon cast, resulting in 5 attacks on the target. " +
                    "These instant attacks can trigger attack modifiers and interact normally with attack-based effects.")
            .health(610)
            .mana(255)
            .mainAttribute("STRENGTH")
            .heroAbilities(getMorphlingAbilities())
            .build();
    Hero juggernaut = Hero.heroBuilder()
            .name("LIFESTEALER")
            .description("Forces Lifestealer to make instant attacks against the infected enemy in 1.25 second intervals" +
                    ", starting immediately upon cast, resulting in 5 attacks on the target. " +
                    "These instant attacks can trigger attack modifiers and interact normally with attack-based effects.")
            .health(610)
            .mana(255)
            .mainAttribute("STRENGTH")
            .heroAbilities(getJuggernautAbilities())
            .build();
    Hero facelessVoid = Hero.heroBuilder()
            .name("LIFESTEALER")
            .description("Forces Lifestealer to make instant attacks against the infected enemy in 1.25 second intervals" +
                    ", starting immediately upon cast, resulting in 5 attacks on the target. " +
                    "These instant attacks can trigger attack modifiers and interact normally with attack-based effects.")
            .health(610)
            .mana(255)
            .mainAttribute("STRENGTH")
            .heroAbilities(getFacelessVoidAbilities())
            .build();

    Player lenaGol0vach = Player.playerBuilder()
            .name("Sergey")
            .nickname("LenaGol0vach")
            .playerPool(getLenaGol0vachHeroes())
            .build();
    Player dyrachyo = Player.playerBuilder()
            .name("Anton")
            .nickname("Dyrachyo")
            .teamName("Gaimin Gladiators")
            .playerPool(getDyrachyoHeroes())
            .build();
    Player papich = Player.playerBuilder()
            .name("Vitaliy")
            .nickname("Papich")
            .playerPool(getPapichHeroes())
            .build();


    public List<Player> getAllPlayers() {
        return  new ArrayList<>(Arrays.asList(lenaGol0vach, dyrachyo, papich));
    }

    public List<Hero> getAllHeroes() {
        return  new ArrayList<>(Arrays.asList(lifestealer, morphling, juggernaut, facelessVoid));
    }

    public List<Ability> getAllAbilities() {
        return  new ArrayList<> (Arrays.asList(rage, feast, ghoulFrenzy, infest, waveform, adaptiveStrikeA, adaptiveStrikeF
                , attributeShiftD, attributeShiftS, morph, bladeFury, healingWard, abladeDance, omnislash, timeWalk
                , timeDilation, timeLock, chronosphere));
    }

    public List<Hero> getLenaGol0vachHeroes() {
        return Arrays.asList(juggernaut, facelessVoid);
    }

    public List<Hero> getDyrachyoHeroes() {
        return Arrays.asList(lifestealer, morphling);
    }

    public List<Hero> getPapichHeroes() {
        return Arrays.asList(morphling, juggernaut);
    }

    public List<Ability> getLifestealerAbilities() {
        return Arrays.asList(rage, feast, ghoulFrenzy, infest);
    }

    public List<Ability> getMorphlingAbilities() {
        return Arrays.asList(waveform, adaptiveStrikeA, adaptiveStrikeF, attributeShiftD
                , attributeShiftS, morph);
    }

    public List<Ability> getJuggernautAbilities() {
        return Arrays.asList(bladeFury, healingWard, abladeDance, omnislash);
    }

    public List<Ability> getFacelessVoidAbilities() {
        return Arrays.asList(timeWalk, timeDilation, timeLock, chronosphere);
    }


}
