package chainWM;

public class OrganicWasteHandler implements WasteHandler{
    private WasteHandler nextHandler;
    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleWaste(WasteContainer wasteContainer) {
        if(wasteContainer.getType().equalsIgnoreCase("organic")&& wasteContainer.isFull()) {
            System.out.println("Organic waste is collected and disposed.");
        } else if (nextHandler != null){
                nextHandler.handleWaste(wasteContainer);
        }
    }
}
