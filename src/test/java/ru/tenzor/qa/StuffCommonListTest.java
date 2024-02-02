package ru.tenzor.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuffCommonListTest {
    StuffCommonListService name = new StuffCommonListService();

    @Test
    public void shouldGetCurrentNameBeforeAuto() {
        name.setCurrentNameWithMinSymbol("И");
        name.setCurrentNameWithMinSymbol("Ив");


        assertEquals(null, name.getCurrentNameWithMinSymbol());

    }

    @Test
    public void shouldGetCurrentNameAfterAuto() {
        name.setCurrentNameWithMinSymbol("Ива");


        assertEquals("Ива", name.getCurrentNameWithMinSymbol());

    }

    @Test
    public void shouldGetCurrentNameEnglishSymbol() {
        name.setCurrentName("Ivanov Petr Sidorovich");
        assertEquals("Ivanov Petr Sidorovich", name.getCurrentName());
    }


    @Test
    public void shouldGetCurrentNameWithNumbers() {
        name.setCurrentName("123456 45 58");
        assertEquals("123456 45 58", name.getCurrentName());
    }

    @Test
    public void shouldGetCurrentNameWithNumbersAndEnglishSymbol() {
        name.setCurrentName("1234 4667 Erihrid");
        assertEquals("1234 4667 Erihrid", name.getCurrentName());
    }

    @Test
    public void shouldGetCurrentNameWithСapitalLetterAtTheEnd() {
        name.setCurrentName("Иванов ИваН Иванович");
        assertEquals("Иванов Иван Иванович", name.getCurrentName());
    }
    @Test
    public void shouldGetCurrentName() {
        name.setCurrentName("Иванов Иван Иванович");
        assertEquals("Иванов Иван Иванович", name.getCurrentName());
    }

    @Test
    public void shouldGetCurrentNameWithSymbolAmongNameOne() {
        name.setCurrentName("Ива-нов Иван Ильвирович");
        assertEquals(null, name.getCurrentName());

    }

    @Test
    public void shouldGetCurrentNameWithDoubleNameEnglish() {
        name.setCurrentName("Ivanov-Sidorov Ivan Sergeevich");
        assertEquals("Ivanov-Sidorov Ivan Sergeevich", name.getCurrentName());
    }

    @Test
    public void shouldGetCurrentNameWithDoubleName() {
        name.setCurrentName("Иванов Иван-Петр Иванович");
        assertEquals("Иванов Иван-Петр Иванович", name.getCurrentName());
    }

    @Test
    public void shouldGetCurrentNameWithDoubleSurname() {
        name.setCurrentName("Иванов-Смирнов Иван Иванович");
        assertEquals("Иванов-Смирнов Иван Иванович", name.getCurrentName());
    }

    @Test
    public void shouldGetCurrentNameWithDoubleSurnameWithoutDash() {
        name.setCurrentName("Иванов Смирнов Иван Иванович");
        assertEquals("Иванов Смирнов Иван Иванович", name.getCurrentName());


    }

    @Test
    public void shouldGetCurrentNameWithDoubleNameWithoutDash() {
        name.setCurrentName("Балашова Татьяна Елена Евгеньевна");
        assertEquals("Балашова Татьяна Елена Евгеньевна", name.getCurrentName());


    }

    @Test
    public void shouldGetCurrentNameWithSpaceBeggin() {
        name.setCurrentName(" Балашова Татьяна Елена Евгеньевна");
        assertEquals("Балашова Татьяна Елена Евгеньевна", name.getCurrentName());


    }

    @Test
    public void shouldGetCurrentNameWithSpecialSymbol() {
        name.setCurrentName("??????");
        assertEquals(null, name.getCurrentName());
    }

    @Test

    public void shouldGetCurrentNameWithEmoji() {
        name.setCurrentName("U+D83D");
        assertEquals(null, name.getCurrentName());
    }
}



