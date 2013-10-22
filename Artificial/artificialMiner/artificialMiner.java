package artificialMiner;

import artificialMiner.nodes.*;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.Manifest;
import org.shadowbot.bot.api.ShadowScript;
import org.shadowbot.bot.api.SkillCategory;
import org.shadowbot.bot.api.listeners.PaintListener;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.wrapper.Area;
import org.shadowbot.bot.api.wrapper.Tile;

import java.awt.*;

/**
 * User: Pen
 * Edit: Please Scroll Down & Find your Rock & Fill it with Rock ID'S And Ore ID
 */
@Manifest(author = "Calle", category = SkillCategory.MINING, description = "Mines Everything", scriptname = "ArtificialMiner")

public class artificialMiner extends ShadowScript implements PaintListener {
    public static int[] toMine;
    public static String toMines;
    public static int drop;
    public static boolean guiStart = true;
    static Tile bankTile;
    static Tile mineTile;
    static Area bankArea;
    static Area mineArea;
    static boolean banking;
    private final Job[] jobs = {new antiban(), new mine(), new artificialMiner.nodes.drop(), new bank()};
    Gui2 g = new Gui2();

    @Override
    public void onStop() {
    }

    @Override
    public void onStart() {
        g.setVisible(true);
        while (guiStart) ;
        sleep(Random.nextInt(80, 1000));
    }

    @Override
    public int loop() {
        try {
            for (Job job : this.jobs)
                if (job.isActive()) {
                    job.run();
                    return Random.nextInt(125, 150);
                }
        } catch (Exception e) {
        }

        return Random.nextInt(153, 491);
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("Simple Miner :)", 100, 200);
    }
}

