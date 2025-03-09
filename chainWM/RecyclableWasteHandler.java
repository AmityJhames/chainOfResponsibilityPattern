package chainWM;

public class RecyclableWasteHandler implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleWaste(WasteContainer wasteContainer) {
        if (wasteContainer.getType().equalsIgnoreCase("recyclable") && wasteContainer.isFull()) {
            System.out.println("Recyclable waste collected and processed.");
        } else if (nextHandler != null) {
            nextHandler.handleWaste(wasteContainer);
        }
    }
}
