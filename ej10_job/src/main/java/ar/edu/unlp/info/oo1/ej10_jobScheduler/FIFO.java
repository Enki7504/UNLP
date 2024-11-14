package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class FIFO extends JobScheduler{
	public JobDescription next(){
		JobDescription nextJob = jobs.get(0);
        super.unschedule(nextJob);
        return nextJob;
	}
}
