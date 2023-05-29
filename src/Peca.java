public class Peca {
    int codigo;
    int qtd;
    double valor;
    double result;

    public void vlrUni(){
        for(int i = 0; i <= qtd; i++) {
            System.out.println("A peca de codigo "+codigo);
            System.out.printf("Tem o valor unitario de %.2f\n",valor);    
        }
    }

    public void resultado() {
        result = qtd * valor;
        System.out.printf("O valor a ser pago é %.2f\n",result);
    }
}
