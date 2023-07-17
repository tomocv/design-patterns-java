package Implementations;

public class AdapterGbToEuSocket implements EuSocket {
    GbSocket gbSocket;

    public AdapterGbToEuSocket(GbSocket gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public String giveEuCurrent() {
        return gbSocket.giveGbCurrent() + " applying adapter and converting to EU socket";
    }
}
