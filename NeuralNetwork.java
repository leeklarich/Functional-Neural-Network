import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lee on 9/18/2016.
 */
public class NeuralNetwork {
    private List<NeuronLayer> nList;
    private List<TransportLayer> sList;
    private NeuronLayer inputLayer, outputLayer;

    public NeuralNetwork(int numberOfLayers, int numberOfInputs, int numberOfOutputs) {
        nList = new ArrayList<>(numberOfLayers);
        sList = new ArrayList<>(numberOfLayers - 1);
        inputLayer = new NeuronLayer(numberOfInputs);
        outputLayer = new NeuronLayer(numberOfOutputs);
        nList.add(inputLayer);
        for (int i = 1; i < numberOfLayers - 2; i++) {nList.add(new NeuronLayer(1));}
        nList.add(outputLayer);
        nList.stream()
                .filter(e -> nList.indexOf(e) % 2 != 0)
                .forEach(e ->sList.add(new TransportLayer(e, nList.get(nList.indexOf(e) + 1))));
    }

    public void think() {
        sList.forEach(e -> {
                    e.getConnections().forEach(Connection::pull);
                    e.getEnd().getLayer().forEach(Neuron::activate);
                });
    }

    public void train(double out) {
        think();
        //Oh fuck what have I gotten myself into...
    }
}
