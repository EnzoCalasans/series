package br.com.enzo.series.service;

import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class ConsultaChatGpt {
    public static String obterTraducao(String texto) {

        return Translator.translate(Language.ENGLISH, Language.PORTUGUESE, texto);
    }
}