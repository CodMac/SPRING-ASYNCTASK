package zqit.async.pulgins.async.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class DemoBTask {

	@Async
    public void startMyTreadTask() {
        System.out.println("this is my async task: demoA");
    }
	
}
