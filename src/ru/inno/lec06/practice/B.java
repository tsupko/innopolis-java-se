package ru.inno.lec06.practice;

@Logging
public class B implements SomeDoer {
    @Override
    public void doSome() {
        System.out.println("Method doSome() in the class B");
    }
}
