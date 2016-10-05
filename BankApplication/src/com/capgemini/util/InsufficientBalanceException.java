package com.capgemini.util;

public class InsufficientBalanceException extends Exception {
public InsufficientBalanceException(){
	super("Amoumt is not sufficient");
}
}
