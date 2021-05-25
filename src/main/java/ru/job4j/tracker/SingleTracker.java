package ru.job4j.tracker;

public final class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    private SingleTracker() { }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return findAll();
    }

    public Item[] findByName(String key) {
        return findByName(key);
    }

    private int indexOf(int id) {
        return indexOf(id);
    }

    public boolean replace(int id, Item item) {
        return replace(id, item);
    }

    public boolean delete(int id) {
        return delete(id);
    }
}
