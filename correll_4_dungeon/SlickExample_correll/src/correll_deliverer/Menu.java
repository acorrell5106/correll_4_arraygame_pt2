package correll_deliverer;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Menu extends BasicGameState {

    private StateBasedGame game;
    public Image startimage;
    public Menu(int xSize, int ySize) {

    }

    public void init(GameContainer container, StateBasedGame game)

            throws SlickException {
    	startimage = new Image("res/deliverer.png");
        this.game = game;

    }


    public void render(GameContainer container, StateBasedGame game, Graphics g)

            throws SlickException {
        startimage.draw();

    }

    public void update(GameContainer container, StateBasedGame game, int delta)

            throws SlickException {

    }

    public int getID() {

        return 0;

    }



    @Override

    public void keyReleased(int key, char c) {

        switch (key) {

            case Input.KEY_1:

                game.enterState(1, new FadeOutTransition(Color.white), new FadeInTransition(Color.white));
                
                break;

            case Input.KEY_2:
                    
                break;

            case Input.KEY_3:

                break;

            default:

                break;

        }
    }
}