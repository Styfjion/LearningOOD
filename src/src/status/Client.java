package status;

import status.model.TrafficLight;

public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight =  new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
    }
}
