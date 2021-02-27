import com.fazecast.jSerialComm.*;

public class HM10ConfigTool {
    public static void main(String[] args) {
        final SerialPort ports[] = SerialPort.getCommPorts();
        for (SerialPort p: ports) {
            System.out.println(p.getDescriptivePortName());
        }
    }
}
