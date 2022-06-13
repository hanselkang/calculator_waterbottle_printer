public class Printer {
    private int paper;
    private int toner;

    public Printer(int sheetsOfPaper, int volumeToner) {
        paper = sheetsOfPaper;
        toner = volumeToner;
    }

    public int getSheetsOfPaper() {
        return paper;
    }

    public int getVolumeOfToner() {
        return toner;
    }

    public void fillToner() {
        toner += 200;
    }

    public void fillPaper() {
        paper += 200;
    }


    public String print(int copies, int pages) {
        int totalCopies = copies * pages;
        if (totalCopies <= paper && totalCopies <= toner) {
            paper -= totalCopies;
            toner -= totalCopies;
            return totalCopies + " Sheets Printed";
        }
        if (totalCopies > paper && totalCopies <= toner) {
            return "Out of Paper";
        }
        if (totalCopies > toner && totalCopies <= paper) {
            return "Out of Toner";
        } else {
            return "Check Paper and Toner";
        }
    }

}

