package HW2.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkStation extends Laptop{
    private String videoCard;

    public WorkStation(){

    }

    public WorkStation(int CPUs, int RAM, double monitor, int weight, String videoCard) {
        super(CPUs, RAM, monitor, weight);
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "videoCard='" + videoCard + '\'' +
                "} " + super.toString();
    }
}