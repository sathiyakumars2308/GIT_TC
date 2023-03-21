public enum SampleEnum {

    MONDAY("dayOne","monday"),
    TUESDAY("dayTwo","Tuesday"),
    WEDNESDAY("dayThree","Wednesday"),
    THURSDAY("dayFour","Thursday"),
    FRIDAY("dayFive","Friday"),
    SATURDAY("daySix","Saturday"),
    SUNDAY("daySeven","Sunday");

    private String day;
    private String weekDay;
    SampleEnum(String day,String weekDay)
    {
        this.day=day;
        this.weekDay=weekDay;
    }

    public String getDay(){
        return this.day;
    }

    public String getWeekDay(){
        return this.weekDay;
    }
}
