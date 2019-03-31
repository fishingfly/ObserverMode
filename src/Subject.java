/**
 * @Auther: user
 * @Date: 2019/3/31 15:11
 * @Description:
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
