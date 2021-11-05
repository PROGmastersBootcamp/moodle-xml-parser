package com.progmasters.service.xmlParserDeps;

import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;

import java.io.IOException;
import java.io.Writer;

public class CdataCharacterEscapeHandler implements CharacterEscapeHandler {

    public CdataCharacterEscapeHandler() {
        super();
    }

    /**
     * @param ch       The array of characters.
     * @param start    The starting position.
     * @param length   The number of characters to use.
     * @param isAttVal true if this is an attribute value literal.
     */
    public void escape(char[] ch, int start, int length, boolean isAttVal, Writer writer) throws IOException {

        if (CDataAdapter.isCdata(new String(ch))) {
            writer.write(ch, start, length);
        } else {
            useStandardEscape(ch, start, length, isAttVal, writer);
        }
    }

    private void useStandardEscape(char[] ch, int start, int length, boolean isAttVal, Writer writer) throws IOException {
        CharacterEscapeHandler escapeHandler = StandardEscapeHandler.getInstance();
        escapeHandler.escape(ch, start, length, isAttVal, writer);
    }

    /**
     * A standard XML character escape handler
     *
     * @author coderleaf
     */
    private static final class StandardEscapeHandler implements CharacterEscapeHandler {

        private static StandardEscapeHandler instance;

        public static StandardEscapeHandler getInstance() {

            if (instance == null) {
                instance = new StandardEscapeHandler();
            }

            return instance;
        }

        private StandardEscapeHandler() {
            super();
        }

        public void escape(char[] ch, int start, int length, boolean isAttVal, Writer out) throws IOException {
            int limit = start + length;
            for (int i = start; i < limit; i++) {
                char c = ch[i];
                if (c == '&' || c == '>' || (c == '\"' && isAttVal) || (c == '\'' && isAttVal)) {
                    if (i != start) {
                        out.write(ch, start, i - start);
                    }
                    start = i + 1;
                    switch (ch[i]) {
                        case '&':
                            out.write("&amp;");
                            break;
                        case '>':
                            out.write("&gt;");
                            break;
                        case '\"':
                            out.write("&quot;");
                            break;
                        case '\'':
                            out.write("&apos;");
                            break;
                    }
                }
            }

            if (start != limit) {
                out.write(ch, start, limit - start);
            }
        }

    }

}
