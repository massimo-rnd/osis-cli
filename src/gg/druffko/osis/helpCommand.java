package gg.druffko.osis;

public class helpCommand {

    public static void showHelp(){
        System.out.println("Here's a quick tutorial on how to use OSIS:");
        System.out.println("Enter a subnet (eg. '192.168.178') and press enter. OSIS shows all IP's it finds.");
        osis.launchScanner();
    }
}
