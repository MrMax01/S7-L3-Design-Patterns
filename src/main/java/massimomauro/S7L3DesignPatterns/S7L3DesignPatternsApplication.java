package massimomauro.S7L3DesignPatterns;

import massimomauro.S7L3DesignPatterns.entities.Info;
import massimomauro.S7L3DesignPatterns.entities.InfoAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class S7L3DesignPatternsApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(S7L3DesignPatternsApplication.class, args);
		/*ESERCIZIO 1*/
		Info max = new Info("Massimo", "Mauro", new Date(1995-03-11));
		InfoAdapter infoAdapter = new InfoAdapter(max);
		System.out.println(infoAdapter.getNomeCompleto());
		System.out.println(infoAdapter.getEta());
	}

}
