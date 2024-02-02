package ru.tenzor.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuffCommonListTest {
    StuffCommonListService name = new StuffCommonListService();

    @Test
    public void shouldGetCurrentNameBeforeAuto() {
        name.setCurrentNameWithMinSymbolCorrectAuto("И");
        name.setCurrentNameWithMinSymbolCorrectAuto("Ив");


        assertEquals(null, name.getCurrentNameWithMinSymbolCorrectAuto());

    }

    @Test
    public void shouldGetCurrentNameAfterAuto() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Ива");


        assertEquals("Ива", name.getCurrentNameWithMinSymbolCorrectAuto());

    }
    @Test
    public void shouldGetCurrentNameAfterAuto4Symbol() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иван");


        assertEquals("Иван", name.getCurrentNameWithMinSymbolCorrectAuto());

    }

    @Test
    public void shouldGetCurrentNameEnglishSymbol() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Ivanov Petr Sidorovich");
        assertEquals("Ivanov Petr Sidorovich", name.getCurrentNameWithMinSymbolCorrectAuto());
    }


    @Test
    public void shouldGetCurrentNameWithNumbers() {
        name.setCurrentNameWithMinSymbolCorrectAuto("123456 45 58");
        assertEquals("123456 45 58", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentNameWithNumbersAndEnglishSymbol() {
        name.setCurrentNameWithMinSymbolCorrectAuto("1234 4667 Erihrid");
        assertEquals("1234 4667 Erihrid", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentNameWithСapitalLetterAtTheEnd() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иванов ИваН Иванович");
        assertEquals("Иванов Иван Иванович", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentName() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иванов Иван Иванович");
        assertEquals("Иванов Иван Иванович", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentNameWithSymbolAmongNameOne() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Ива-нов Иван Ильвирович");
        assertEquals(null, name.getCurrentNameWithMinSymbolCorrectAuto());

    }

    @Test
    public void shouldGetCurrentNameWithDoubleNameEnglish() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Ivanov-Sidorov Ivan Sergeevich");
        assertEquals("Ivanov-Sidorov Ivan Sergeevich", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentNameWithDoubleName() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иванов Иван-Петр Иванович");
        assertEquals("Иванов Иван-Петр Иванович", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentNameWithDoubleSurname() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иванов-Смирнов Иван Иванович");
        assertEquals("Иванов-Смирнов Иван Иванович", name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test
    public void shouldGetCurrentNameWithDoubleSurnameWithoutDash() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иванов Смирнов Иван Иванович");
        assertEquals("Иванов Смирнов Иван Иванович", name.getCurrentNameWithMinSymbolCorrectAuto());


    }

    @Test
    public void shouldGetCurrentNameWithDoubleNameWithoutDash() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Балашова Татьяна Елена Евгеньевна");
        assertEquals("Балашова Татьяна Елена Евгеньевна", name.getCurrentNameWithMinSymbolCorrectAuto());


    }

    @Test
    public void shouldGetCurrentNameWithSpaceBeggin() {
        name.setCurrentNameWithMinSymbolCorrectAuto(" Балашова Татьяна Елена Евгеньевна");
        assertEquals("Балашова Татьяна Елена Евгеньевна", name.getCurrentNameWithMinSymbolCorrectAuto());


    }

    @Test
    public void shouldGetCurrentNameWithSpecialSymbol() {
        name.setCurrentNameWithMinSymbolCorrectAuto("??????");
        assertEquals(null, name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test

    public void shouldGetCurrentNameWithEmoji() {
        name.setCurrentNameWithMinSymbolCorrectAuto("U+D83D");
        assertEquals(null, name.getCurrentNameWithMinSymbolCorrectAuto());
    }

    @Test

    public void shouldGetCurrentNameWithHieroglyph() {
        name.setCurrentNameWithMinSymbolCorrectAuto("毛巾巾");
        assertEquals(null, name.getCurrentNameWithMinSymbolCorrectAuto());
    }
    @Test

    public void shouldGetCurrentNameOnlySurname() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Иванова");
        assertEquals("Иванова", name.getCurrentNameWithMinSymbolCorrectAuto());
    }
    @Test

    public void shouldGetCurrentNameOnlyName() {
        name.setCurrentNameWithMinSymbolCorrectAuto("Елена");
        assertEquals("Елена", name.getCurrentNameWithMinSymbolCorrectAuto());
    }
}



