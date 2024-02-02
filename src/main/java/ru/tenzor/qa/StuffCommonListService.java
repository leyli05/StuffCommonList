package ru.tenzor.qa;


public class StuffCommonListService {
    private String currentName;


    public StuffCommonListService() {

    }


    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getCurrentNameWithMinSymbolCorrectAuto() {
        return currentName;
    }

    public void setCurrentNameWithMinSymbol(String currentName) {

        int nameWithMinSymbol = 2;
        if (currentName.length() <= nameWithMinSymbol) {
            currentName = null;
        }
        this.currentName = currentName;
    }


}
