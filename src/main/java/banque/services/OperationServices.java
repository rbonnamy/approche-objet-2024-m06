package banque.services;

import banque.entites.Operation;

public class OperationServices {

    public static double calculTotal(Operation[] operations){
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
        return somme;
    }
}
