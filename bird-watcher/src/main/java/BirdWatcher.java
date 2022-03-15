
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[] {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        if(this.birdsPerDay.length > 0) {
            return this.birdsPerDay[this.birdsPerDay.length - 1];
        }
        else {
            return 0; //No birds
        }
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int day: this.birdsPerDay) {
            if(day==0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int counter;
        counter = (numberOfDays > this.birdsPerDay.length)?this.birdsPerDay.length:numberOfDays;
        for(int i=0; i < counter; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int day: this.birdsPerDay) {
            if(day >= 5) {
                count++;
            }
        }
        return count;
    }
}
