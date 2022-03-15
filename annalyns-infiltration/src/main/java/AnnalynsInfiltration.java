class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
       // Fast attack can be made if knight is not awake
       if(knightIsAwake) {
           return false;
       }
       else {
           return true;
       }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // You can spy only if one of them is awake
        if(knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // You can signal only if prisoner is awake and archer is not awake
        if(prisonerIsAwake && !archerIsAwake) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        /*
            You can free prisoner under these conditions
            1. Annalyn has her pet dog
                a. Archer must be asleep
            2. Annalyn does not have dog
                a. Prisoner awake, knight and archer not awake
        */
        if(petDogIsPresent) {
            if(!archerIsAwake) {
                return true;
            }
        }
        else if(prisonerIsAwake && !archerIsAwake && !knightIsAwake) {
                return true;
        }
        return false;
    }
}
