import com.fazecast.jSerialComm.SerialPort;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

class InitilizationTask implements Runnable {

    private SerialPort nativePort;
    private boolean inited;

    InitilizationTask(SerialPort port) {
        inited = false;
        nativePort = port;
    }

    @Override
    public void run() {
        inited = nativePort.openPort(200);
    }

    public boolean isInited() {
        return inited;
    }
}

public class UARTPort {
    static final int possibleBaudRate[] = {9600, 19200, 38400, 57600, 115200, 4800, 2400, 1200, 230400};
    SerialPort nativePort;

    /**
     * @param port port to connect with.
     */
    UARTPort(SerialPort port) {
        nativePort = port;
    }

}
