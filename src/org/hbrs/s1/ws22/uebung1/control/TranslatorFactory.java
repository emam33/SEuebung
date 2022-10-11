package org.hbrs.s1.ws22.uebung1.control;

import com.sun.java.accessibility.util.Translator;
import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;

public class TranslatorFactory {

        public static GermanTranslator createGermanTranslator() {
            GermanTranslator translator = new GermanTranslator();
            translator.setDate("10-10-2022");
            return translator;
        }
        public static Translator createEnglishTranslator() {
            return new EnglishTranslator();
        }

    }

}
