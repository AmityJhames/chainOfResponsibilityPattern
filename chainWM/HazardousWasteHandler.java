package chainWM;

public class HazardousWasteHandler implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleWaste(WasteContainer wasteContainer) {
        if(wasteContainer.getType().equalsIgnoreCase("hazardous")&& wasteContainer.isFull()){
            System.out.println("Hazardous waste is collected and disposed.");
        }else if (nextHandler != null){
            nextHandler.handleWaste(wasteContainer);
        }
    }
}
