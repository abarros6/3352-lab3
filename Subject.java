import java.util.ArrayList;

public abstract class Subject {
    public void attach(Observer o) {

    };

    public void detach(Observer o) {

    };

    public void notify(ArrayList<Observer> observers) {
        for (Observer o : observers) {
            o.update();
        }
    }
}
