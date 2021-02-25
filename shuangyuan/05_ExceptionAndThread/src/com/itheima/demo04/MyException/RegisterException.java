package com.itheima.demo04.MyException;

public class RegisterException extends RuntimeException/*Exception*/{
    public RegisterException(){
        super();
    }

    public RegisterException(String message){
        super(message);
    }
}
