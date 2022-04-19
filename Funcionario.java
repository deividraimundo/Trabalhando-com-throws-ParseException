
package aula8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    private String nome;
    private int cpf;
    private int rg;
    private Date dataNascimento;
    private String resultado;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCpf(){
        return this.cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public int getRg(){
        return this.rg;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) throws ParseException{
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date dataConvert = formato.parse(dataNascimento);
    this.dataNascimento = dataConvert;
    }
    
    public String resultado(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return "O cliente tem nome: " + getNome() + " CPF: " + getCpf() + " RG:" + getRg() + " data de nascimento:" + formato.format(getDataNascimento());
    }
}
