package ar.edu.unlp.oo1.ejercicio10;

public class HighestPriority implements Strategy {

  public HighestPriority() {
  }

  public JobDescription next(JobScheduler js) {
    JobDescription nextJob = null;
    nextJob = js.getJobs().stream()
        .max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
        .orElse(null);
    js.unschedule(nextJob);
    return nextJob;
  }

}
