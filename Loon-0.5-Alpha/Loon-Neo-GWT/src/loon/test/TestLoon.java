package loon.test;

import loon.EmulatorListener;
import loon.LSystem;
import loon.LTexture;
import loon.LTextureBatch;
import loon.Screen;
import loon.action.avg.AVGDialog;
import loon.event.GameTouch;
import loon.event.Updateable;
import loon.font.LFont;
import loon.html5.gwt.GWTGame.GWTSetting;
import loon.html5.gwt.GWTProgressDef;
import loon.html5.gwt.Loon;
import loon.opengl.GLEx;
import loon.opengl.LSTRFont;
import loon.stage.ImagePlayer;
import loon.stage.Player;
import loon.stage.Stage;
import loon.stage.StageSystem;
import loon.utils.processes.RealtimeProcess;
import loon.utils.timer.LTimerContext;

public class TestLoon extends Loon {

	public static class ScreenTest extends Screen implements EmulatorListener {

		public Stage newStage1() {

			Stage stage = new Stage() {

				@Override
				public void onAdded() {

					addPlayer(new ImagePlayer("back1.png"));

					Player player = createTextPlayer(LFont.getFont(30),
							"ABCDE");
					player.setLocation(55,155);
					addPlayer(player);
				}

				@Override
				public void onRemoved() {

				}

				@Override
				public void onShowTransitionCompleted() {
remove(this);
				}

				@Override
				public void onHideTransitionStarted() {

				}
			};

			return stage;
		}

		// LTexture texture = loadTexture("loon_wbar.png");

		public void onLoad() {

			puspStage(newStage1());

		}

		@Override
		public void draw(GLEx g) {
	
			/*
			 * if (text2 == null) { // Image image
			 * =Image.createImage("loon_wbar.png");
			 * 
			 * text2 = AVGDialog.getRMXPDialog("w6.png", 400, 400); }
			 * g.draw(text2, 0, 0);
			 */
			/*
			 * g.setColor(LColor.red); g.drawLine(55, 55, 112, 112);
			 * g.resetColor();
			 * 
			 * g.draw(texture, 66, 66);
			 */
			// if (batch == null) {
			// batch = new LTextureBatch(text2);
			// }
			// batch.begin();
			// batch.draw(55, 55);
			// batch.end();
			// g.draw(text2,66,66,100,100,270);
			// g.translate(200, 200);
			// g.drawString("中国人民", 66, 66);
			// g.translate(-200, -200);

			/*
			 * if (text2 == null) { text2 = texture.copy(240, 240, 43, 43); } if
			 * (batch == null) { batch = new LTextureBatch(text2); }
			 * batch.begin(); batch.draw(155, 155); batch.end();
			 */
			// if(!flag){
			/*
			 * flag=true; Canvas canvas =
			 * LSystem.base().graphics().createCanvas(400, 400);
			 * canvas.setColor(LColor.red); canvas.setAlpha(1f);
			 * canvas.fillRect(0, 0, 400, 400);
			 * 
			 * if(batch==null){ batch=new LTextureBatch(canvas.toTexture()); }
			 * batch.begin(); batch.draw(33, 33); batch.end();
			 */
			// }
			// if(!flag){
			// flag=true;
			// font.startChar();
			// if(!flag){
			// flag=true;
			// g.translate(255, 155);
			// g.drawString("中国人民", 66, 66);
			// g.translate(-255, -155);
			// g.restoreTx();
			// }
			// font.stopChar();
			// }
			// if(!flag){
			// g.begin();
			// flag=true;

			// batch.begin();
			// batch.draw(66, 66);
			// batch.draw(166, 166);
			// batch.end();
			// g.initBatch();

		}

		// g.end();
		// g.restoreTx();
		/*
		 * (if(!flag){ flag=true; batch.begin(); batch.draw(66, 66);
		 * batch.draw(166, 166); batch.end(); }
		 */
		@Override
		public void close() {
			// TODO Auto-generated method stub

		}

		@Override
		public void alter(LTimerContext timer) {
			// TODO Auto-generated method stub

		}

		@Override
		public void touchDown(GameTouch e) {
			
		}

		@Override
		public void touchUp(GameTouch e) {

			System.out.println(e.x() + "," + e.y());
			System.out.println("up");
		}

		@Override
		public void touchMove(GameTouch e) {

			System.out.println("move");

		}

		@Override
		public void touchDrag(GameTouch e) {

			System.out.println("drag");

		}

		@Override
		public void resize(int width, int height) {
			// TODO Auto-generated method stub

		}

		@Override
		public void resume() {
			// TODO Auto-generated method stub

		}

		@Override
		public void pause() {

		}

		@Override
		public void onUpClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onLeftClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onRightClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onDownClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTriangleClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onSquareClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCircleClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCancelClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unUpClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unLeftClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unRightClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unDownClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unTriangleClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unSquareClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unCircleClick() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unCancelClick() {
			// TODO Auto-generated method stub
			
		}

	}
	@Override
	public void onMain() {

		GWTSetting setting = new GWTSetting();
		setting.fps = 60;
		// source size
		setting.width = 480;
		setting.height = 320;
		// target size
		setting.width_zoom = 640;
		setting.height_zoom = 480;
		setting.isFPS = false;
		setting.fontName = "黑体";
		setting.rootId = "embed-loon.test.TestLoon";
		//按屏幕缩放比例缩放
		//setting.useRatioScaleFactor = true;
		//当此项开启，并且gwt.xml中设置了loon.addtojs为true,会默认从js中加载资源
		setting.jsloadRes = false;

		//设置一个需要的初始化进度条样式（不填则默认）
	//	setting.progress = GWTProgressDef.newSimpleLogoProcess(setting);
		
		register(setting, new Data() {

			@Override
			public Screen onScreen() {
				return new TitleScreen();
			}
		});

	}

}
