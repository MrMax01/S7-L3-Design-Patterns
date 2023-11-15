package massimomauro.S7L3DesignPatterns.entities.esercizioUno;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

}
