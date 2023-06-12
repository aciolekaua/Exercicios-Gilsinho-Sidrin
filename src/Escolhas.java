import java.util.Scanner;

public class Escolhas {
    Scanner sc = new Scanner(System.in);

    int questao;
    String nome;    

public boolean escolher(int escolha) {

    double A,B,C,D,diferenca,vlrPrato,vlrBolsa,vlrVista,vlrParcela,vlrDividido,kg,result;

    switch (questao) {
        case 1:

            System.out.println("Digite a letra das questão (A,B,C,D,E)");
            String letra = sc.next();
            switch (letra) {
                case "A":
                
                    //Triangulo
                    System.out.println("Digite um valor para a base do triangulo");
                    A = sc.nextFloat();
                    System.out.println("Digite a altura do triangulo");
                    C = sc.nextFloat();
    
                    result = A * C / 2;
    
                    System.out.printf("O seu resultado é %.2f",result);
    
                    sc.close();
                    return true;
                case "B" :
                        //Raio do Circulo
                        System.out.println("Digite um valor para o Calcular o Raio");
                        C = sc.nextDouble();
                        
                        B = Math.PI;
                        result = Math.pow(B, C);
                
                        System.out.printf("O seu resultado é %.2f",result);
                    sc.close();
                    return true;
                case "C":
                        System.out.println("Digite o valor da base maior do trapezio");
                        A = sc.nextDouble();
                
                        System.out.println("Digite a base menor do trapezio");
                        B = sc.nextDouble();
                        
                        System.out.println("Diigte o valor da Altura");
                        C = sc.nextDouble();
                
                
                        result = (A + B) * C;
                        result = result / 2;
                
                        System.out.printf("A area do seu trapezio é %.2f",result);
                
                        sc.close();
                    return true;
                case "D":
                    System.out.println("Digite o valor para calcular a area do quadrado");
                    B = sc.nextDouble();
                    
                    result = B * B;
            
            
                    System.out.printf("A area do seu Quadrado é %.2f",result);
            
                    sc.close();
                return true;
                case "E":
                        System.out.println("Digite o valor da base do retangulo");
                        A = sc.nextDouble();
                
                        System.out.println("Digite o valor da altura do retangulo");
                        B = sc.nextDouble();
                        
                
                
                        result = (A * B);
                
                        System.out.printf("A area do seu retangulo é %.2f",result);
                
                        sc.close();
                    return true;
                default:
                    System.out.println("Opção Inválida");
                return false;
            }
        case 2:
                Peca p1 = new Peca();

                Peca p2 = new Peca();

                System.out.println("Digite o codigo da primeira Peça");
                p1.codigo = sc.nextInt();
        
                System.out.println("Digite a quantidade da primeira Peça");
                p1.qtd = sc.nextInt();
        
                System.out.println("Digite o valor da primeria peça");
                p1.valor = sc.nextDouble();
                
                p1.vlrUni();
                
                p1.resultado();
                
                System.out.println("Digite o codigo da segunda Peça");
                p2.codigo = sc.nextInt();

                System.out.println("Digite a quantidade da segunda Peça");
                p2.qtd = sc.nextInt();

                System.out.println("Digite o valor da segunda peça");
                p2.valor = sc.nextDouble();

                p2.vlrUni();

                p2.resultado();
        
                sc.close();

            return true;
        case 3:
            System.out.println("Calcular a difereça entre (A,B,C,D)");

            System.out.println("Digite o valor de A");
            A = sc.nextDouble();

            System.out.println("Digite o valor de B");
            B = sc.nextDouble();

            System.out.println("Digite o valor de C");
            C = sc.nextDouble();

            System.out.println("Digite o Valor de D");
            D = sc.nextDouble();

            diferenca = (A * B) - (C * D);

            System.out.printf("A diferença entre eles é %.2f",diferenca);
            return true;

        case 4:
            vlrPrato = 23.00;    

            System.out.println("Calcular quanto o cliente irá pagar no seu prato!!");

            System.out.println("Digite a kilograma do prato!!");
            kg = sc.nextDouble();

            result = vlrPrato * kg;

            System.out.printf("o valor final será $.2f",result);

            return true;

        case 5:
            System.out.println("Ola digite o seu nome!!");
            nome = sc.next();

            System.out.println("Olá "+nome+" insira o valor da sua Bolsa!!");
            vlrBolsa = sc.nextDouble();
            
            vlrVista = vlrBolsa * 0.90;

            vlrParcela = vlrBolsa / 2;

            vlrDividido = (vlrBolsa * 0.05) + vlrBolsa;

            vlrDividido = vlrDividido / 10;

            System.out.printf("Se pagar a vista vc pagará %.2f\n",vlrVista);

            System.out.printf("Se parcelado em duas vezes %.2f\n",vlrParcela);

            for (int i = 0; i <= 10; i++) {
                System.out.printf("Se dividido em 10 vezes %.2f\n",vlrDividido);
            }

            return true;
        default:
            System.out.println("Opção Inválida");
        }
        return false;
    }

    public int menu(){
        System.out.println("Digite o numero da questão que Deseja Acessar (1 a 5)");
        questao = sc.nextInt();
    
        return questao;
    }

}