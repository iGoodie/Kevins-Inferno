package stages;

import controllers.StageController;

public class InitialStage implements IStage
{
	public int getID() { return 0; }
	
	public InitialStage() {}
	
	public void update(int dt) {}
	
	public void updateTick() { StageController.changeStage(new MenuStage()); }
	
	public void render() {}

	public void handleKeyRelease(char key, int keyCode){}
	
	public void handleMousePressed(int layerClicked, int mouse, int x, int y){}
	
	public void dispose() {}
}
