package Operacoes;
import com.google.common.primitives.Booleans;
import java.text.DecimalFormat;

public class List {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("Ubuntus List");
        System.out.println("");

        String nome1 = "Rafael Silva";
        int age1 = 21;
        double peso1 = 55.02;
        float altura1 = 1.65F;
        boolean EhDev1 = true;
        double imcCalc1 = peso1/altura1;


        String nome2 = "Marco Santos";
        int age2 = 19;
        double peso2 = 99.00;
        float altura2 = 1.92F;
        boolean EhDev2 = false;
        double imcCalc2 = peso2/altura2;


        String nome3 = "Ricardo Silva";
        int age3 = 33;
        double peso3 = 80.05;
        float altura3 = 1.75F;
        boolean EhDev3 = true;
        double imcCalc3 = peso3/altura3;

        int sumAge = age1 + age2 + age3;
        boolean[] EhDevCount = { EhDev1, EhDev2, EhDev3 };
        String[] listName = { nome1, nome2, nome3 };

        System.out.println("A soma de todas as idades resulta em: "+ sumAge );

        System.out.println("Nomes: "+ nome1+ ", "+ nome2+ ", "+ nome3);
        System.out.println("");

        System.out.println("O IMC de "+ nome1+ " é: "+ df.format(imcCalc1));
        System.out.println("O IMC de "+ nome2+ " é: "+ df.format(imcCalc2));
        System.out.println("O IMC de "+ nome3+ " é: "+ df.format(imcCalc3));
        System.out.println("");

        System.out.println(Booleans.countTrue(EhDevCount)+ " Ubuntus são Devs.");
        System.out.println("");


        for (int i = 0; i < (listName.length); i++) {
            if(listName[(int) i].contains("Silva")){
                System.out.println(listName[(int) i]);
            }
        }

    }
}
