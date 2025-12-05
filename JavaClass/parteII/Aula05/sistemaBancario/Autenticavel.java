package parteII.Aula05.sistemaBancario;
// INTERFACE
// Define um contrato: Quem implementar isso, OBRIGATORIAMENTE
// tem que saber se autenticar.
public interface Autenticavel {
    boolean autenticar(String senhaInput);
}
