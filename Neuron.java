/**
 * Created by Lee on 9/18/2016.
 */
public class Neuron {
    private double value, activationThreshold;

    public void activate() {this.value = 1/(1 + Math.exp(-this.value));}
    public double getValue() {return value;}
    public double getActivationThreshold() {return activationThreshold;}
    public void setValue(double value) {this.value = value;}
    public void setActivationThreshold(double activationThreshold) {this.activationThreshold = activationThreshold;}
}
