package com.teste.arquivo.propriedade;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Diego_Francisco
 *
 */
public class MessageProperties {

    private static final String MESSAGES_PROPERTIES = "com.teste.arquivo.message";
    private static final Locale ptBR = new Locale("pt", "BR");

    private static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_PROPERTIES, ptBR);

    public static String getMessage(String key) {
        return bundle.getString("error");
    }

}
