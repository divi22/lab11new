package lab11;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FileProgram {

	public static void main(String[] args) {
		Executor executor=Executors.newSingleThreadExecutor();
		CopyThread cdt=new CopyThread();
		executor.execute(cdt);

	}

}
