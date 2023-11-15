package massimomauro.S7L3DesignPatterns.entities.esercizioUno;

import java.util.Date;

public class InfoAdapter extends UserData{
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome().concat(info.getCognome());
    }

    @Override
    public int getEta() {
        Date today = new Date();
        today.setHours(0); today.setMinutes(0); today.setSeconds(0);
        return info.getDataDiNascita().getYear()- today.getYear();
    }
}
