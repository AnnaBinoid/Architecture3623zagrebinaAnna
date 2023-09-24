package hw01.InMemoryModel;
// interface or model changing (интерфейс смены модели)

public interface IModelChanger {
    public void notifyChange (IModelChanger sender);
}
