public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        int i;
        for (i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Ошибка!");
            } else callback.onDone("Task " + i + " is done");

        }
    }
}



