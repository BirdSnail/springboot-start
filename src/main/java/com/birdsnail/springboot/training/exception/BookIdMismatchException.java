package com.birdsnail.springboot.training.exception;

/**
 * @author BirdSnail
 * @date 2019/12/17
 */
public class BookIdMismatchException  extends RuntimeException{

    public BookIdMismatchException() {
        super();
    }

    public BookIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException(final String message) {
        super(message);
    }

    public BookIdMismatchException(final Throwable cause) {
        super(cause);
    }
}
