import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int timeFly1 = t1.getTimeTo() - t1.getTimeFrom();
        int timeFly2 = t2.getTimeTo() - t2.getTimeFrom();

        if(timeFly1 < timeFly2){
            return -1;
        }
        if(timeFly1 > timeFly2){
            return 1;
        }
        return 0;
    }
}