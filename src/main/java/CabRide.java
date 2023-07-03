public class CabRide {
    public static int baseFare = 40;
    private int distance;
    private int waitTime;
    //creating a parameterized constructor
    CabRide(int distance, int waitTime)throws Exception{
        if(distance>0 && waitTime>=0) {
            this.distance = distance;
            this.waitTime = waitTime;
        }
        else{
            throw new Exception("Invalid distance/wait time");
        }
    }
    public int getRideFare() {
        int calculatedFare = this.distance * 10 + this.waitTime * 2;
        calculatedFare = (calculatedFare<baseFare) ? baseFare : calculatedFare;
        return calculatedFare;
    }
}
