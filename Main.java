public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Mike Tyson",17,120,100,80);
        Fighter f2=new Fighter("Yuri Boyka",20,90,90,70);

        Match match=new Match(f1,f2,90,100);
        match.run();
    }
}
