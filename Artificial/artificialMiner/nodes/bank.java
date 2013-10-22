package artificialMiner.nodes;

import artificialMiner.artificialMiner;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.Bank;
import org.shadowbot.bot.api.methods.data.Calculations;
import org.shadowbot.bot.api.methods.data.Inventory;
import org.shadowbot.bot.api.methods.data.movement.Walking;
import org.shadowbot.bot.api.methods.interactive.Players;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;
import org.shadowbot.bot.api.wrapper.Player;

import static artificialMiner.artificialMiner.bankTile;
import static artificialMiner.artificialMiner.drop;

/**
 * User: Pen
 */
public class bank extends Job {
    Player p = Players.getLocal();

    public boolean atBank() {
        return artificialMiner.bankArea.contains(p.getLocation());
    }

    public boolean atMine() {
        return artificialMiner.mineArea.contains(p.getLocation());
    }

    @Override
    public void run() {
        if (artificialMiner.banking == true) {
            if (atMine() && Inventory.isFull() && artificialMiner.banking) {
                while (Calculations.distanceTo(bankTile) > Random.nextInt(4, 7)) {
                    Walking.walkTo(bankTile);
                }
            }
            if (atBank() && Inventory.isFull()) {
                if (Bank.isOpen()) {
                    Bank.deposit(drop, 28);
                    Time.sleep(Random.nextInt(100, 200));
                } else {
                    Bank.open();
                }
            }
        }
    }

    @Override
    public boolean isActive() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
