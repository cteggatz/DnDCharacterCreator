package com.Teggatz.CharacterTraits.Enums.Proficiencies;

public enum WeaponProficiancies {
    //SIMPLE MELEE
    CLUB(new String[]{"1d4"}, AttackTypes.BLUDGEONING),
    DAGGER(new String[]{"1d4"}, AttackTypes.PIERCING),
    GREATCLUB(new String[]{"1d8"}, AttackTypes.BLUDGEONING),
    HANDAXE(new String[]{"1d6"},AttackTypes.SLASHING),
    JAVELIN(new String[]{"1d6"},AttackTypes.PIERCING),
    LIGHT_HAMMER(new String[]{"1d4"},AttackTypes.BLUDGEONING),
    MACE(new String[]{"1d6"},AttackTypes.BLUDGEONING),
    QUATERSTAFF(new String[]{"1d6", "1d8"},AttackTypes.BLUDGEONING),
    SICKLE(new String[]{"1d4"},AttackTypes.SLASHING),
    SPEAR(new String[]{"1d6"},AttackTypes.PIERCING),
    //SIMPLE RANGED
    LIGHT_CROSSBOW(new String[]{"1d8"},AttackTypes.PIERCING),
    DART(new String[]{"1d4"},AttackTypes.PIERCING),
    SHORTBOW(new String[]{"1d6"},AttackTypes.PIERCING),
    SLING(new String[]{"1d4"},AttackTypes.BLUDGEONING),
    //Martial Melee Weapons
    BATTLEAXE(new String[]{"1d8"},AttackTypes.SLASHING),
    FLAIL(new String[]{"1d8"},AttackTypes.BLUDGEONING),
    GLAIVE(new String[]{"1d10"}, AttackTypes.SLASHING),
    GREATAXE(new String[]{"1d12"},AttackTypes.SLASHING),
    GREATSWORD(new String[]{"2d6"},AttackTypes.SLASHING),
    HALBERD(new String[]{"1d10"},AttackTypes.SLASHING),
    LANCE(new String[]{"1d12"},AttackTypes.PIERCING),
    LONGSWORD(new String[]{"1d8"},AttackTypes.SLASHING),
    MAUL(new String[]{"2d6"},AttackTypes.BLUDGEONING),
    MORNINGSTAR(new String[]{"1d8"},AttackTypes.PIERCING),
    PIKE(new String[]{"1d10"},AttackTypes.PIERCING),
    RAPIER(new String[]{"1d8"},AttackTypes.PIERCING),
    SCIMITAR(new String[]{"1d6"},AttackTypes.SLASHING),
    SHORTSWORD(new String[]{"1d6"},AttackTypes.PIERCING),
    TRIDENT(new String[]{"1d6"},AttackTypes.PIERCING),
    WAR_PICK(new String[]{"1d8"},AttackTypes.PIERCING),
    WARHAMMER(new String[]{"1d8"},AttackTypes.BLUDGEONING),
    WHIP(new String[]{"1d4"},AttackTypes.SLASHING),
    //Martial Ranged Weapon
    BLOWGUN(new String[]{"1"},AttackTypes.PIERCING),
    HAND_CROSSBOW(new String[]{"1d6"},AttackTypes.PIERCING),
    HEAVY_CROSSBOW(new String[]{"1d10"},AttackTypes.PIERCING),
    LONGBOW(new String[]{"1d8"},AttackTypes.PIERCING),
    NET(new String[]{"0"},AttackTypes.NULL);

    final String[] dice;
    final AttackTypes attackType;



    WeaponProficiancies(String[] dice, AttackTypes type) {
        this.dice = dice;
        this.attackType = type;
    }
}
enum AttackTypes{
    BLUDGEONING,
    PIERCING,
    SLASHING,
    NULL;
}
enum WeaponProperties{
    LIGHT,
    FINESSE,
    THROWN,
    TWO_HANDED,
    VERSATILE,
    AMMUNITION,
    LOADING,
    HEAVY,
    REACH,
    SPEACIAL;

    //final String description;

    /*
    WeaponProperties(String description){
        this.description = description;
    }

     */
}

