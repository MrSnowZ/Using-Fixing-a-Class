public class Tester {
    
    public static void main(String[] args)
    {
        //code
        Student nick = new Student("Nick", 2023, 3.5);
        Student trevor = new Student("Trevor", 2023, 2.6);
        Student colin = new Student("Colin", 2023, 4.5);
        Student higgins = new Student("Higgins", 2024, 1.0);

        nick.setFailing();
        trevor.setFailing();
        colin.setFailing();
        higgins.setFailing();

        nick.gotAnF();
        trevor.gotAnF();
        higgins.gotGradesUp();

        System.out.println(nick);
        System.out.println(trevor);
        System.out.println(colin);
        System.out.println(higgins);
    }
}
