package cains.note.pattern;

public interface IObservable
{
	void addObserver(IObserver obj);
	void removeObserver(IObserver obj);
	void doNotify();
}
