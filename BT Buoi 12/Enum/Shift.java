package Enum;

public enum Shift {
    MORNING(1), AFTERNOON(2), EVENING(3);

    private int idShift;

    private Shift(int idShift)
    {
        this.idShift = idShift;
    }

    public static Shift __getShift(int sft){
        for (Shift i : Shift.values())
        {
            if (i.idShift == sft) return i;
        }

        return null;
    }
}
