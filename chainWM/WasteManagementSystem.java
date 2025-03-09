package chainWM;

public class WasteManagementSystem {
    public static void main(String[] args) {

        WasteHandlerChain wasteHandlerChain = new WasteHandlerChain();

        WasteContainer organicWaste = new WasteContainer("organic", 50, true);
        WasteContainer recyclableWaste = new WasteContainer("recyclable", 30, true);
        WasteContainer hazardousWaste = new WasteContainer("hazardous", 20, true);
        WasteContainer emptyContainer = new WasteContainer("organic", 50, false);

        wasteHandlerChain.processWaste(organicWaste);
        wasteHandlerChain.processWaste(recyclableWaste);
        wasteHandlerChain.processWaste(hazardousWaste);
        wasteHandlerChain.processWaste(emptyContainer);
    }
}