package br.ufjf.exceptions;

/*
 * autores:
    João Pedro Martins Cruz, 202365552C
    Júlia Zoffoli Caçador, 202365520B
    Robert Gonçalves Vieira de Souza, 202365505B
 */

public class ReviewsException extends Exception {

    public ReviewsException(String message) {
        super("ERRO AVALIAÇÃO: " + message);
    }
}
