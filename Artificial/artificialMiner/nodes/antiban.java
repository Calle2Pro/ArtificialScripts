package artificialMiner.nodes;

import artificialMiner.artificialMiner;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.movement.Camera;
import org.shadowbot.bot.api.methods.input.Keyboard;
import org.shadowbot.bot.api.methods.input.Mouse;
import org.shadowbot.bot.api.methods.interactive.Players;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;
import org.shadowbot.bot.api.wrapper.Player;

/**
 * User: Pen
 */
public class antiban extends Job {

    Player p = Players.getLocal();

    @Override
    public void run() {
        int Option = Random.nextInt(1, 10);
        int mouseSpeed = Random.nextInt(1, 4);
        switch (Option) {
            case 1:
                break;
            case 2:
                int cameraAngel = Random.nextInt(0, 360);
                Camera.setAngel(cameraAngel);
                break;
            case 3:
                break;
            case 4:
                Mouse.setSpeed(Random.nextInt(6, 10));
                break;
            case 5:
                break;
            case 6:
                if (p.getSpokenMessage().contains("You there?")) {
                    Keyboard.sendText("Mommy Told me not to speak to Noobs.", true);
                }
                break;
            case 7:
                Keyboard.sendText("What the Hell broke it again -.-", true);
                break;
            case 8:
                Mouse.move(124, 241);
                Time.sleep(Random.nextInt(92, 148));
                Mouse.move(191, 281);
                break;
            case 9:
                // TODO: THIS IS TO BE DELETED, I MADE IT FOR FUN WHILE TESTING
                if (p.getSpokenMessage().equals("chickychicky")) {
                    Keyboard.sendText("I AM THE BEST :)", true);
                    // Mouse.move(10, 200); <- Randomizing it :/
                }
                break;
            case 10:
                if (mouseSpeed == 1) {
                    Mouse.setSpeed(Random.nextInt(5, 8));
                }
                if (mouseSpeed == 2) {
                    Mouse.setSpeed(Random.nextInt(7, 10));
                }
                break;

        }
    }

    @Override
    public boolean isActive() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
