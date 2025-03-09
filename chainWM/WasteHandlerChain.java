package chainWM;

public class WasteHandlerChain {
    private WasteHandler nextChain;

    public WasteHandlerChain() {

        WasteHandler organicHandler = new OrganicWasteHandler();
        WasteHandler recyclableHandler = new RecyclableWasteHandler();
        WasteHandler hazardousHandler = new HazardousWasteHandler();


        organicHandler.setNextHandler(recyclableHandler);
        recyclableHandler.setNextHandler(hazardousHandler);

        this.nextChain = organicHandler;
    }

    public void processWaste(WasteContainer wasteContainer) {
        nextChain.handleWaste(wasteContainer);
    }
}