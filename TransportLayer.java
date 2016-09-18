import java.util.List;

/**
 * Created by Lee on 9/18/2016.
 */
public class TransportLayer {
    private List<Connection> connections;
    private NeuronLayer start, end;

    public TransportLayer(NeuronLayer start, NeuronLayer end) {
        this.start = start;
        this.end = end;

        start.getLayer().forEach(
                e -> end.getLayer().forEach(
                        x -> this.connections.add(new Connection(e, x))));
    }

    public List<Connection> getConnections() {return this.connections;}
    public NeuronLayer getEnd() {return this.end;}
}
