package Enum;

public enum Gender {
    MALE(0), FEMALE(1), BISEXUAL(2);

    private int idGender;

    private Gender(int idGender)
    {
        this.idGender = idGender;
    }

    public static Gender __getGender(int g)
    {
        for (Gender i : Gender.values())
        {
            if (i.idGender == g) {return i;}
        }
        return null;
    }
}
