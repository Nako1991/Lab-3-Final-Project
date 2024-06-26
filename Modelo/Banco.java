package Modelo;
import Interface.Generador;
import org.json.JSONObject;

public class Banco {

    protected String nombreBanco;
    protected String alias;
    protected String cvu;

    public Banco() {
        this.nombreBanco = "";
        this.alias = Generador.generarAlias();
        this.cvu = Generador.generarCVU();
    }

    public Banco(String banco) {
        this.nombreBanco = banco;
        this.alias = Generador.generarAlias();
        this.cvu = Generador.generarCVU();
    }

    public Banco(String banco, String alias) {
        this.nombreBanco = banco;
        this.alias = alias;
        this.cvu = Generador.generarCVU();
    }

    public Banco(String banco, String alias, String cvu) {
        this.nombreBanco = banco;
        this.alias = alias;
        this.cvu = cvu;
    }

    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }
    public String getCvu() { return cvu; }
    public void setCvu(String cvu) { this.cvu = cvu; }
    public String getNombreBanco() { return nombreBanco; } //
    public void setBanco(String banco) {  this.nombreBanco = banco; }

    @Override
    public String toString() {
        return  "BANCO" + "\n" +
                " Banco: " + nombreBanco + "\n" +
                " Alias: " + alias + "\n" +
                " CVU: " + cvu + "\n";
    }

    public JSONObject toJSON() {
        JSONObject jsonBanco = new JSONObject();
        jsonBanco.put("Banco", this.nombreBanco);
        jsonBanco.put("Alias", this.alias);
        jsonBanco.put("CVU", this.cvu);

        return jsonBanco;
    }

    public static Banco fromJSON(JSONObject bancoJSON) {
        return new Banco(
                bancoJSON.getString("Banco"),
                bancoJSON.getString("Alias"),
                bancoJSON.getString("CVU"));
    }
}
