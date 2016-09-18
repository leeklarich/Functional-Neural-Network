import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lee on 9/18/2016.
 */
public class NeuronLayer {
    private List<Neuron> layer;

    public NeuronLayer(int size) {
        this.layer = new ArrayList<>(size + 1);
        this.layer.forEach(e -> e = new Neuron());
        this.layer.get(this.layer.size() - 1).setValue(1);
    }

    public void addNeuron(Neuron e) {
        this.layer.add(e);
    }

    public List<Neuron> getLayer() {return this.layer;}

    public void receive(double[] ins) {
        this.layer.subList(0, this.layer.size() - 1)
                .forEach(e -> e.setValue(ins[this.layer.indexOf(e)]));
    }
}
