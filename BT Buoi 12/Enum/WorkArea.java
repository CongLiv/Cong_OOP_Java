package Enum;

public enum WorkArea {
    INDOOR(1), OUTDOOR(2);

    private int idArea;

    private WorkArea(int idArea)
    {
        this.idArea = idArea;
    }

    public static WorkArea __getWorkArea(int area){
        for (WorkArea i : WorkArea.values())
        {
            if (i.idArea== area) return i;
        }

        return null;
    }
   
}
