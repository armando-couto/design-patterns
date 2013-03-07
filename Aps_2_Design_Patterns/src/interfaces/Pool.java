package interfaces;

public interface Pool<T> {

	T acquire();
	void release(T t);
}
