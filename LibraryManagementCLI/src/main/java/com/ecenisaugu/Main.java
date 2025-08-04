package com.ecenisaugu;

import org.jline.terminal.Attributes;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{

        Terminal terminal = TerminalBuilder.builder().system(true).build();

        //standart çıktı
        terminal.writer().println("Normal message!");

        //Hata çıktısı
        terminal.writer().println(terminal.getAttributes().getControlChar(Attributes.ControlChar.VERASE));
        terminal.writer().println("Error message!");

        //Formatlı çıktı
        terminal.writer().println("Hello %s!%n, World");

        terminal.flush();
        terminal.close();




    }
}