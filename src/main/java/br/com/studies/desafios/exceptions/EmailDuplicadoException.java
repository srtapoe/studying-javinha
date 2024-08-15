package br.com.studies.desafios.exceptions;

public class EmailDuplicadoException  extends RuntimeException{
    public EmailDuplicadoException(String email){
        super("Erro: O email " + email + " ja foi cadastrado");
    }
}
