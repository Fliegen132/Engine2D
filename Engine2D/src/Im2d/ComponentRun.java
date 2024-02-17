package Im2d;

public class ComponentRun implements Component{
	
	@Override
	public void start()
	{
		System.out.println("T");
	}
	@Override
	public void update() {

		Run();
	}
	public void Run()
	{
		System.out.println("ЯБегу");
	}
}
