package ar.edu.unlp.oo1.ejercicio10;

public class MostEffort implements Strategy {

  public MostEffort() {
  }

  public JobDescription next(JobScheduler js) {
    JobDescription nextJob = null;
    nextJob = js.getJobs().stream()
        .max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
        .orElse(null);
    js.unschedule(nextJob);
    return nextJob;
  }

}
