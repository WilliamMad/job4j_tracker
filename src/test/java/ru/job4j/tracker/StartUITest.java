package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ShowAllAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is ("Menu." + System.lineSeparator() + "0. Show all items" + System.lineSeparator()
        + "1. Exit" + System.lineSeparator() + "=== Show all items ====" + System.lineSeparator()
        + "Хранилище еще не содержит заявок" + System.lineSeparator() + "Menu." + System.lineSeparator() + "0. Show all items" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Test", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Test"));
    }

    @Test
    public void whenEditItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), item.getName(), "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is("Replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindNameItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item"));
        Input in = new StubInput(
                new String[]{"0", item.getName(), "1"}
        );
        UserAction[] actions = {
                new FindNameAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("=== Find by name ====" + System.lineSeparator() +
                item + System.lineSeparator()));
    }

    @Test
    public void whenFindIdItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Find item by id" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator() + "=== Find by id ====" + System.lineSeparator() + item + System.lineSeparator() + "Menu."
                + System.lineSeparator() + "0. Find item by id" + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }

}
