package Enum;

public enum Subject {
    MATH(1), PHYSICS(2), CHEMISTRY(3);

    private int idSubject;

    private Subject(int idSubject)
    {
        this.idSubject = idSubject;
    }

    public static Subject __getSubject(int id)
    {
        for (Subject i : Subject.values())
        {
            if (i.idSubject == id){
                return i;
            }
        }

        return null;
    }
}
