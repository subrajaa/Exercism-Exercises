public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int cookedtime) {
        return 40 - cookedtime;
    }
    public int preparationTimeInMinutes(int layernumber) {
        return 2 * layernumber;
    }
    public int totalTimeInMinutes(int layernumber, int cookedtime) {
        return preparationTimeInMinutes(layernumber) + cookedtime;
    }
}
