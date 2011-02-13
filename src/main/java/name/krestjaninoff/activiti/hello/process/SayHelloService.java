package name.krestjaninoff.activiti.hello.process;

import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
	
	public void printMessageA(ActivityExecution execution) {
		System.out.println("Hello world: variant A");
	}
	
	public void printMessageB(ActivityExecution execution) {
		System.out.println("Hello world: variant B");
	}
}
