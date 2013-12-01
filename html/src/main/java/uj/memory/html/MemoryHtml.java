package uj.memory.html;

import uj.memory.core.Memory;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class MemoryHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Memory();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
