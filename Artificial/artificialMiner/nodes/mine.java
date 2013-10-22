package artificialMiner.nodes;

import artificialMiner.artificialMiner;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.Inventory;
import org.shadowbot.bot.api.methods.interactive.GameEntities;
import org.shadowbot.bot.api.methods.interactive.Players;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;
import org.shadowbot.bot.api.wrapper.GameObject;
import org.shadowbot.bot.api.wrapper.Player;

/**
 * User: Pen
 */
public class mine extends Job {

    Player p = Players.getLocal();

    public boolean atMine() {
        return artificialMiner.mineArea.contains(p.getLocation());
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public void run() {
        if (atMine() && !Inventory.isFull()) {
            Player player = Players.getLocal();
            GameObject rock = GameEntities.getNearest(artificialMiner.toMine);
            if (rock != null) {
                if (rock.isOnScreen()) {
                    if (!player.isMoving()) {
                        rock.interact("Mine");
                        Time.sleep(Random.nextInt(200, 400));
                    }
                }
            }
        }

    }
}