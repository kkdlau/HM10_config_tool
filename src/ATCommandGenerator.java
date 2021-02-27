/**
 * AT Command Generator.
 * <p>
 * This class is designed to provide helper functions for generating AT commands.
 * The functions can be categorized into two - inquiry and update.
 * <p>
 * Inquiry:
 * Names of inquiry function usually start with getXXX.
 * For example: getBaudRate().
 * <p>
 * Update:
 * Names of configuration function usually start with setXXX.
 * For example: setBaudRate().
 */
public class ATCommandGenerator {
    static final String BAUD_RATE_CMD = "AT+BAUD";

    static String getBaudRate() {
        return BAUD_RATE_CMD + "?";
    }

    static String setBaudRate(final int baudRate) {
        switch (baudRate) {
            case 9600:
                return BAUD_RATE_CMD + "0";
            case 19200:
                return BAUD_RATE_CMD + "1";
            case 38400:
                return BAUD_RATE_CMD + "2";
            case 57600:
                return BAUD_RATE_CMD + "3";
            case 115200:
                return BAUD_RATE_CMD + "4";
            case 4800:
                return BAUD_RATE_CMD + "5";
            case 2400:
                return BAUD_RATE_CMD + "6";
            case 1200:
                return BAUD_RATE_CMD + "7";
            case 230400:
                return BAUD_RATE_CMD + "8";
        }

        return null;
    }
}
