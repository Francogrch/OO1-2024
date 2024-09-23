package ar.edu.unlp.oo1.ejercicio10;

public class FIFO implements Strategy {

  public FIFO() {
  }

  public JobDescription next(JobScheduler js) {
    JobDescription nextJob = null;
    nextJob = js.getJobs().get(0);
    js.unschedule(nextJob);
    return nextJob;

  }
}
