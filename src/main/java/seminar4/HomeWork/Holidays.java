package seminar4.HomeWork;

public enum Holidays {

    MART8("C 8 марта!"),
    NEWYEAR("С Новым Годом!"),
    NOHOLIDAYS("Нет сегодня праздника :("),
    FEBRUARY23("С Днем Защитника Отечества!"),
    BIRTHDAY("С Днем Рождения!");
    private String name;

    Holidays(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
