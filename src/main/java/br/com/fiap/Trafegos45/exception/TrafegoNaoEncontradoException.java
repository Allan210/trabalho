package br.com.fiap.Trafegos45.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TrafegoNaoEncontradoException extends RuntimeException {
    public TrafegoNaoEncontradoException(String mensagem){ super(mensagem);}
}
