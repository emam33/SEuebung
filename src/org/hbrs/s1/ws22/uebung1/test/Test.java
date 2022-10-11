package org.hbrs.s1.ws22.uebung1.test;

import com.sun.java.accessibility.util.Translator;
import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;

public class Test {
    private Translator translator = null;
    private Client client = null;

    public Test() {
        translator = new GermanTranslator();
        client = new client();

        client.setTranslator(translator);
    }
    public void durchgang() { //hier die Äk.

        client.display(0); //muss man extra alleine betrachten
        client.display(-123);//negative Werte
        client.display(4);//zwischen 1 und 10
        client.display(123);//>10

    }
    public static void main(String[] args) {
        Test a = new Test();
        a.durchgang();
    }

}
