package com.Teggatz.CharacterTraits.Enums;

public enum Alignments {
    //good     neutral     evil
    LG("lawful good"), NG("neutral good"), CG("chaotic good"),
    LN("lawful neutral"), TN("true neutral"), CN("chaotic neutral"),
    LE("lawful evil"), NE("neutral evil"), CE("chaotic evil");

    private final String fullName;

    Alignments(String fullName) {
        this.fullName = fullName;
    }
}
