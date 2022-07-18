public class Calculadora implements Botoes{
    private boolean ligada;
    private int a=15, b=23, soma, subtra, multi, div;


    public Calculadora(){
        ligada=false;
    }


    private boolean getLigada(){
        return ligada;
    }
    private int getSoma(){
        return soma;
    }
    private int getSubtra(){
        return subtra;
    }
    private int getMulti(){
        return multi;
    }
    private int getDivi(){
        return div;
    }


    private void setLigada(boolean l){
        ligada=l;
    }
    private void setSoma(int soma){
        this.soma=soma;
    }
    private void setSubtra(int subtra){
        this.subtra=subtra;
    }
    private void setMulti(int multi){
        this.multi=multi;
    }
    private void setDivi(int div){
        this.div=div;
    }


    @Override
    public void ligar() {
        setLigada(true);
        System.out.println("Ligando...");
    }
    @Override
    public void desligar() {
        setLigada(false);
        System.out.println("Desligando...");        
    }
    @Override
    public void somar() {  
        if(getLigada()){
            setSoma(soma=a+b);
            System.out.println("A soma dos valores é: "+getSoma());
        }else{
            System.out.println("Impossivel Calcular!");
        }
    }
    @Override
    public void subtrair(){
        if(getLigada()){
            setSubtra(subtra=a-b);   
            System.out.println("A subtração dos valores é: "+getSubtra());
        }else{
            System.out.println("Impossível calcular!");
        }
    }
    @Override
    public void multiplicar() {
        if(getLigada()){
            setMulti(multi=a*b);
            System.out.println("A multiplicação dos valores é: "+getMulti()); 
        }else{
            System.out.println("Impossível calcular!");
        }       
    }
    @Override
    public void dividir() {
        if(getLigada()){
            setDivi(div=a/b);
            System.out.println("A divisão dos valores é: "+getDivi());
        }else{
            System.out.println("Impossível calcular!");
        }
    }
    
}