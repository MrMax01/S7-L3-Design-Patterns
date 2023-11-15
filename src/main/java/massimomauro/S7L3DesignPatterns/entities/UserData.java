package massimomauro.S7L3DesignPatterns.entities;

public class UserData implements DataSource{
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds){
        nomeCompleto=ds.getNomeCompleto();
        eta = ds.getEta();
    }

    @Override
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    @Override
    public int getEta() {
        return this.eta;
    }
}
