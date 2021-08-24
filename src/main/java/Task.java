public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        isDone = true;
    }

    public void markUndone() {
        isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public abstract String formatSave();

    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }
}