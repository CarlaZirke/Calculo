import java.text.DecimalFormat;

public class Calculo {
    private String nome;
    private double salariobruto;


    private static final DecimalFormat df = new DecimalFormat("0.00");


    public double getSalariobruto() {
        return salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  Calculo(String nome, double salariobruto){
        this.nome=nome;
        this.salariobruto= salariobruto;

    }

    public double calcularINSS(){
        double valorfinalINSS = 0;

        if(salariobruto==1412){
           valorfinalINSS= ((salariobruto * 7.5)/100) ;

        }
        else if(salariobruto>1412.01 && salariobruto<=2666.68){
            valorfinalINSS=((salariobruto * 9)/100) ;

        }
        else if(salariobruto>2666.69 && salariobruto<=4003.03) {
            valorfinalINSS = ((salariobruto * 12) / 100);
        }
        else if(salariobruto>4000.04 && salariobruto<=7786.02){
            valorfinalINSS = ((salariobruto * 14) / 100);

        }
        return Double.parseDouble(df.format(valorfinalINSS));
    }

    public double calcularImpostorenda(){
        double valorfinalimpostorenda = 0;

        if(salariobruto==2112){
            valorfinalimpostorenda=0;
        }
        else if(salariobruto>2112.01 && salariobruto<=2826.66){
            valorfinalimpostorenda=((salariobruto * 7.5)/100);

        }
        else if(salariobruto>2826.66 && salariobruto<=3751.06) {
            valorfinalimpostorenda = ((salariobruto * 15) / 100);

        }
        else if(salariobruto>3751.06 && salariobruto<=4664.68){
            valorfinalimpostorenda = ((salariobruto * 22.5) / 100);

        }
        else if(salariobruto>4664.68){
            valorfinalimpostorenda = ((salariobruto * 27.5) / 100);

        }
        return Double.parseDouble(df.format(valorfinalimpostorenda));
    }

    public double calcularSalarioLiquido(){
        double inss = calcularINSS();
        double impostoRenda = calcularImpostorenda();
        double salarioLiquido = salariobruto - inss - impostoRenda;

        return Double.parseDouble(df.format(salarioLiquido));
    }

}


