import java.util.Collections;

public enum Countries {
    CHINA("CH",222),AUSTRILA("AST",23),USA("US",412), JAPAN("JP",111);



    private String name;
    private int code;

    Countries(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public static Countries getCountry(String name){
        if (!Countries.valueOf(name).name.isEmpty()) {
            return Enum.valueOf(Countries.class,Countries.valueOf(name).name);
        }else {
            return null;
        }

    }
    public static Countries getContryByCode(int code) {
        Countries[] values = Countries.values();
        Countries cc = null;
        for (int i = 0; i < values.length; i++) {
            if (values[i].code == code) {
                cc = values[i];
            }
        }
        return cc;
    }

    //todo get  name by code

}