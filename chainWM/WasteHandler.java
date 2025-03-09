package chainWM;

public interface WasteHandler {
    void setNextHandler(WasteHandler nextHandler);
    void handleWaste(WasteContainer wasteContainer);
}