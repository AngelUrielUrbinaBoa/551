package  {
	import flash.display.MovieClip;
	public class setup extends MovieClip {
		
private var piso_new: piso = new piso();
private var Protagonista_new: Protagonista = new Protagonista();
private var Antagonista_new: Antagonista = new Antagonista();

		public function setup() {
			// constructor code
			addChild (piso_new);
			addChild (Protagonista_new);
			addChild (Antagonista_new);
			piso_new.y = 388;
			piso_new.x = 275;
			
			Protagonista_new.y = 350;
			Protagonista_new.x = 275;
			
			Antagonista_new.y = 80;
			Antagonista_new.x = 275;
		}

	}
	
}
