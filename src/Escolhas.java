import java.util.Scanner;

public class Escolhas {
    Scanner sc = new Scanner(System.in);

    int questao;    

    public boolean escolher(int escolha) {

        double A,B,C,result;

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
