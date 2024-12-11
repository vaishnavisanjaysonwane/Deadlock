## Deadlock 
###### I am calling `join()` on the same thread that is executing the `join()` method. This results in a deadlock because the thread ends up waiting for itself to complete its execution.
When a thread calls its own join() method, it causes a deadlock, as the thread ends up waiting for itself to finish execution, which can never happen because it's blocked by the join() call.

