package ru.tenzor.qa;


public class StuffCommonListService {
    private String currentName;


    public StuffCommonListService() {

    }

    public String getCurrentName() {
        return currentName;
    }


    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getCurrentNameWithMinSymbol() {
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
