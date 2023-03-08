package org.example;

import org.example.Presenter.Presenter;
import org.example.View.View;
import org.example.View.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}