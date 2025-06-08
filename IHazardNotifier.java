interface IHazardNotifier {
    void notifyDanger(String message, String serialNumber);
}

class OverfillException extends RuntimeException {
    public OverfillException(String message) {
        super(message);
    }
}