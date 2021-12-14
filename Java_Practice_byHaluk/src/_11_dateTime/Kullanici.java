package _11_dateTime;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;
    public Kullanici(){// p'siz cons.
    }
    public Kullanici(String name, LocalDateTime kayitZamani) { //p'li fields li cons.
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}