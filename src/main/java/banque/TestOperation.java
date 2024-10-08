package banque;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

import java.text.DecimalFormat;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0]=new Credit("01/10/2024", 150.5);
        operations[1]=new Debit("02/10/2024", 225.0);
        operations[2]=new Credit("03/10/2024", 178.6);
        operations[3]=new Debit("04/10/2024", 123.9);

        double somme=0.0;
        for (int i=0; i<operations.length; i++) {
            System.out.println(operations[i]);
            somme = operations[i].calculTotal(somme);

//            if (operations[i].getType().equals("CREDIT")){
//                somme += operations[i].getMontant();
//            }
//            else {
//                somme -= operations[i].getMontant();
//            }
        }
        DecimalFormat formateur = new DecimalFormat("#.00");
        String sommeFormatee = formateur.format(somme);
        System.out.println("La somme est égale à :"+sommeFormatee);
    }
}
