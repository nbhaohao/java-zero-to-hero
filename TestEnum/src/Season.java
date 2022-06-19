enum SEASON_3 {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER,
}

enum SEASON_2 {
    SPRING("spring", "1"),
    SUMMER("summer", "2");

    private final String name;
    private final String desc;

    SEASON_2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(SEASON_3.SPRING);
    }
}

public class Season {
    public static final Season SPRING = new Season("spring", "1");
    public static final Season SUMMER = new Season("summer", "1");
    public static final Season AUTUMN = new Season("autumn", "1");
    public static final Season WINTER = new Season("winter", "1");

    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
