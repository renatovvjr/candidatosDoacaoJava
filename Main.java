import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //O programa receberá informações de 10 candidatos à doação de sangue. O programa deverá ler a idade e informar a seguinte condição: 
    //- Se menor de 16 ou acima de 69 anos, não poderá doar;
    //- Se tiver entre 16 e 17 anos, somente poderá doar se estiver acompanhado dos pais ou responsáveis (neste caso criar uma condição: "Está acompanhado de pais ou responsável: 1-sim ou 2-não);
    //- Se  tiver entre 18 e 69 anos, poderá doar.

    //Ao final o programa deverá mostrar quantos candidatos poderão doar sangue. 

    Scanner sc = new Scanner(System.in); 
    int idade=0, doadorMenorIdoso=0, doadorAdolescente=0, doadorAdulto=0;
    int simNao, podeDoar, naoPodeDoar, adolescente=0;

    for(int i=0; i<10; i++){
      System.out.println("Informe a idade do candidado à doação: ");idade = sc.nextInt();

      if(idade<16 || idade >69){
        doadorMenorIdoso++;
      }else if(idade>=16 && idade <= 17){
        System.out.println("Está acompanhado de pais ou responsável? Digite [1 - SIM] ou [2 - NÃO]");
        simNao = sc.nextInt();
        if(simNao==1){
          doadorAdolescente++;
        }else{
          adolescente++;
        }
      }else{
        doadorAdulto++;
      }
    }
    naoPodeDoar=doadorMenorIdoso+adolescente;
    podeDoar=doadorAdolescente+doadorAdulto;

    System.out.println(naoPodeDoar+" candidatos não atenderam aos critérios para doação de sangue.");
    System.out.println(podeDoar+" candidatos atenderam aos critérios para doação de sangue e poderão doar.");
  }
}