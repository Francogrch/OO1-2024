package ar.edu.unlp.oo1.ejercicio10;

public class LIFO implements Strategy {

  public LIFO() {
  }

  public JobDescription next(JobScheduler js) {
    JobDescription nextJob = null;
    nextJob = js.getJobs().get(js.getJobs().size() - 1);
    js.unschedule(nextJob);
    return nextJob;

  }

}
