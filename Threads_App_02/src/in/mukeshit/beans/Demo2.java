package in.mukeshit.beans;

public class Demo2 {
	public static void main(String[] args) {
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
			for(int i=21;i<=30;i++)	{
				System.out.println(i);
			}
			}
			
		};
		runnable.run();
	}

}
