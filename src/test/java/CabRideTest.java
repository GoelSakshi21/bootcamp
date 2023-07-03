import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class CabRideTest {
    @Test
    @DisplayName("For distance -1KM and wait time 0 min should throws exception")
    public void calculateFareForDistanceNegative1AndWaitTime0(){
        assertThrows(Exception.class, () -> {
            //System.out.println("Invalid");
            CabRide fare = new CabRide(-1, 0);
        });
    }


    @Test
    @DisplayName("For distance 0KM and wait time -1 min should throws exception")
    public void calculateFareForDistance0AndWaitTimeNegative1(){
        assertThrows(Exception.class, () -> {
            CabRide fare = new CabRide(0, -1);
        });
    }

    @Test
    @DisplayName("For distance 1KM and wait time 0 min should be 40")
    public void calculateFareForDistance1AndWaitTime0(){
        try {
            CabRide fare = new CabRide(1, 0);
            int rideFare = fare.getRideFare();
            assertEquals(40, rideFare);
        }
        catch(Exception e){
            System.out.println("ERROR MESSAGE: "+ e.getMessage());
        }
    }

    @Test
    @DisplayName("For distance 0KM and wait time 1 min should throws exception")
    public void calculateFareForDistance0AndWaitTime1(){
        assertThrows(Exception.class, () -> {
            CabRide fare = new CabRide(0, 1);
        });
    }


    @Test
    @DisplayName("For distance 4KM and wait time 5 min the fare should be 50")
    public void calculateFareForDistance4AndWaitTime5(){
        try {
            CabRide fare = new CabRide(4, 5);
            int rideFare = fare.getRideFare();
            assertEquals(50, rideFare);
        }
        catch(Exception e){
            System.out.println("ERROR MESSAGE: "+ e.getMessage());
        }
    }

    @Test
    @DisplayName("For distance 3KM and wait time 2 min the fare should be 40" )
    public void calculateFareForDistance3AndWaitTime2(){
        try {
            CabRide fare = new CabRide(3, 2);
            int rideFare = fare.getRideFare();
            assertEquals(40, rideFare);
        }
        catch(Exception e){
            System.out.println("ERROR MESSAGE: "+ e.getMessage());
        }
    }

    @Test
    @DisplayName("For distance 10000KM and wait time 1000 min the fare should be 40" )
    public void calculateFareForDistance5000AndWaitTime1000(){
        try {
            CabRide fare = new CabRide(50000, 1000);
            int rideFare = fare.getRideFare();
            assertEquals(502000, rideFare);
        }
        catch(Exception e){
            System.out.println("ERROR MESSAGE: "+ e.getMessage());
        }
    }
}
//      5000,1000(out of bound)