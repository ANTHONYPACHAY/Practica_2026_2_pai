package org.example.transferencia;

public class TransferenciaBancaria {
    // atributos
    private String cuentaDestino;
    private double monto;
    private boolean esExitosa;

    // constructores
    public TransferenciaBancaria(String cuentaDestino,
                                 double monto,
                                 boolean esExitosa) {
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.esExitosa = esExitosa;
    }
    public TransferenciaBancaria(String cuentaDestino,
                                 double monto) {
        this(cuentaDestino, monto, false);
    }
    public TransferenciaBancaria() {
        this( "0000-0000", 0.0, false);
    }

    public void aplicarTransferencia() {
        if (this.monto > 0) {
            this.esExitosa = true;
            System.out.println(" Traferencia de $" + this.monto
                    + " enviada a " + this.cuentaDestino);
        } else {
            this.esExitosa = false;
            System.out.println("ERROR: El monto a transferir debe ser mayor a 0");
        }
    }

    public void mostrarDetalle() {
        System.out.println("Cuenta Destino: " + this.cuentaDestino);
        System.out.println("Monto: " + this.monto);
        System.out.println("Mayor a 0: " + (this.monto > 25 ? "Todo ok" : "Todo mal"));
        System.out.println("Es Exitosa: " + (this.esExitosa ? "Completada" : "Pendiente"));

    }
}
