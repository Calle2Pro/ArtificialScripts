package artificialMiner.nodes;

import artificialMiner.artificialMiner;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.Calculations;
import org.shadowbot.bot.api.methods.data.Inventory;
import org.shadowbot.bot.api.methods.data.movement.Walking;
import org.shadowbot.bot.api.methods.interactive.Players;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;
import org.shadowbot.bot.api.wrapper.Player;

/**
 * User: Pen
 */
public class drop extends Job {
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
        if (!atMine() && !Inventory.isFull()) {
            while (Calculations.distanceTo(artificialMiner.mineTile) > Random.nextInt(4, 7)) {
                Walking.walkTo(artificialMiner.mineTile);
            }
        }
        for (int item = 0; item < 100; item++) {
            if (Inventory.contains(artificialMiner.drop))
                Inventory.dropAll(artificialMiner.drop);
            SleepTillThere();
        }
    }

    public void SleepTillThere() {
        for (int i = 0; i < 10 && Players.getLocal().isMoving(); i++, Time
                .sleep(300, 450))
            ;
    }
}