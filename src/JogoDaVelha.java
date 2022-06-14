import java.util.Scanner;
public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int opcao;
        int venceu=0;
        String nome1, nome2;
        
        String[][] jogo = new String[3][3];
        valTab(jogo);

        System.out.println("-+-+-+-+-+-+- BEM VINDO -+-+-+-+-+-+-");
        System.out.println("-+-+-+-+-+- JOGO DA VELHA -+-+-+-+-+-\n");
        
        System.out.println("Digite o nome do JOGADOR 1: ");
        nome1 = x.nextLine();
        
        System.out.println("Digite o nome do JOGADOR 2: ");
        nome2 = x.nextLine();
        
            x = new Scanner(System.in);
            for(int i=1; i<=10; i++){
                if(i==10){
                    mostrarTab(jogo);
                    System.out.println("Empate! O jogo deu velha!");
                    System.exit(0);
                }
                if (i%2!=0) {
                    mostrarTab(jogo);
                    System.out.printf("\n\n");
                    
                    venceu = verificarHorizontalO(jogo);
                    if(venceu == 9){
                        System.out.println("Parabéns! "+nome2+" venceu!");
                        System.exit(0);
                    }
                    
                    venceu = verificarVerticalO(jogo);
                    if(venceu == 9){
                        System.out.println("Parabéns! "+nome2+" venceu!");
                        System.exit(0);
                    }
                    
                    venceu = verificarDiagonalO(jogo);
                    if(venceu == 9){
                        System.out.println("Parabéns! "+nome2+" venceu!");
                        System.exit(0);
                    }
                    System.out.println(nome1+" onde deseja colocar o X na tabela? [X]");
                    opcao = x.nextInt();
                    alocarXtabela(jogo, opcao);
                    

                }else if(i%2==0){
                    mostrarTab(jogo);
                    System.out.printf("\n\n");
                    
                    venceu = verificarHorizontalX(jogo);
                    if(venceu == 9){
                        System.out.println("Parabéns! "+nome1+" venceu!");
                        System.exit(0);
                    }
                    
                    venceu = verificarVerticalX(jogo);
                    if(venceu == 9){
                        System.out.println("Parabéns! "+nome1+" venceu!");
                        System.exit(0);
                    }
                    
                    venceu = verificarDiagonalX(jogo);
                    if(venceu == 9){
                        System.out.println("Parabéns! "+nome1+" venceu!");
                        System.exit(0);
                    }
                    System.out.println(nome2+" onde deseja colocar o O na tabela? [O]");
                    opcao = x.nextInt();
                    alocarOtabela(jogo, opcao);
                }
            }

    }
    
    public static void valTab(String[][] tab){
        tab[0][0] = "1";
        tab[0][1] = "2";
        tab[0][2] = "3";
        tab[1][0] = "4";
        tab[1][1] = "5";
        tab[1][2] = "6";
        tab[2][0] = "7";
        tab[2][1] = "8";
        tab[2][2] = "9";
    }
    
    public static void mostrarTab(String[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                
                if(tab[i][j]=="X"){
                    System.out.print("[ X ]  ");
                }else if(tab[i][j]=="O"){
                    System.out.print("[ O ]  ");
                }else if(tab[i][j]=="1"){
                    System.out.print("[ 1 ]  ");
                }else if(tab[i][j]=="2"){
                    System.out.print("[ 2 ]  ");
                }else if(tab[i][j]=="3"){
                    System.out.print("[ 3 ]  ");
                }else if(tab[i][j]=="4"){
                    System.out.print("[ 4 ]  ");
                }else if(tab[i][j]=="5"){
                    System.out.print("[ 5 ]  ");
                }else if(tab[i][j]=="6"){
                    System.out.print("[ 6 ]  ");
                }else if(tab[i][j]=="7"){
                    System.out.print("[ 7 ]  ");
                }else if(tab[i][j]=="8"){
                    System.out.print("[ 8 ]  ");
                }else if(tab[i][j]=="9"){
                    System.out.print("[ 9 ]  ");
                }
            }
            System.out.println();
        }
    }
    
    public static int verificarHorizontalX(String[][] tab){
        if((tab[0][0]=="X") & (tab[0][1]=="X") & (tab[0][2]=="X")){
            return 9;
        }else if((tab[1][0]=="X") & (tab[1][1]=="X") & (tab[1][2]=="X")){
            return 9;
        }else if((tab[2][0]=="X") & (tab[2][1]=="X") & (tab[2][2]=="X")){
            return 9;
        }else
        return 0;
    } 
    
    public static int verificarVerticalX(String[][] tab){
        if((tab[0][0]=="X") & (tab[1][0]=="X") & (tab[2][0]=="X")){
            return 9;
        }else if((tab[0][1]=="X") & (tab[1][1]=="X") & (tab[2][1]=="X")){
            return 9;
        }else if((tab[0][2]=="X") & (tab[1][2]=="X") & (tab[2][2]=="X")){
            return 9;
        }else
        return 0;
    } 

    public static int verificarDiagonalX(String[][] tab){
        if((tab[0][0]=="X") & (tab[1][1]=="X") & (tab[2][2]=="X")){
            return 9;
        }else if((tab[0][2]=="X") & (tab[1][1]=="X") & (tab[2][0]=="X")){
            return 9;
        }else
        return 0;
    }
    
    public static int verificarHorizontalO(String[][] tab){
        if((tab[0][0]=="O") & (tab[0][1]=="O") & (tab[0][2]=="O")){
            return 9;
        }else if((tab[1][0]=="O") & (tab[1][1]=="O") & (tab[1][2]=="O")){
            return 9;
        }else if((tab[2][0]=="O") & (tab[2][1]=="O") & (tab[2][2]=="O")){
            return 9;
        }else
        return 0;
    } 
    
    public static int verificarVerticalO(String[][] tab){
        if((tab[0][0]=="O") & (tab[1][0]=="O") & (tab[2][0]=="O")){
            return 9;
        }else if((tab[0][1]=="O") & (tab[1][1]=="O") & (tab[2][1]=="O")){
            return 9;
        }else if((tab[0][2]=="O") & (tab[1][2]=="O") & (tab[2][2]=="O")){
            return 9;
        }else
        return 0;
    }
    
    public static int verificarDiagonalO(String[][] tab){
        if((tab[0][0]=="O") & (tab[1][1]=="O") & (tab[2][2]=="O")){
            return 9;
        }else if((tab[0][2]=="O") & (tab[1][1]=="O") & (tab[2][0]=="O")){
            return 9;
        }else 
        return 0;
    }
    
    public static void alocarXtabela(String[][] tab, int opc){
        switch(opc){
            case 1:
                if(tab[0][0]=="1"){
                tab[0][0] = "X";
                break;
                }
            case 2:
                if(tab[0][1]=="2"){
                tab[0][1] = "X";
                break;
                }
            case 3:
                if(tab[0][2]=="3"){
                tab[0][2] = "X";
                break;
                }
            case 4:
                if(tab[1][0]=="4"){
                tab[1][0] = "X";
                break;
                }
            case 5:
                if(tab[1][1]=="5"){
                tab[1][1] = "X";
                break;
                }
            case 6:
                if(tab[1][2]=="6"){
                tab[1][2] = "X";
                break;
                }
            case 7:
                if(tab[2][0]=="7"){
                tab[2][0] = "X";
                break;
                }
            case 8:
                if(tab[2][1]=="8"){
                tab[2][1] = "X";
                break;
                }
            case 9:
                if(tab[2][2]=="9"){
                tab[2][2] = "X";
                break;
                }

        }

    }
    
    public static void alocarOtabela(String[][] tab, int opc){
        switch(opc){
            case 1:
                if(tab[0][0]=="1"){
                tab[0][0] = "O";
                break;
                }
            case 2:
                if(tab[0][1]=="2"){
                tab[0][1] = "O";
                break;
                }
            case 3:
                if(tab[0][2]=="3"){
                tab[0][2] = "O";
                break;
                }
            case 4:
                if(tab[1][0]=="4"){
                tab[1][0] = "O";
                break;
                }
            case 5:
                if(tab[1][1]=="5"){
                tab[1][1] = "O";
                break;
                }
            case 6:
                if(tab[1][2]=="6"){
                tab[1][2] = "O";
                break;
                }
            case 7:
                if(tab[2][0]=="7"){
                tab[2][0] = "O";
                break;
                }
            case 8:
                if(tab[2][1]=="8"){
                tab[2][1] = "O";
                break;
                }
            case 9:
                if(tab[2][2]=="9"){
                tab[2][2] = "O";
                break;
                }

        }

    }
}

