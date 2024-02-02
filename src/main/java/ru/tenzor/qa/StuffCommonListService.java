package ru.tenzor.qa;


public class StuffCommonListService {
    private String currentName;


    public StuffCommonListService() {

    }


    public String getCurrentNameWithMinSymbolCorrectAuto() {
        return currentName;
    }

    public void setCurrentNameWithMinSymbolCorrectAuto(String currentName) {

        int nameWithMinSymbol = 2;
        if (currentName.length() <= nameWithMinSymbol) {
            currentName = null;
        }
        this.currentName = currentName;
    }


}
