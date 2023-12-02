public class App {
    public static void main(String[] args) throws Exception {
        // Boucle "While"
        int pushUpGoal = 0;
        while(pushUpGoal > 0) {
            System.out.println ("Push up!");
            pushUpGoal -= 1;
        }

        /*  Boucle "do/while" 
        * Effectue au moin une fois la boucle 
        */
        int pushUpGoal1 = 0;
        do{
            System.out.println ("Push up!");
            pushUpGoal1 -= 1;
        } while (pushUpGoal1 > 0);
    }
}
