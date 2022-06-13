import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(500,200);
    }

    @Test
    public void hasSheetsOfPaper(){
        assertEquals(500, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrintSomeSheets(){
        assertEquals("40 Sheets Printed", printer.print(4,10));
    }

    @Test
    public void hasRemainSheets(){
        printer.print(4,10);
        assertEquals(460, printer.getSheetsOfPaper());
    }

    @Test
    public void hasRemainToner(){
        printer.print(4,10);
        assertEquals(160, printer.getVolumeOfToner());
    }

    @Test
    public void hasNoEnoughToner(){
        assertEquals("Out of Toner", printer.print(10,21));
    }

    @Test
    public void canFillToner200Twice(){
        printer.fillToner();
        printer.fillToner();
        assertEquals(600,printer.getVolumeOfToner());
    }

    @Test
    public void canFillPaper200(){
        printer.fillPaper();
        assertEquals(700,printer.getSheetsOfPaper());
    }

    @Test
    public void hasNoEnoughPaper(){
        printer.fillToner();
        printer.fillToner();
        assertEquals("Out of Paper",printer.print(10,51));
    }

    @Test
    public void hasNoTonerAndPaper(){
        Printer newPrinter = new Printer(500,500);
        assertEquals("Check Paper and Toner", newPrinter.print(10,100));
    }

    @Test
    public void canPrintAfterRefillToner600AndPaper600(){
        Printer newPrinter = new Printer(500,500);
        newPrinter.fillToner();
        newPrinter.fillToner();
        newPrinter.fillToner();
        newPrinter.fillPaper();
        newPrinter.fillPaper();
        newPrinter.fillPaper();
        assertEquals("1000 Sheets Printed", newPrinter.print(10,100));
    }
}
