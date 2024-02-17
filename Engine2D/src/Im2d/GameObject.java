package Im2d;
import java.util.ArrayList;
import java.util.List;

public class GameObject implements Runnable{
	private String name;
	public Transform transform;
	private List<Component> components = new ArrayList<Component>();
	static Thread th;
	public GameObject(String name){
		this.setName(name);
		transform = new Transform();

	}
	public GameObject(){
		setName("gameObject");
		transform = new Transform();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void update()
	{
		for(Component com : components)
		{
			com.update();
		}
	}
	
	public <T extends Component> T getComponent(Class<T> component)
	{
		for(Component com : components)
		{
			if(component.isInstance(com))
			{
				return component.cast(com);
				
			}
		}
		
		return null;
	}
	public void start()
	{
		if(th == null)
		{
			th = new Thread(this);
			th.start();
		}
		for(Component com : components)
		{
			com.start();
		}
	}
	
	public void addComponent(Component component)
	{
		components.add(component);
	}
	@Override
	public void run() {
		while(th != null)
		{
			long startTime = System.currentTimeMillis();   //-> 60 ~fps
			update();
			long elapsedTime = System.currentTimeMillis() - startTime;
	        long sleepTime = Math.max(0, 16 - elapsedTime); 

	        try {
	            Thread.sleep(sleepTime);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}
	}

}
