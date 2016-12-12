package tpe.thread.cancel;

import java.awt.Graphics;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.image.StripedImage;

/**
 * Ein Ufo.
 */
public class Ufo extends AnimatedImage implements Runnable
{

    /** X-Position des Ufos. */
    private int x;

    /** Y-Position des Ufos. */
    private int y;

    /** Zeit, die das Ufo schlafen soll, before es sich weiterbewegt. */
    private int sleepTime;

    /** Das zugehörige Spielfeld. */
    private Board board;

    /**
     * Legt ein neues Ufo an.
     *
     * @param board das Spielfeld.
     * @param x die X-Position für den Start.
     * @param y die Y-Position für den Start.
     * @param sleepTime Zeit, die das Ufo schlafen soll,
     *          before es sich weiterbewegt.
     */
    public Ufo(Board board, int x, int y, int sleepTime) {
        super(50, false, "assets", "spaceship");
        this.x = x;
        this.y = y;
        this.sleepTime = sleepTime;
        this.board = board;
    }

    /**
     * Zeichnet das Ufo.
     *
     * @param g Grafik-Kontext.
     */
    public void draw(Graphics g) {
        super.draw(g, new Point(x, y), null);
    }

    /**
     * Let the Ufo explode.
     */
    public void explode() {
        this.images = new StripedImage("assets/explosion", 43);
        this.images.setWrapAround(false);
    }

    @Override
    public void run()
    {
        while (x < board.getWidth())
        {
            try
            {
                x++;
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException e)
            {
                explode();
                return;
            }
        }
    }
}
