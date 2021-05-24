package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String msg) {
    }

    public static class FindEl {
            public static int indexOf(String[] value, String key) throws ElementNotFoundException {
                for (int i = 0; i < value.length; i++) {
                    if (key.equalsIgnoreCase(value[i])) {
                        return i;
                    }
                }
                throw new ElementNotFoundException("Element not found");
            }
        }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"one", "two", "three"}, "four");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

