package org.example.transferencia;

public class RunTransferencia {
    public static void main(String[] args) {
        TransferenciaBancaria t1 = new TransferenciaBancaria("12222", 20.0, false);
        TransferenciaBancaria t2 = new TransferenciaBancaria("882885", 30.0, false);

        System.out.println(" TRANSFERENCIA 01");
        t1.mostrarDetalle();

        System.out.println(" TRANSFERENCIA 02");
        t2.mostrarDetalle();
        t2.aplicarTransferencia();

        System.out.println(" LISTADO DE TODAS LAS  TRANSFERENCIAS ");
        TransferenciaBancaria[] transferencias = new TransferenciaBancaria[2];

        transferencias[0] = t1;
        transferencias[1] = t2;
        for (int i = 0; i < transferencias.length; i++) {
            transferencias[i].mostrarDetalle();
        }


    }
}
