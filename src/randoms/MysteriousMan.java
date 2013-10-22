package dynamic.randoms;

import org.shadowbot.bot.api.RandomEvent;
import org.shadowbot.bot.api.methods.input.Mouse;
import org.shadowbot.bot.api.methods.interactive.NPCs;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;
import org.shadowbot.bot.api.wrapper.NPC;
import org.shadowbot.bot.api.wrapper.Widget;
import org.shadowbot.bot.api.wrapper.WidgetChild;

/**
 * User: Pen
 */
public class MysteriousMan extends RandomEvent {

    @Override
    public String getName() {
        return "Mysterious Old Man";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getAuthor() {
        return "Calle";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int solve() {
        NPC dude = NPCs.getNearest(new int[]{4660});
        if (dude.isOnScreen()) {
            dude.interact("Talk to");
            Time.sleep(Random.nextInt(100, 150));
            Widgets.canContinue();
            Widgets.clickContinue();

        }
        return Random.nextInt(100, 150);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isActive() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
