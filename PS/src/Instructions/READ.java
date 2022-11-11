package Instructions;

import Main.Instruction;
import Main.Memory;
import javax.swing.JTextPane;

public class READ implements Instruction {

    Integer op = 12, numberOpd = 1;
    EndType end;
    String opcode = "0000000000001100";

    @Override
    public void runInstruction(JTextPane inOutCode, Integer opd1, Integer opd2) {
        if (opd2 != null) {
            Main.IO.showError("o read possui um argumento a mais");
            return;
        }
        String data = Main.IO.read();
        System.out.println("conteudo - "+data +" "+opd1);
        Memory.memorySet(opd1,Integer.parseInt(data));
        return;

        //opd1 = inOutCode.getText();
    }

    @Override
    public int numberOpd() {
        return numberOpd;
    }

    @Override
    public void setEndType(EndType end) {
        this.end = end;
    }

    @Override
    public EndType getEndType() {
        return this.end;
    }
}
