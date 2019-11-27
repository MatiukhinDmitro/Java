package Lab3.example;

public enum Sex {
    MALE(1, "man", "мужчина", "чоловiк"),
    FEMALE(2, "women", "женщина", "жiнка");

    private int value;
    private String engName;
    private String rusName;
    private String ukrName;

    Sex(int value, String engName, String rusName, String ukrName) {
        this.value = value;
        this.engName = engName;
        this.rusName = rusName;
        this.ukrName = ukrName;
    }

    public String getVoice() {
        switch (this) {
            case MALE:
                return "EHEY";
            case FEMALE:
                return "AIYAY";
        }
        return "";
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }

    public String getUkrName() {
        return ukrName;
    }

    public void setUkrName(String ukrName) {
        this.ukrName = ukrName;
    }


}
