/**
 * Created by Lee on 9/18/2016.
 */
public class Connection {
    private double weight;
    private Neuron start, end;

    public Connection(Neuron a, Neuron b) {
        this.start = a;
        this.end = b;
        this.weight = 2 * Math.random() - 1;
    }

    public void pull() {
        this.end.setValue(this.end.getValue() + this.start.getValue() * this.weight);
    }

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    public Neuron getStart() {return start;}
    public void setStart(Neuron start) {this.start = start;}
    public Neuron getEnd() {return end;}
    public void setEnd(Neuron end) {this.end = end;}
}
