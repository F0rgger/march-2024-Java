package HW2.task1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Geo {
    private String lat;
    private String lng;

    public Geo(String lng, String lat) {
        this.lng = lng;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}