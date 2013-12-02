package uj.memory.core;

import uj.memory.core.finish.FinishScreen;
import uj.memory.core.game.GameScreen;
import uj.memory.core.intro.IntroScreen;
import uj.memory.core.menu.MenuScreen;

import com.badlogic.gdx.Game;

public class Memory extends Game {
	private IntroScreen introScreen;
	private MenuScreen menuScreen;
	private GameScreen gameScreen;
	private FinishScreen finishScreen;

	@Override
	public void create () {
		setScreen(introScreen);
	}

	public IntroScreen getIntroScreen() {
		if(introScreen == null)
			introScreen = new IntroScreen();
		return introScreen;
	}

	public MenuScreen getMenuScreen() {
		if(menuScreen == null)
			menuScreen = new MenuScreen();
		return menuScreen;
	}

	public GameScreen getGameScreen() {
		if(gameScreen == null)
			gameScreen = new GameScreen();
		return gameScreen;
	}

	public FinishScreen getFinishScreen() {
		if(finishScreen == null)
			finishScreen = new FinishScreen();
		return finishScreen;
	}
}
