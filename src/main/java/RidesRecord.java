import java.util.ArrayList;
import java.util.List;

public class RidesRecord {

    private List rides;

    public RidesRecord(){
        this.rides = new ArrayList<Integer>();
    }

//    public RidesRecord(int rideFare) {
//
//        this.rides.add(rideFare);
//    }

    public List<Integer> getRides(){
        return this.rides;
    }
}
